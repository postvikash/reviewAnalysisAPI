package api.review.repository;

import api.review.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by O682559 on 1/5/2018.
 */
public interface UserRepository extends MongoRepository<User, String> {

    public List<User>  findAll();

}
