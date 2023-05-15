package hust.soict.globalict.aims.disc;


public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	private static int nbDigitalVideoDiscs = 0;
	private int id ;
	{
		this.id = nbDigitalVideoDiscs;
		nbDigitalVideoDiscs++;
	}
	public String getTitle() {
		return title;
	}
	public int getid()
	{
		return id;
	}
	public String setTitle(String title)
	{
		this.title = title;
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public float getCost() {
		return cost;
	}
	public String toString(float n)
	{
		return String.valueOf(n);
	}
	boolean isMatch(String title)
	{
		if (title==this.getTitle())
		{
			return true;
		}
		return false;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;

	}
	public DigitalVideoDisc( String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;

	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;

	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	
	};
	
}
	
	