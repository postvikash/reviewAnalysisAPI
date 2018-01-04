package review.api.service;

import review.api.model.CustomerReview;

import java.util.List;

/**
 * Created by O682559 on 12/16/2017.
 */
public interface ReviewService {
    List<CustomerReview> getFilteredReviews(String startDate, String endDate,
                                            String city, String property, String source);
}
