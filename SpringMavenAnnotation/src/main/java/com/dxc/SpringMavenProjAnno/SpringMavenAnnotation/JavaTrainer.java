package com.dxc.SpringMavenProjAnno.SpringMavenAnnotation;

import org.springframework.stereotype.Component;

@Component
public class JavaTrainer implements Trainer {
	public String getDailyTrainingSession(){
		return "Practice and execute Java programs everyday";
	}
}
