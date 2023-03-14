package com.jsipders.musicplayer.main;

import com.jsipders.musicplayer.operation.*;
import java.util.Scanner;

import com.jsipders.musicplayer.entity.*;

public class multiplayer {

	     static  songoperation songOperation =new songoperation();
	     static boolean loop=true;
	     private static song song;
	     
	     public static void main(String[] args) {
	    	 while(loop) {
	    	           menu();
	    	           
	    	 }
	     }
	     

		private static com.jsipders.musicplayer.entity.song menu() {
		      System.out.println("********MENU*********");
		      System.out.println("\n please select Menu option:"
		    		              +"\n 1.Add or Remove Song"
		    		              +"\n 2.Play Song"
		    		              +"\n 3.Edit song"
		    		              +"\n 4.Exit");
		      
		      try(Scanner sc=new Scanner (System.in)){
		    	  
		    	  int choice =sc.nextInt();
		    	  
		    	  switch(choice) {
		    	  case 1:{
		    		  System.out.println("please select option:\n1.Add song"+"n2.remove song");
		    		  
		    		  int option = sc.nextInt();
		    				  switch(option) {
		    				  case 1:{
		    					  songOperation.addsongs();
		    					  menu();
		    					  break;
		    				  }
		    				  case 2:{
		    					  songOperation.removeSong();
		    					  menu();
		    					  break;
		    				  }
		    				  default:
		    					  throw new IllegalArgumentException("invalid Choice:");
		    							  
		    					  
		    				  }
		    				  break;
		    	              }
		    	  
		    	  case 2: {
				      System.out.println("please select option:\n1.Choose Song\n"
				    		              +"\n 2.Play Song\n"
				    		              +"\n 3.Edit song\n"
				    		              +"\n 4.GO Back");
				    	  
				    	  int option =sc.nextInt();
				    	  
				    	  switch(option) {
				    				  case 1:{
				    					  songOperation.ChooseSongToPlay();
				    					  menu();
				    					  break;
				    				  }
				    				  case 2:{
				    					  songOperation.playallSongs();
				    					  menu();
				    					  break;
				    				  }
				    				  case 3:{
				    					  songOperation.playRandomSong();
				    					  menu();
				    					  break;
				    				  }
				    				  case 4:{
				    					       System.out.println("exit from playlist.");
				    					         menu();
				    					       break;
				    				  }
				    				  
				    				  default:
				    					  throw new IllegalArgumentException("unexpected value:");
				    							  
				    					  
				    				  }
				    				  break;
				    	          
		    				  }
		    	  case 4:{
		    		  System.out.println("Exit from playlist...");
		    		  menu();
		    		  break;
		    	  }
		    	  
		    	  default:
		    		  throw new IllegalArgumentException("invalid choice "+choice);
		    				  
		    	  }
		      }
		      return song;
		}
}
		    	
		    		              
		    		      
		    		                 
		    		                     
		    		  
		    		                         
			
		
	     
	     
	     
