package com.wcy.dao;

import com.wcy.entity.ModelEntity;

import java.util.List;

/**
 * Created by wangchangyuan on 2017/9/4.
 */
public interface IModelDAO {
    public void insert(ModelEntity record);

    public void update(ModelEntity record);

    public void delete(int id);

    public List<ModelEntity> select();
}
