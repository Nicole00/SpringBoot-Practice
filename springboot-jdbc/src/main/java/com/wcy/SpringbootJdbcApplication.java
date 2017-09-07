package com.wcy;

import com.wcy.service.IModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@ComponentScan(basePackages = "com.wcy.*")
@RestController
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
public class SpringbootJdbcApplication {
	@Autowired
	IModelService modelService;

//	@RequestMapping("/update")
//	public String updateModel(@PathVariable("task_id")int id, @RequestParam(value="task_name", required = true)String name,
//							@RequestParam(value = "algo_id", required = true)int algo_id){
//		ModelEntity model = new ModelEntity();
//		model.setTaskID(id);
//		model.setTaskName(name);
//		model.setAlgoID(algo_id);
//		modelService.update(model);
//		return model.toString();
//	}


	public static void main(String[] args) {
		SpringApplication.run(SpringbootJdbcApplication.class, args);
		//System.out.println(modelService.select().toString());
	}
}
