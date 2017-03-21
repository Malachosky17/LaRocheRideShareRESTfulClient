package hello.dao;

import hello.model.Restaurant;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by wargold419 on 3/21/17.
 */
public interface RestaurantDao extends CrudRepository<Restaurant, Long> {

}
