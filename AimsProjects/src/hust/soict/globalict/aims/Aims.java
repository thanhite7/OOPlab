package hust.soict.globalict.aims;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.disc.DigitalVideoDisc;

public class Aims {

	public static void main(String[] args) {

		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("TheLionKing",
				"Animation", "Roger Allers",87, 19.95f);
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star War",
				"Science Fiction","George Lucas", 87, 24.95f);
		anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation", 18.99f);
		DigitalVideoDisc []dvdList = new DigitalVideoDisc[2];
		dvdList[0] = dvd1;
		dvdList[1] = dvd2;
		anOrder.addDigitalVideoDisc(dvd3);
		anOrder.addDigitalVideoDisc(dvdList);
		anOrder.addDigitalVideoDisc(dvd1,dvd2);
		anOrder.display();
	
		

	
	}

}