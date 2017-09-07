package com.wcy.dao.impl;

import com.wcy.dao.IModelDAO;
import com.wcy.entity.ModelEntity;
import com.wcy.service.impl.ModelService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
/**
 * Created by wangchangyuan on 2017/9/4.
 */
public class ModelDAO implements IModelDAO {
    @Autowired
    ModelService model = new ModelService();
    @Override
    public void insert(ModelEntity record){
        model.insert(record);
    }

    @Override
    public void update(ModelEntity record){
        model.update(record);
    }

    @Override
    public void delete(int id){
        model.delete(id);
    }

    @Override
    public List<ModelEntity> select(){
        return model.select();
    }
}
