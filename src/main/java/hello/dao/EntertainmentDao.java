package hello.dao;

import hello.model.Entertainment;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by wargold419 on 3/21/17.
 */
@Transactional
public interface EntertainmentDao extends CrudRepository<Entertainment, Long>{

}