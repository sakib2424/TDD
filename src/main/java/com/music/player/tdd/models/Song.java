package com.music.player.tdd.models;

import java.time.Duration;

public class Song {
	private String title;
	private String artist;
	private int length;
	
	public Song() {
		
	}
	
	public Song(String title, String artist, int length) {
		super();
		this.title = title;
		this.artist = artist;
		this.length = length;
	}
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return this.artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

	public String getDurationPretty() {

		return null;
	}

}
