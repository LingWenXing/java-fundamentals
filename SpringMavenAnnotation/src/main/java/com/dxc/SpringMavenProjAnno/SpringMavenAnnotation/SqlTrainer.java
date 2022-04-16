package com.dxc.SpringMavenProjAnno.SpringMavenAnnotation;

import org.springframework.stereotype.Component;

@Component
public class SqlTrainer implements Trainer {
	
	public String getDailyTrainingSession(){
		return "SQL Query";
	}
}
