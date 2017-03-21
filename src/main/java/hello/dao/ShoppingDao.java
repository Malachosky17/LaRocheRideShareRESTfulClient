package hello.dao;

import hello.model.Shopping;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by wargold419 on 3/21/17.
 */
public interface ShoppingDao extends CrudRepository<Shopping, Long> {

}
