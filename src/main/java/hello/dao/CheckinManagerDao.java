package hello.dao;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by wargold419 on 4/5/17.
 */
@Transactional
public interface CheckinManagerDao extends CrudRepository<CheckinManager, Long> {

}
