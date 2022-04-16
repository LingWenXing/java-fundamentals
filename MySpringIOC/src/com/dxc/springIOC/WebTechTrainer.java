package com.dxc.springIOC;

import org.springframework.stereotype.Component;

@Component
public class WebTechTrainer implements Trainer {
	public String getDailyTrainingSession(){
		return "Creating multiple websites will make things easier";
	}
}
