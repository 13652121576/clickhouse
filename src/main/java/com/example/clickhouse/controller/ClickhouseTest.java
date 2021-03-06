package com.example.clickhouse.controller;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.example.clickhouse.entity.TestTableEntity;
import com.example.clickhouse.service.TestTableService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Clickhouse增删改查测试
 */
@RestController
@RequestMapping("/clickhouse")
@Slf4j
public class ClickhouseTest {
    private static final Logger log = LoggerFactory.getLogger(ClickhouseTest.class);

    @Autowired
    TestTableService testTableService;

     @ApiOperation(value = "clickhouse按id删除数据", notes = "删除测试", httpMethod = "DELETE")
     @ApiImplicitParams({
     @ApiImplicitParam(name = "id", value = "id", dataType = "Integer"),
     })
     @DeleteMapping
     public void delete(@RequestParam("id") Integer id) {
     testTableService.deleteById(id);
     }

     /**
      * 分页查询
      * @return
     */
    @ApiOperation(value =  "clickhouse分页测试", notes = "分页测试" ,httpMethod = "GET")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "第几页", dataType = "Integer"),
            @ApiImplicitParam(name = "page_size", value = "每页大小", dataType = "Integer")
    })
    @GetMapping("/list")
    public Object list(@RequestParam(value = "page",defaultValue = "1") Integer page,
                       @RequestParam(value = "page_size",defaultValue = "10") Integer pageSize) {
        List<TestTableEntity> list = testTableService.list();
        log.info(JSON.toJSONString(list));
        return testTableService.list(page, pageSize);
    }


}

