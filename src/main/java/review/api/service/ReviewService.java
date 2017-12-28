package review.api.service;

import review.api.model.CustomerReview;
import java.util.Set;

/**
 * Created by O682559 on 12/16/2017.
 */
public interface ReviewService {
    public Set<CustomerReview> getReviews(String searchParameter);
}
