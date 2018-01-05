package api.review.repository;

import api.review.model.CustomerReview;

import java.util.List;

/**
 * Created by O682559 on 1/2/2018.
 */
public interface ReviewRepository {

    public List<CustomerReview> findByFilters(String startDate, String endDate,
                                              String city, String property, String source);

}
