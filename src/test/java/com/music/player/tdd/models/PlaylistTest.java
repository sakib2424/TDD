package com.music.player.tdd.models;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlaylistTest {
	
	private static Playlist myPlaylist;
	private static List<Song> songs = new ArrayList<Song>(Arrays.asList(
			new Song("Billie Jean","Michael Jackson", 210),
			new Song("I Would Do Anything for Love","Meatloaf", 756),
			new Song("Closer","The Chainsmokers", 244)));


	public void addSongToPlaylistTest() {

	}
	

	public void removeSongFromPlaylistTest() {


	}
	

	public void moveSongTest() {

		
	}
	

	public void getPlaylistDurationTest() {

	}
	

	public void showPlaylistTest() {

	}

}
