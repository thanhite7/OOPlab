package hust.soict.globalict.aims.screen;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.media.Playable;
import hust.soict.globalict.aims.store.Store;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
public class CartScreenController {
	private Cart cart;
	private Store store;
	@FXML
	private TableView<Media> tblMedia;
	@FXML
	private TableColumn<Media, String> colMediaTitle;
	@FXML
	private TableColumn<Media, String> colMediacategory;
	@FXML
	private TableColumn<Media, Float> colMediaCost;
	@FXML
	private Button btnPlay,btnRemove,placeOrder;
	@FXML
	private TextField tfFilter;
	@FXML 
	private Label total;
	@FXML
	public MenuItem viewstore;
	@FXML
	private RadioButton radioBtnFilterId,radioBtnFilterTitle;
	
	public CartScreenController(Cart cart, Store store)
	{
		super();
        this.cart = cart;
        this.store = store;
    }
	float sum = 0;
	@FXML
	private void initialize()
	{
		colMediaTitle.setCellValueFactory(new PropertyValueFactory<Media, String>("title"));
		colMediacategory.setCellValueFactory(new PropertyValueFactory<Media,String>("category"));
		colMediaCost.setCellValueFactory(new PropertyValueFactory<Media,Float>("cost"));
		if(this.cart.getQtyOrdered()==0)
		{
			tblMedia.setItems(null);
		}
		else
		{
			tblMedia.setItems(this.cart.getItemsOrdered());
		}
		sum = this.cart.totalCost();
		btnPlay.setVisible(false);
		btnRemove.setVisible(false);
		total.setText(Float.toString(sum)+"$");
		tblMedia.getSelectionModel().selectedItemProperty()
.addListener(
		
			new ChangeListener<Media>()
			{
				@Override
                public void changed(ObservableValue<? extends Media> observable, Media oldValue, Media newValue)
                {
                    if(newValue!=null)
                    {
                    	updateButtonBar(newValue);
                    }
                }
			}
		);
		tfFilter.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String oldvalue, String newvalue) {
				if(newvalue!=null)
				{
					showFilterMedia(newvalue);
				}

			}
			
		});
	}
	@FXML
	void placeOrderProduct(ActionEvent event)
	{
		tblMedia.setItems(null);

	}
	@FXML
	void btnRemovePressed(ActionEvent event)
	{
		Media media = tblMedia.getSelectionModel().getSelectedItem();
		cart.removeMedia(media);
		sum = sum-media.getCost();
		total.setText(Float.toString(sum+(float)0.0)+" $");
	}
	void updateButtonBar(Media media)
	{
		btnRemove.setVisible(true);
		if(media instanceof Playable)
		{
			btnPlay.setVisible(true);
		}
		else
		{
			btnPlay.setVisible(false);
		}
	}
	@FXML
	void showFilterMedia(String newvalue)
	{
		int check  =0;
		if (newvalue.equals("")==false)
		{
			check = 1;
			if(radioBtnFilterId.isSelected())
			{
				int id= Integer.parseInt(newvalue);
				
				tblMedia.setItems(this.cart.filterMediaById(id));
			}
			if(radioBtnFilterTitle.isSelected()) {
				tblMedia.setItems(this.cart.filterMediaByTitle(newvalue));
			}
		}
		if(check==0)
		{
			tblMedia.setItems(this.cart.getItemsOrdered());
		}
	}
	@FXML
	void playMedia(ActionEvent event)
	{
		
	}
	@FXML
	void viewstore(ActionEvent event)
	{
		new StoreScreen(store);
	}
	
}
