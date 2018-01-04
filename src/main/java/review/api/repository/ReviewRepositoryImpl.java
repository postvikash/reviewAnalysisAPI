package review.api.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import review.api.model.CustomerReview;
import review.api.model.ReviewRowMapper;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
        System.out.println(sql+"\n"+city+"\n"+source+"\n"+property+"\n"+startDate+"\n"+endDate);
        List<CustomerReview> customerReviewList = (List<CustomerReview>)jdbcTemplate.query(sql,new Object[]{startDate, endDate, city, property, source}, new ReviewRowMapper());
        return customerReviewList;
    }
}
