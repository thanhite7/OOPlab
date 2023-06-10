package hust.soict.globalict.aims.media;


public class DigitalVideoDisc extends Disc implements Playable{



	public DigitalVideoDisc(String category,String title, float cost,String director,int length)
	{
		super(category, title, cost,director,length);
		
	}
	
	public String toString(float n)
	{
		return String.valueOf(n);
	}
	public boolean isMatch(String title)
	{
		if (title==this.getTitle())
		{
			return true;
		}
		return false;
	}
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
		}
	
	
}
	
	