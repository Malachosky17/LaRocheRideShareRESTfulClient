package hello.doa;

import hello.model.UserProfile;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by Malac on 3/15/2017.
 */
@Transactional
public interface UserDoa extends CrudRepository<UserProfile, Long> {

}
