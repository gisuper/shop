package  com.yx.common.advise;

import com.yx.common.exception.ShopException;
import com.yx.common.vo.ResponseResult;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * Created by yangxiong on 2019/8/12.
 */
@ControllerAdvice //拦截所有controller
public class ComminExceptionHandler {

    @ExceptionHandler(ShopException.class)
    public ResponseEntity<ResponseResult> handlerException(ShopException e){
        ResponseResult result = new ResponseResult(e.getExceptionEnums());
        return ResponseEntity.status(e.getExceptionEnums().getCode()).body(result);
    }
}
