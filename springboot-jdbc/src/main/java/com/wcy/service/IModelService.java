package com.wcy.service;

import com.wcy.entity.ModelEntity;

import java.util.List;

/**
 * Created by wangchangyuan on 2017/9/4.
 */
public interface IModelService {

    public void insert(ModelEntity record);

    public void update(ModelEntity record);

    public void delete(Integer id);

    public List<ModelEntity> select();

    public ModelEntity selectById(Integer id);
}
