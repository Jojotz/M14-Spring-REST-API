package springRESTAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springRESTAPI.model.Shop;

@Repository
public interface ShopRepository extends JpaRepository <Shop, Long > {

}
