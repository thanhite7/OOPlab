package hust.soict.globalict.aims.store;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Store {

	private int product_nums;
	DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[1000];
	public int getproductsnum()
	{
		return product_nums;
	}
	public void addDVD(DigitalVideoDisc disc)
	{
		itemsInStore[product_nums] = disc;
		product_nums++;
	}
	public void removeDVD(DigitalVideoDisc disc)
	{
		for(int i=0;i<product_nums;i++)
		{
			if(itemsInStore[i]==disc)
			{
				for(int j=i;j<product_nums-1;j++)
				{
					itemsInStore[i] = itemsInStore[i+1];
				}
				product_nums--;
			}
		}
	}
	public void display(){
	    if (product_nums == 0){
	        System.out.println("Out of Products!");
	    }
	    else{
	        for (int i = 0; i < product_nums; i++){
	            System.out.println("Name: " + itemsInStore[i].getTitle() + 
	            		"; Category: " + itemsInStore[i].getCategory() +
	            		"; Director: " + itemsInStore[i].getDirector() +
	            		"; Length: " + itemsInStore[i].getLength() +
	            		"; Cost: " + itemsInStore[i].getCost());
	        }
	    }
	}
}
