package springRESTAPI.controller;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;

import springRESTAPI.exceptions.RecordNotFoundException;
import springRESTAPI.model.Picture;
import springRESTAPI.model.Shop;
import springRESTAPI.service.ShopService;

@Controller
@RequestMapping("/")
public class ShopController {
	
	@Autowired
	private ShopService service;
	
	@GetMapping ("/home")
	public String goBackHome(Model model) {
			
		//List<Shop> listShops = service.getAllShops();		
		//model.addAttribute ("listShops", listShops);		
		return "index";
	} 	
	
	//Gets all shops
	@GetMapping ("/shops")
	public String getAllShops (Model model) {
			
		List<Shop> listShops = service.getAllShops();		
		model.addAttribute ("listShops", listShops);		
		return "list-shops";
	} 	
	
	//-------
	//Brings us to the createshop-form.html
	@GetMapping ("/shops/new")
	public String showNewShopForm (Model model) {
		
		model.addAttribute("shop", new Shop());		
		return "createshop-form";
	}
	
	//Creates a shop
	@PostMapping("/shops/")
	public String createShop (Model model, Shop shop) {
		
		service.createShop(shop);
		List<Shop> listShops = service.getAllShops();		
		model.addAttribute ("listShops", listShops);
		return "list-shops";
	}
	//-------
	
	//-------
	//Brings us to the createpicture-form.html
	@GetMapping ("/pictures/new")
	public String showNewPictureForm (Model model) {
		
		List<Shop> listShops = service.getAllShops();
		model.addAttribute("picture", new Picture());
		model.addAttribute("listShops", listShops);		
		return "createpicture-form";
	}
	
	//Creates a picture
	@PostMapping("/shops/{ID}/pictures")
	public String createPicture (Picture picture) {
			
		service.createPicture(picture);
		//List<Picture> listPictures = service.getAllPictures(shopId);
		//model.addAttribute("listPictures", listPictures);
		return "list-pictures";
	}
	//-------

	//Gets pictures in a shop by shopId
	@GetMapping ("/shops/pictures/{id}")
	public String findShopById (Model model, @PathVariable("id") Long shopId) throws RecordNotFoundException {
		List<Picture> listPictures = service.getAllPictures(shopId);
		model.addAttribute("listPictures", listPictures);
				
		return "list-pictures";
	}
	
	//Deletes a shop by Id
	@GetMapping("shops/delete/{id}")
	public String deleteShopById (Model model, @PathVariable("id") Long shopId) throws RecordNotFoundException {
		
		service.deleteShopById(shopId);	
		List<Shop> listShops = service.getAllShops();		
		model.addAttribute ("listShops", listShops);
		return "list-shops";		
	}
}