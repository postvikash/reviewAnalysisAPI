package api.review.service;

import api.review.model.CustomerReview;
import api.review.model.Review;
import api.review.repository.MongoReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;
import api.review.repository.ReviewRepository;

import java.util.List;

/**
 * Created by O682559 on 12/16/2017.
 */

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MongoReviewRepository mongoReviewRepository;

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
                                   String city, String property, String source) {
        if(city == null || city.equals("all"))
            city = ".*";
        else
            city = "^"+city+"$";
        if(property == null || property.equals("all"))
            property = ".*";
        else
            property = "^"+city+"$";
        if(source == null || source.equals("all"))
            source = ".*";
        else
            property = "^"+city+"$";
        if(startDate == null)
            startDate = "01/01/2000";
        if(endDate == null)
            endDate = "01/01/4000";

        return mongoReviewRepository.findByCityLikeAndPropertyLikeAndSourceLike(city, property, source);
    }
}
