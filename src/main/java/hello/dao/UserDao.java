package hello.dao;

import hello.model.UserProfile;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by Malac on 3/15/2017.
 */
@Transactional
public interface UserDao extends CrudRepository<UserProfile, Long> {

}
