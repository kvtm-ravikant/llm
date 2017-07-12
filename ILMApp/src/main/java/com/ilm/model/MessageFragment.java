package com.ilm.model;

public class MessageFragment {
	private String firstHalfFragment;
	private String secondHalfFragment;
	
	public MessageFragment (String firstHalfFragment, String secondHalfFragment){
		this.firstHalfFragment = firstHalfFragment;
		this.secondHalfFragment = secondHalfFragment;
	}
	public String getFirstHalfFragment() {
		return firstHalfFragment;
	}
	public void setFirstHalfFragment(String firstHalfFragment) {
		this.firstHalfFragment = firstHalfFragment;
	}
	public String getSecondHalfFragment() {
		return secondHalfFragment;
	}
	public void setSecondHalfFragment(String secondHalfFragment) {
		this.secondHalfFragment = secondHalfFragment;
	}
}
