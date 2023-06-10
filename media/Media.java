package hust.soict.globalict.aims.media;

import java.util.Comparator;
import hust.soict.globalict.aims.cart.*;
public class Media {
	
	private int id;
	private String title;
	private String category;
	private float cost;
	public static int nofmedia = 0;
	public Media(String category,String title, float cost ) {
		this.id = nofmedia;
		this.title = title;
		this.cost  =cost;
		this.category = category;
		nofmedia++;
	}
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

	@Override
	public boolean equals(Object e)
	{
		if(e==this)
		{
			return true;
		}
		if (!(e instanceof Media))
		{
			return false;
		}
		Media media =  (Media) e;
		return media.getTitle().equals(title);
	}
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public float getCost() {
		return cost;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	

}
