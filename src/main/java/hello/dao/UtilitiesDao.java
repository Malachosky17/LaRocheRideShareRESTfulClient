package hello.dao;

import hello.model.Utility;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by wargold419 on 3/21/17.
 */
@Transactional
public interface UtilitiesDao extends CrudRepository<Utility, Long> {

}
