package hust.soict.globalict.test.store;

import hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.store.Store;

public class StoreTest {

	public static void main(String[] args) {
		Store store = new Store()
;		DigitalVideoDisc prod1 = new DigitalVideoDisc("TheLionKing",
				"Animation", "Roger Allers",87, 19.95f);
		store.addDVD(prod1);
		DigitalVideoDisc prod2 = new DigitalVideoDisc("Star War",
				"Science Fiction","George Lucas", 87, 24.95f);
		store.addDVD(prod2);
		store.display();
		store.removeDVD(prod2);
		store.display();
	}

}
