package Lisnify;

import java.util.ArrayList;
import java.util.LinkedList;


public class Album {
	String albumName;
	String artistName;
	ArrayList<Song> songs;
	public Album(String albumName, String artistName) {
		this.albumName = albumName;
		this.artistName = artistName;
		this.songs=new ArrayList<Song>();
	}
  public boolean findSongInAlbum(String name) {
	  for(Song ssSong:songs) {
		  if((ssSong.title).equals(name)) {
			  return true;
		  }
	  }
	  return false;
  }
  public String AddingSongInAlbum(String title,double duration) {
	  if(findSongInAlbum(title)) {
		  return "Song Already Exist";
	  }
	  songs.add(new Song(title, duration));
	  return "Song Added to Album"; 
	  
  }
  public String addingSongtoPlaylist(int position,LinkedList<Song> playList) {
	 
	int idx=position-1;
	if(idx>=0 && idx<songs.size() ) {
		playList.add(songs.get(idx));
		return "SONG ADDED TO THE PLAYLIST";
	}
	return "SONG NOT PRESENT IN ALBUM";
	
  }
  public String addingSongtoPlayList(String title,LinkedList<Song> playList) {
	   for(Song ssSong:songs) {
		   if((ssSong.title).equals(title)) {
			   playList.add(ssSong);
			   return "SONG ADDED TO THE PLAYLIST";
		   }
	   }
	   return "SONG IS NOT PRESENT IN ALBUM";
  }
 
}
