package com.example.clickhouse.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.clickhouse.entity.TestTableEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TestTableMapper extends BaseMapper<TestTableEntity> {

    /**
     *  分页查询
     * @param page
     * @param pageSize
     * @return
     */
    @Select("select * from test_table tt limit #{page}, #{pageSize}")
    List<TestTableEntity> selectPages(Integer page, Integer pageSize);

    /**
     * 按id数组数据删除数据
     */
    @Delete("ALTER TABLE test_table DELETE WHERE id = #{id}")
    void deleteById(Integer id);
}
