package com.ilm.model;

public class Message {
	
	/*public Message(String text) {
		this.text = text;
	}*/

	public Message(String text, String leftText, String rightText) {
		
		this.text = text;
		this.leftText = leftText;
		this.rightText = rightText;
	}

	private String text;
	private String leftText;
	private String rightText;
	

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getLeftText() {
		return leftText;
	}

	public void setLeftText(String leftText) {
		this.leftText = leftText;
	}

	public String getRightText() {
		return rightText;
	}

	public void setRightText(String rightText) {
		this.rightText = rightText;
	}

}