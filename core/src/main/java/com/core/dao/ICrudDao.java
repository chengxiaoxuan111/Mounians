package com.core.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.core.po.BaseEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ICrudDao<T extends BaseEntity> extends BaseMapper<T> {

    /**
     * 一般要是用动态sql语句查询
     * @param entity
     * @return
     */
    public List<T> selectByPage(T entity);

}
