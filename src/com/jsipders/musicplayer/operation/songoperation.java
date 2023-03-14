package com.jsipders.musicplayer.operation;

import java.util.ArrayList;
import java.util.Scanner;

import com.jsipders.musicplayer.entity.*;

public class songoperation {
	
	Scanner sc=new Scanner (System.in);

	ArrayList<song>songsList=new ArrayList<>();
	
	public void addsongs() {
		System.out.println("how many songs you want to add?");
		int Count=sc.nextInt();
		
		for(int i=1; i<=Count; i++) {
			
			song song =new song();
			
			System.out.println("enter the song id");
			int id=sc.nextInt();
			song.setId(id);
					
			System.out.println("enter the song Name");
			String songName=sc.next();
			song.setSongName(songName);
					
			System.out.println("enter the singer Name");
			String singerName=sc.next();
			song.setSingerName(singerName);
					
			System.out.println("enter the Movie Name");
			String movieName=sc.next();
			song.setSingerName(singerName);
			
			System.out.println("enter the composer of song");
			String composer=sc.next();
			song.setComposer(composer);
					
			System.out.println("enter the lyricist of song");
			String lyricist=sc.next();
			song.setLyricist(lyricist);
					
			System.out.println("enter the song length");
			String length=sc.next();
			song.setLength(length);
			
			songsList.add(song);
			
			System.out.println(song.getSongName()+"is added to playlist sucessfully");
			
			System.out.println("\n----------------------------");
		}
		System.out.println("noww play the song you want");
		ChooseSongToPlay();
	}

	public void ChooseSongToPlay() {
		
		if(songsList.isEmpty()) {
			System.out.println("playlist is Empty..");
			addsongs();
		}
		else {
			  System.out.println("Choose song ID to play.\n"+ songsList);
			  int songID=sc.nextInt()-1;
			  System.out.println(""+songsList.get(songID)+""+" is playing now...");
		}
	}
	 public void playallSongs() {
		 for(int i=0; i<songsList.size(); i++) {
			 System.out.println(""+songsList.get(i)+""+"is Playing Now..");
			 
			 System.out.println("\n-----------------------------");
		 }
	 }
	 public void playRandomSong() {
		 int n=(int) Math.random();
		 for(int i=n; i<songsList.size(); i++) {
			 System.out.println(""+songsList.get(i)+""+"is Playing Now..");
			 
			 System.out.println("\n-----------------------------");		
		 }
	 }
	 public void removeSong() {
		 System.out.println("Choose song ID to Remove\n" +songsList);
		 
		 int songID =sc.nextInt()-1;
		 
			 System.out.println(""+songsList.remove(songID)+"" +"is Removed Succesfully" );
			 
			 System.out.println("\n-----------------------------");
	 }
	 public void editSong() {
			
			if(songsList.isEmpty()) {
				System.out.println("playlist is Empty..");
				addsongs();
			}
			else {
				  System.out.println("Choose song ID to play.\n"+ songsList);
				  int songID=sc.nextInt()-1;
				  System.out.println(""+songsList.get(songID)+""+" is playing now...");
			}
	 
		
	}

}
