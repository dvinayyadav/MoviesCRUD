package Lisnify;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Album album1=new Album("Motivational","Kulkurni");
		album1.AddingSongInAlbum("ASHA PASHAM",4.00);
		album1.AddingSongInAlbum("Ismart Shankar", 4.56);
		album1.AddingSongInAlbum("Shyam Shinga ROy",5.12);
		System.out.println("1st Album");
		System.out.println(album1.songs);
	
		System.out.println("\n \n \n \n");
		Album album2=new Album("Vintage","Bala Subramanyam");
		album2.AddingSongInAlbum("Priyatama",3.56);
		album2.AddingSongInAlbum("Muvvala Navvakala",4.25);
		album2.AddingSongInAlbum("Priya Ragale", 4.23);
		System.out.println("2st Album");
		System.out.println(album2.songs);
		System.out.println("\n \n \n \n");
		
		Album album3=new Album("Devotional","Chinna");
		album3.AddingSongInAlbum("Vakratundaya",4.00);
		album3.AddingSongInAlbum("Ohm Ganganpati", 4.56);
		album3.AddingSongInAlbum("Sri Anjaneyam",5.12);
		
		
	System.out.println("3rd Album");
	System.out.println(album3.songs);
		System.out.println("CREATED PLAYLIST");
		LinkedList<Song> playList=new LinkedList<>();
		playList.add(album1.songs.get(0));
		playList.add(album2.songs.get(1));
		playList.add(album3.songs.get(2));
		for(Song ss:playList)
		System.out.println(ss);
		
		runPlayList(playList);
		

	}
	public static void runPlayList(LinkedList<Song> playlist) {
		PrintMenu();
		Scanner scanner=new Scanner(System.in);
		
		ListIterator<Song> listIterator=playlist.listIterator();
		System.out.println("Intially playing the 1st song\n+"
				+ listIterator.next().toString());
		boolean forward=true;
		int quit=1;
		while(quit!=0) {
			
	int selection=scanner.nextInt();
		if(selection==1) {
			if(forward==false) {
				listIterator.next();
				forward=true;
			}
			if(listIterator.hasNext()) {
				System.out.println(listIterator.next().toString());
			}
			else {
				System.out.println("You are on the Last Song in the list");
				
			}
		}
			else if (selection==2) {
				
			if( forward ==true) {
				listIterator.hasPrevious();
				forward=false;
			}
			if(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous().toString());
			}
			else {
				System.out.println("this is the first song in the playlist");
				
			}
			}
			else if (selection==3) {
			if(forward==true) {
				System.out.println(listIterator.previous().toString());
				forward=false;
			}
			else {
				System.out.println(listIterator.next().toString());
			}
			}
			else if (selection==4) {
		    displayingAllSongs(playlist);
		   
			}
			else if (selection==5) {
			PrintMenu();
			}
			else if (selection==6) {
			listIterator.remove();
			displayingAllSongs(playlist);
			}
			else if(selection==0) {
				quit=0;
			}
			}
		}
		
	private static void displayingAllSongs(LinkedList<Song> playlist) {
	   for(Song ss:playlist) {
		   System.out.println(ss.toString());
	   }
		
	}
	public static void PrintMenu() {
		System.out.println("Type 1 to 6 to achieve respective function");
		System.out.println("\n"
				+"Type 0 : to Quit \n"
				+ "Type 1 : to play the next song \n"
				+ "Type 2 : to play the previous song \n"
				+ "Type 3 : to repeat the current song\n"
				+ "Type 4 : to display the songs list\n"
				+ "Type 5 : to Print all the available options\n"
				+ "Type 6 : to Delete the current song from the playlist");
	}

}
