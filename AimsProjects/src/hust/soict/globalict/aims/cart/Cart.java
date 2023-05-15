package hust.soict.globalict.aims.cart;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Cart {
public static final int MAX_NUMBER_ORDERED = 20;
private DigitalVideoDisc itemOrdered[]=
        new DigitalVideoDisc[MAX_NUMBER_ORDERED];
private int qtyOrdered;
public Cart() {
	this.qtyOrdered = 0;
	}
public int getQtyOrdered() {
	return this.qtyOrdered;
}
public void setQtyOrdered(int qtyOrdered) {
	this.qtyOrdered = qtyOrdered;

}
public void addDigitalVideoDisc(DigitalVideoDisc disc){
    if (qtyOrdered == MAX_NUMBER_ORDERED){
        System.out.println("The cart is full");
    }else{
        itemOrdered[qtyOrdered] = disc;
        qtyOrdered++;
        System.out.println("The disc has been added");
    }
}
public void addDigitalVideoDisc(DigitalVideoDisc []dvdList)
{
	if(qtyOrdered==MAX_NUMBER_ORDERED)
	{
		System.out.println("The cart is full");
	}
	else
	{
		for(int i=0;i<dvdList.length;i++)
		{
			if(qtyOrdered==MAX_NUMBER_ORDERED)
			{
				i=dvdList.length;
			}
			else
			{
				itemOrdered[qtyOrdered] = dvdList[i];
			}
		}
		System.out.println("The disc has been added");
	}
	
}
public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2)

{
	if(qtyOrdered==MAX_NUMBER_ORDERED)
	{
		System.out.println("The cart is full");
	}
	else
	{
		itemOrdered[qtyOrdered] = dvd1;
	}
	if(qtyOrdered==MAX_NUMBER_ORDERED)
	{
		System.out.println("The cart is full");
	}
	else
	{
		itemOrdered[qtyOrdered] = dvd2;
		qtyOrdered++;
	}
	
	
}
public void searchid(int ID)
{
	int checkid = 0,checktit = 0;
	for(int i=0;i<qtyOrdered;i++)
	{
		if(ID==itemOrdered[i].getid())
		{
			checkid =1;
			if (checktit==0)
			{
				System.out.println("DVDs with the given id found:");
				System.out.print(String.valueOf(i+1)+'.'+itemOrdered[i].getTitle()+" - "+
	              		  itemOrdered[i].getCategory()+" - " +
	              		 itemOrdered[i].getDirector()+" - " +
	              		  String.valueOf(itemOrdered[i].getLength())+" - " 
	              		 + itemOrdered[i].toString(itemOrdered[i].getCost()) + '\n'); 
			}
			else {
				System.out.print(String.valueOf(i+1)+'.'+itemOrdered[i].getTitle()+" - "+
	              		  itemOrdered[i].getCategory()+" - " +
	              		 itemOrdered[i].getDirector()+" - " +
	              		  String.valueOf(itemOrdered[i].getLength())+" - " 
	              		 + itemOrdered[i].toString(itemOrdered[i].getCost()) + '\n'); 
			}
			
		}
	}
	if (checkid==0)
	{
		System.out.println("No DVDS with the given id found");
	}
}
public void searchtitle(String title)
{
	int checktitle = 0,checktit = 0;
	for(int i=0;i<qtyOrdered;i++)
	{
		if(itemOrdered[i].isMatch(title))
		{
			checktitle = 1;
			if(checktit==0)
			{
				System.out.println("DVDs with the given Title found:");
				System.out.print(String.valueOf(i+1)+'.'+itemOrdered[i].getTitle()+" - "+
	              		  itemOrdered[i].getCategory()+" - " +
	              		 itemOrdered[i].getDirector()+" - " +
	              		  String.valueOf(itemOrdered[i].getLength())+" - " 
	              		 + itemOrdered[i].toString(itemOrdered[i].getCost()) + '\n'); 
			}
			else {
				System.out.print(String.valueOf(i+1)+'.'+itemOrdered[i].getTitle()+" - "+
	              		  itemOrdered[i].getCategory()+" - " +
	              		 itemOrdered[i].getDirector()+" - " +
	              		  String.valueOf(itemOrdered[i].getLength())+" - " 
	              		 + itemOrdered[i].toString(itemOrdered[i].getCost()) + '\n'); 
			}
		}
	}
	if(checktitle==0)
	{
			System.out.println("No DVDS with the given Title found");
	}
}
public void display(){
    if (qtyOrdered == 0){
        System.out.println("Out of Stock!");
    }
    else{
        for (int i = 0; i < qtyOrdered; i++){
            System.out.println("Name: " + itemOrdered[i].getTitle() + 
            		"; Category: " + itemOrdered[i].getCategory() +
            		"; Director: " + itemOrdered[i].getDirector() +
            		"; Length: " + itemOrdered[i].getLength() +
            		"; Cost: " + itemOrdered[i].getCost());
        }
    }
}
public void print(){
    if (qtyOrdered == 0){
        System.out.println("Out of Stock!");
    }
    else{
    	for(int i=0;i<26;i++)
    	{
    		System.out.print('*');
    	}
    	System.out.print("CART");
    	for(int i=0;i<26;i++)
    	{
    		System.out.print('*');
    	}
    	System.out.print('\n');
    	
        for (int i = 0; i < qtyOrdered; i++){
        	 System.out.print(String.valueOf(i+1)+'.'+itemOrdered[i].getTitle()+" - "+
              		  itemOrdered[i].getCategory()+" - " +
              		 itemOrdered[i].getDirector()+" - " +
              		  String.valueOf(itemOrdered[i].getLength())+" - " 
              		 + itemOrdered[i].toString(itemOrdered[i].getCost()) + '\n'); 
        }
        System.out.println("Total cost: " + String.valueOf(totalCost()));
        
        for(int i=0;i<56;i++)
    	{
    		System.out.print('*');
    	}
    	System.out.print('\n');
    }
}
public void removeDigitalVideoDisc(DigitalVideoDisc disc){
    int check = -1;
    if (qtyOrdered == 0){
        System.out.println("Out of stock !");
    }
    else{
        for (int i = 0; i < qtyOrdered; i++){
            if (itemOrdered[i].getTitle().equals(disc.getTitle())
                ){
                check = i;
                break;
            }

        }
        if (check == -1){
            System.out.println("Cannot detect the item");
        }
        else{
            for (int i = check; i < qtyOrdered - 1; i++){
                itemOrdered[i] = new DigitalVideoDisc(itemOrdered[i + 1].getTitle(), itemOrdered[i + 1].getCategory(), 
                                                        itemOrdered[i + 1].getDirector(), itemOrdered[i + 1].getLength(), 
                                                        itemOrdered[i + 1].getCost());
            }
            qtyOrdered--;
        }
    }
}

public float totalCost(){
    float total = 0.0f;
    for (int i = 0; i < qtyOrdered; i++){
        total += itemOrdered[i].getCost();
    }
    
    return total;}

}