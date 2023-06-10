package hust.soict.globalict.aims.media;

import java.util.Objects;

public class Track implements Playable{

	private String title;
	private int length;
	
	@Override
	public boolean equals(Object e)
	{
		if(e==this)
		{
			return true;
		}
		if(!(e instanceof Track))
		{
			return false;
		}
		Track track  = (Track) e;
		return length==track.length && Objects.equals(title,track.title);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Track(String title,int length)
	{
		this.title = title;
		this.length = length;
	}
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		}
}
