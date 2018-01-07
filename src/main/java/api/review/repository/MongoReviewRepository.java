package api.review.repository;

import api.review.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Date;
import java.util.List;


public interface MongoReviewRepository extends MongoRepository<Review, String> {

    @Query("{hotel : {$regex : ?0}, city : {$regex : ?1}, source : {$regex : ?2}, date : {$gt: ?3, $lt : ?4}}")
    List<Review> findByFilters(String hotel, String city, String source, Date startDate, Date endDate);
}
