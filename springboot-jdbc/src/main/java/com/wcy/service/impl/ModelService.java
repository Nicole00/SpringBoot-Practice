package com.wcy.service.impl;

import com.wcy.entity.ModelEntity;
import com.wcy.service.IModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by wangchangyuan on 2017/9/4.
 */
@Service
@SpringBootApplication
@RestController
public class ModelService implements IModelService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insert(ModelEntity record){
        jdbcTemplate.update("insert into modeling_task_info(task_id, task_name) values(?,?)", record.getTaskID(), record.getTaskName());
    }

    @Override
    public void update(ModelEntity record){
        jdbcTemplate.update("UPDATE modeling_task_info SET task_name=? WHERE task_id=?", record.getTaskName(), record.getTaskID());

    }

    @Override
    public void delete(Integer id){
        jdbcTemplate.update("DELETE from modeling_task_info WHERE task_id=?",id);
    }

    @Override
    public List<ModelEntity> select(){
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select task_id, task_name, algo_id from modeling_task_info", new Object[]{});

        List<ModelEntity> result = new ArrayList<ModelEntity>();
        if(list != null && list.size() >0){
            for(int i=0; i<list.size(); i++){
                ModelEntity message = new ModelEntity();
                message.setTaskID((Integer)list.get(i).get("task_id"));
                message.setTaskName((String)list.get(i).get("task_name"));
                message.setAlgoID((Integer)list.get(i).get("algo_id"));
                System.out.println(message.toString());
                result.add(message);
            }
            return result;
        }else{
            ModelEntity r = new ModelEntity();
            r.setTaskID(001);
            r.setTaskName("null");
            r.setAlgoID(001);
            result.add(r);
            return result;
        }

//        ModelEntity m = new ModelEntity();
//        m.setTaskID(2);
//        m.setTaskName("haha");
//        m.setAlgoID(0);
//        return m;
    }

    @Override
    public ModelEntity selectById(Integer id){
        List<Map<String, Object>> list = jdbcTemplate.queryForList("select task_id, task_name, algo_id from modeling_task_info WHERE task_id=?", id, new Object[]{});

        ModelEntity message = new ModelEntity();
        if(list != null && list.size() >0){
                message.setTaskID((Integer)list.get(0).get("task_id"));
                message.setTaskName((String)list.get(0).get("task_name"));
                message.setAlgoID((Integer)list.get(0).get("algo_id"));
                System.out.println(message.toString());
            return message;
        }else {
            return null;
        }
    }
}
