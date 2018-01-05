package api.review.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by O682559 on 1/3/2018.
 */
public class ReviewRowMapper implements RowMapper {

    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {

        CustomerReview customerReview = new CustomerReview();

        customerReview.setId(rs.getString("AUTO_ID"));
        customerReview.setL0(rs.getString("L0"));
        customerReview.setL1(rs.getString("L1"));
        customerReview.setL2(rs.getString("L2"));
        customerReview.setL3(rs.getString("L3"));
        customerReview.setCity(rs.getString("CITY"));
        customerReview.setSource(rs.getString("SOURCE"));
        customerReview.setProperty(rs.getString("PROPERTY"));
        customerReview.setSentence(rs.getString("SENTENCE"));
        customerReview.setVerbatim(rs.getString("VERBATIM"));
        customerReview.setSentiment(rs.getString("SENTIMENT"));
        customerReview.setDate(rs.getString("REVIEW_DATE"));
        customerReview.setReviewId(rs.getString("REVIEW_ID"));
        customerReview.setSentenceId(rs.getString("SENTENCE_ID"));

        return customerReview;
    }

}
