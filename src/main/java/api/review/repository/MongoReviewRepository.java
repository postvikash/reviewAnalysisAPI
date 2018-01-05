package api.review.repository;

import api.review.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;


public interface MongoReviewRepository extends MongoRepository<Review, String> {
    List<Review> findByCityLikeAndPropertyLikeAndSourceLike(String city, String property, String source);
}
