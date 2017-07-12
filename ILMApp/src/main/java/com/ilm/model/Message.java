package com.ilm.model;
public class Message{
	public Message(String text){
		this.text = text;
	}
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}