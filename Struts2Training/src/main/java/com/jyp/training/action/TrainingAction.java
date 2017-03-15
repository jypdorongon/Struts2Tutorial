package com.jyp.training.action;

import com.jyp.training.service.TrainingFinderService;

public class TrainingAction extends AbsAction {

	private String findTutorials;

	public String getFindTutorials() {
		return findTutorials;
	}

	public void setFindTutorials(String findTutorials) {
		this.findTutorials = findTutorials;
	}
	
	
	@Override
	public String execute() {
		TrainingFinderService trainingService = new TrainingFinderService();
		setFindTutorials(trainingService.getTutorial());
		return "success";
	}

}
