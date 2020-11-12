package com.example.clickhouse.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 实体类
 */
@TableName("test_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TestTableEntity {

    private Long id;

    private String name;

    private String value;

    private Date createDate;

    private Object array;
}


