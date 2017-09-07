package com.wcy.web;

import com.wcy.entity.ModelEntity;
import com.wcy.service.IModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
/**
 * Created by wangchangyuan on 2017/9/4.
 */
@RestController
public class ModelController {
    @Autowired
    IModelService modelService;

    //向数据库中插入数据
    @RequestMapping(value="/insert", method=RequestMethod.PUT)
    public void insertModel(@PathVariable("record")ModelEntity record){
        modelService.insert(record);
    }

    //根据task_id 从数据库删除数据
    @RequestMapping(value="/delete", method=RequestMethod.DELETE)
    public void deleteModel(@PathVariable("id") Integer id){
        modelService.delete(id);
    }

    //更新数据

    @PutMapping(value = "/model/{id}")
    public void updateModel(@PathVariable("task_id")Integer id, @RequestParam(value="task_name", required = true)String name,
                            @RequestParam(value = "algo_id", required = true)Integer algo_id){
        ModelEntity model = new ModelEntity();
        model.setTaskID(id);
        model.setTaskName(name);
        model.setAlgoID(algo_id);
        modelService.update(model);
    }


    //全量数据查询

    @GetMapping(value = "/m")
    public String selectModel(){
        return modelService.select().toString();
    }

    //根据id查询
    @GetMapping(value = "/m/{id}")
    public String getModelById(@PathVariable("task_id")Integer id){
        return modelService.selectById(id).toString();
    }

    //根据id删除记录
    @Transactional
    @DeleteMapping(value = "/model/{id}")
    public String deleteMode(@PathVariable("task_id")Integer id){
        String resu = modelService.selectById(id).toString();
        if(resu == null)
            return "there is no record with task_id = " + id;
        else{
            modelService.delete(id);
            return resu;
        }
    }

    @RequestMapping("/hello")
    public String greetingHello(){
        return "Here we go!";
    }

}
