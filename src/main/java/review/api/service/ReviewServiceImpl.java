package review.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import review.api.model.CustomerReview;
import review.api.repository.ReviewRepository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by O682559 on 12/16/2017.
 */

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

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
    }
