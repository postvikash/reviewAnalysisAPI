package review.api.repository;

import review.api.model.CustomerReview;

import java.util.List;
import java.util.Set;

/**
 * Created by O682559 on 1/2/2018.
 */
public interface ReviewRepository {

    public List<CustomerReview> findByFilters(String startDate, String endDate,
                                              String city, String property, String source);

}
