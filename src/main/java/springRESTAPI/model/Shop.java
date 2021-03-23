package springRESTAPI.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Shop")
public class Shop {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)	
	private Long shopId;
	
	@Column (name = "shop_name")
	private String shopName;
	
	@Column (name = "shop_capacity")
	private int shopCapacity;
	
	@OneToMany (mappedBy="shop", cascade = CascadeType.ALL, orphanRemoval=true)
	private List<Picture> pictures = new ArrayList<>();
	
	public Shop() {
		
	}  
	
	public Shop(Long shopId, String shopName, int shopCapacity) {
		this.shopId=shopId;
		this.shopName = shopName;
		this.shopCapacity = shopCapacity;
	}

	
	public Long getShopId() {
		return shopId;
	}

	public void setShopId(Long shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public int getShopCapacity() {
		return shopCapacity;
	}

	public void setShopCapacity(int shopCapacity) {
		this.shopCapacity = shopCapacity;
	}

	public List<Picture> getPictures() {
		return pictures;
	}

	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}	
}
