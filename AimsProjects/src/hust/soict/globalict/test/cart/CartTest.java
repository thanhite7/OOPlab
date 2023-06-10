package hust.soict.globalict.test.cart;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.*;
public class CartTest {

	public static void main(String[] args) {
		Cart cart = new Cart();
		DigitalVideoDisc dvd = new DigitalVideoDisc("t","superman",(float) 25.58,"jamie oliver",285);
		Book book  = new Book("c","family",50);


		cart.addMedia(dvd);
		cart.addMedia(book);
		cart.sortCartByCostTitle();
		cart.sortCartByTitleCost();
		cart.display();
		cart.placeOrder();
	}

}
