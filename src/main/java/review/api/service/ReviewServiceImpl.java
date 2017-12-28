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
    public Set<CustomerReview> getReviews(String searchParameter) {

        switch(searchParameter) {
            case "CITY":
                return reviewRepository.findByCity();
            case "SOURCE":
                return reviewRepository.findByCity();
            case "PROPERTY":
                return reviewRepository.findByCity();
            default:
                return new HashSet<CustomerReview>(reviewRepository.findAll());
        }
    }
}
