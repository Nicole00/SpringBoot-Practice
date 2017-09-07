package com.wcy.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by wangchangyuan on 2017/9/4.
 */
@Entity
@Component
@ConfigurationProperties(prefix = "model")
public class ModelEntity {
    @Id
    @GeneratedValue
    private Integer task_id;
    private String task_name;
    private Integer algo_id;

    public ModelEntity() {
    }

    public int getTaskID(){
        return task_id;
    }
    public void setTaskID(int id){
        this.task_id = id;
    }

    public String getTaskName(){
        return task_name;
    }
    public void setTaskName(String name){
        this.task_name = name;
    }

    public int getAlgoID(){
        return algo_id;
    }
    public void setAlgoID(int algoID){
        this.algo_id = algoID;
    }
    public String toString(){
        return "task_id is ： " + task_id +
                ",     task_name is: " + task_name + "\n";
    }
}
