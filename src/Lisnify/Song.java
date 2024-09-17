package Lisnify;

public class Song {
     String title;
     double duration;
     Song(String title,double duration){
    	 this.title=title;
    	 this.duration=duration;
     }
     @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "PrintingSong [title "+title+", Duration "+duration;
    }
}
