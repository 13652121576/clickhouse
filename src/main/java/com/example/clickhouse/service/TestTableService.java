package com.example.clickhouse.service;

import com.example.clickhouse.entity.TestTableEntity;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;


public interface TestTableService extends IService<TestTableEntity>{

    /**
     * 分页查询
     * @param page 第几页
     * @param pageSize 每页条数
     * @return Page
     */
    Page<TestTableEntity> list(Integer page, Integer pageSize);

    /**
     * 按id删除
     * @param id
     */
    void deleteById(Integer id);
}
