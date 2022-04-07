package com.anyquiz.quizmaker.payload;

import java.util.Map;

public class Attempts {

	Map<String, String> optionList;

	public Attempts(Map<String, String> optionList) {
		super();
		this.optionList = optionList;
	}

	public Map<String, String> getOptionList() {
		return optionList;
	}

	public void setOptionList(Map<String, String> optionList) {
		this.optionList = optionList;
	}

}
