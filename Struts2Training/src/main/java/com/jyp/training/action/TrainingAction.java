package com.jyp.training.action;

import com.jyp.training.service.TrainingFinderService;
import com.opensymphony.xwork2.ActionSupport;

public class TrainingAction extends ActionSupport {

	private String findTutorials;

	private String language;

	public String getFindTutorials() {
		return findTutorials;
	}

	public void setFindTutorials(String findTutorials) {
		this.findTutorials = findTutorials;
	}
	
	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	@Override
	public String execute() {
		TrainingFinderService trainingService = new TrainingFinderService();
		setFindTutorials(trainingService.getTutorial(getLanguage()));
		return "success";
	}

}
