package api.review.service;

import api.review.model.CustomerReview;
import api.review.model.Review;
import api.review.model.User;
import api.review.repository.MongoReviewRepository;
import api.review.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;
import api.review.repository.ReviewRepository;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by O682559 on 12/16/2017.
 */

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MongoReviewRepository mongoReviewRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<CustomerReview> getFilteredReviews(String startDate, String endDate,
                                                   String city, String property, String source) {
                if(city == null || city.equals("all"))
                    city = "%";
                if(property == null || property.equals("all"))
                    property = "%";
                if(source == null || source.equals("all"))
                    source = "%";
                if(startDate == null)
                    startDate = "01/01/2000";
                if(endDate == null)
                    endDate = "01/01/4000";
                return reviewRepository.findByFilters(startDate, endDate, city, property, source);
    }

    @Override
    public List<Review> getReviewsFromMongoDB(String startDate, String endDate,
                                   String hotel, String city, String source) throws ParseException {
        TimeZone utc = TimeZone.getTimeZone("Etc/UTC");
        SimpleDateFormat parser = new SimpleDateFormat("dd-MMM-yyyy", Locale.US);
        parser.setTimeZone(utc);
        Date start_date = parser.parse("01-Jan-2000");
        Date end_date = parser.parse("01-Jan-3000");
        if(city == null || city.equals("all"))
            city = ".*";
        else
            city = "^"+city+"$";
        if(hotel == null || hotel.equals("all"))
            hotel = ".*";
        else
            hotel = "^"+hotel+"$";
        if(source == null || source.equals("all"))
            source = ".*";
        else
            source = "^"+source+"$";
        if(startDate != null)
            start_date = parser.parse(startDate);
        if(endDate != null)
            end_date = parser.parse(endDate);

        return mongoReviewRepository.findByFilters(hotel, city, source, start_date, end_date);
    }
}
