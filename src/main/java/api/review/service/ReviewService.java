package api.review.service;

import api.review.model.CustomerReview;
import api.review.model.Review;

import java.util.List;

/**
 * Created by O682559 on 12/16/2017.
 */
public interface ReviewService {
    List<CustomerReview> getFilteredReviews(String startDate, String endDate,
                                            String city, String property, String source);

    List<Review> getReviewsFromMongoDB(String startDate, String endDate,
                           String city, String property, String source);
}
