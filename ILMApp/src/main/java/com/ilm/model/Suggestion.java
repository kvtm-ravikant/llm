package com.ilm.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "suggestion_master_table")
public class Suggestion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@Column(name = "question_id")
	private Integer questionId;

	@Column(name = "option_id")
	private Integer optionId;

	@Column(name = "level_id")
	private Integer levelId;

	@Column(name = "suggestion")
	private String suggestion;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getQuestionId() {
		return questionId;
	}

	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}

	public Integer getOptionId() {
		return optionId;
	}

	public void setOptionId(Integer optionId) {
		this.optionId = optionId;
	}

	public Integer getLevelId() {
		return levelId;
	}

	public void setLevelId(Integer levelId) {
		this.levelId = levelId;
	}

	public String getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

	@Override
	public String toString() {
		return "Suggestion [id=" + id + ", questionId=" + questionId + ", optionId=" + optionId + ", levelId=" + levelId
				+ ", suggestion=" + suggestion + "]";
	}

	
}