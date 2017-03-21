package hello.dao;

import hello.model.Shopping;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by wargold419 on 3/21/17.
 */
public class ShoppingDao extends CrudRepository<Shopping, Long> {

}
