package com.example.clickhouse.service.impl;

import com.example.clickhouse.entity.TestTableEntity;
import com.example.clickhouse.mapper.TestTableMapper;
import com.example.clickhouse.service.TestTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;


@Service
public class TestTableServiceImpl extends ServiceImpl<TestTableMapper, TestTableEntity> implements TestTableService {

    @Autowired
    private TestTableMapper testTableMapper;

    @Override
    public Page<TestTableEntity> list(Integer page, Integer pageSize) {
//        return this.page(new Page<TestTableEntity>(page,pageSize),
//                new QueryWrapper<TestTableEntity>());
        Page<TestTableEntity> pages = new Page<>();
        pages.setTotal(testTableMapper.selectCount(new QueryWrapper<TestTableEntity>()));
        pages.setRecords(testTableMapper.selectPages(page, pageSize));
        return pages;
    }

    /**
     * 按id删除
     * @param id
     */
    @Override
    public void deleteById(Integer id) {
        testTableMapper.deleteById(id);
    }
}

