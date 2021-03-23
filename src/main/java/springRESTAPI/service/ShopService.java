package springRESTAPI.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springRESTAPI.exceptions.RecordNotFoundException;
import springRESTAPI.model.Picture;
import springRESTAPI.model.Shop;
import springRESTAPI.repository.PictureRepository;
import springRESTAPI.repository.ShopRepository;

@Service
public class ShopService {

	@Autowired
	PictureRepository pictureRepository;
	@Autowired
	ShopRepository shopRepository;
	
	public List<Shop> getAllShops() {
		
		List<Shop> result = (List<Shop>) shopRepository.findAll();
		
		if (result.size() > 0) {			
			return result;			
		} else {			
			return new ArrayList<Shop>();			
		}		
	}
	
	public Shop getShopById(Long shopId) throws RecordNotFoundException {
		
		Optional<Shop> shop = shopRepository.findById(shopId);
		
		if (shop.isPresent()) {			
			return shop.get();			
		} else {			
			throw new RecordNotFoundException ("No shop exists for given id: " + shopId);			
		}
	}	
		
	public void createShop (Shop shop) {
					
		shop = shopRepository.save(shop);		
	}
	
	public void createPicture(Picture picture) {
		
		picture = pictureRepository.save(picture);		
	}	
	
	//Get pictures by shopId
	public List<Picture> getAllPictures (Long shopId) {
				
		return shopRepository.findById(shopId).get().getPictures();
	}

	//Deletes Shop with all the pictures (cascade)
	public void deleteShopById (Long shopId) throws RecordNotFoundException {
		
		Optional<Shop> shop= shopRepository.findById(shopId);
		if (shop.isPresent()) {
			shopRepository.deleteById(shopId);
		} else {			
			throw new RecordNotFoundException ("No shop exists for given id: " + shopId);
		}
	}
}