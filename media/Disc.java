package hust.soict.globalict.aims.media;

public class Disc extends Media{
	
	private String director;
	private int length;
	public Disc( String category,String title, float cost,String director,int length ) {
		super(category, title, cost);
		this.length = length;
		this.director = director;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}

}
