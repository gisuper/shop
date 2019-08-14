package com.yx.item.service;

import com.yx.item.mapper.CategoryMapper;
import com.yx.item.pojo.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by yangxiong on 2019/8/14.
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> queryCategoryByPid(long pid){

        Category t = new Category();
        t.setParentId(pid);
        List<Category> select = categoryMapper.select(t);

        return select;

    }
}
