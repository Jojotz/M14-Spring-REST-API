package springRESTAPI.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Picture")
public class Picture {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long pictureId;
	
	@Column (name = "picture_name")
	private String pictureName;
	
	@Column (name = "picture_author")
	private String pictureAuthor;
	
	@Column (name = "picture_price")
	private double picturePrice;
	
	@Column (name = "picture_date")
	private String pictureDate;
	
	@ManyToOne
	@JoinColumn(name ="shop_id", nullable=false)
	private Shop shop;
	
	public Picture() {
		
	}
	
	public Picture(Long pictureId, String pictureName, String pictureAuthor, double picturePrice, String pictureDate) {
		this.pictureId = pictureId;
		this.pictureName = pictureName;
		this.pictureAuthor = pictureAuthor;
		this.picturePrice = picturePrice;
		this.pictureDate = pictureDate;
	}
	
	public Long getPictureId() {
		return pictureId;
	}
	public void setPictureId(Long pictureId) {
		this.pictureId = pictureId;
	}
	public String getPictureName() {
		return pictureName;
	}
	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}
	public String getPictureAuthor() {
		return pictureAuthor;
	}
	public void setPictureAuthor(String pictureAuthor) {
		this.pictureAuthor = pictureAuthor;
	}
	public double getPicturePrice() {
		return picturePrice;
	}
	public void setPicturePrice(double picturePrice) {
		this.picturePrice = picturePrice;
	}
	public String getPictureDate() {
		return pictureDate;
	}
	public void setPictureDate(String pictureDate) {
		this.pictureDate = pictureDate;
	}

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}	
	
}
