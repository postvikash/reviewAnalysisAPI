package review.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import review.api.model.Request;
import review.api.model.Response;
import review.api.repository.ReviewRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by O682559 on 12/16/2017.
 */

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public List<Response> getReviews() {
        return reviewRepository.getReviewList();
    }

}
