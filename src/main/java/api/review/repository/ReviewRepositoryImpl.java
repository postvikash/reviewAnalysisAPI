package api.review.repository;

import api.review.model.CustomerReview;
import api.review.model.ReviewRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by O682559 on 1/2/2018.
 */
@Repository
public class ReviewRepositoryImpl implements ReviewRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<CustomerReview> findByFilters(String startDate, String endDate,
                                              String city, String property, String source) {

        String sql = "SELECT * FROM SRP..TEST_REVIEW_OUTPUT_VIKASH WHERE REVIEW_DATE BETWEEN ? AND ? " +
                     "AND CITY LIKE ? AND PROPERTY LIKE ? AND SOURCE LIKE ?";
        List<CustomerReview> customerReviewList = (List<CustomerReview>)jdbcTemplate.query(sql,new Object[]{startDate, endDate, city, property, source}, new ReviewRowMapper());
        return customerReviewList;
    }
}
