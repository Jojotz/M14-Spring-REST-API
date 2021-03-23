package springRESTAPI;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import springRESTAPI.model.Picture;
//import springRESTAPI.model.Shop;
//import springRESTAPI.repository.ShopRepository;

@SpringBootApplication
public class M14SpringRestapiApplication { //implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(M14SpringRestapiApplication.class, args);
	}

/*	@Autowired
	private ShopRepository shopRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Shop shop = new Shop ("Jacaranda", 30);
		
		Picture picture1 = new Picture ("Malvas Rojas", "Federico Lorca", 159, "2021-03-16 12:30:00");
		Picture picture2 = new Picture ("Malvas Azules", "Federico Lorca", 99.99, "2021-03-16 12:30:00");
		Picture picture3 = new Picture ("Malvas Lilas", "Federico Lorca", 148.75, "2021-03-16 12:30:00");
		
		shop.getPictures().add(picture1);
		shop.getPictures().add(picture2);
		shop.getPictures().add(picture3);
		
		this.shopRepository.save(shop);
	}  
*/
}
