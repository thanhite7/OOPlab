package hust.soict.globalict.aims.media;
import  java.util.*;
import java.util.ArrayList;
public class CompactDisc extends Disc implements Playable{

	private String artist;
	private List<Track> tracks = new ArrayList<Track>();
	public CompactDisc( String category,String title, float cost,String artist,String director,int length) {
		super(category, title, cost,director,length);
		this.artist = artist;
		
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void addTrack(Track track)
	{
		if(!tracks.contains(track))
		{
			tracks.add(track);
		}
	}
	public void removeTrack(Track track)
	{
		if(tracks.contains(track))
		{
			tracks.remove(track);
		}
	}
	public int getLength()
	{
		int sum= 0;
		for (int i=0;i<tracks.size();i++)
		{
			sum+=tracks.get(i).getLength();
		}
		return sum;
	}
	public void play()
	{
		for(int i=0;i<tracks.size();i++)
		{
			tracks.get(i).play();
		}
	}
}
