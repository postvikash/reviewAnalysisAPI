package review.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import review.api.model.CustomerReview;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by O682559 on 12/24/2017.
 */
@Repository
public interface ReviewRepository extends MongoRepository<CustomerReview, String> {
    List<CustomerReview> reviewList = new ArrayList<CustomerReview>();

    public Set<CustomerReview> findByCity();
    public Set<CustomerReview> findBySource();
    public Set<CustomerReview> findByProperty();

}
