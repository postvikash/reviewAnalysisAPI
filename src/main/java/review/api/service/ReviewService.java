package review.api.service;

import review.api.model.Request;
import review.api.model.Response;

import java.util.List;

/**
 * Created by O682559 on 12/16/2017.
 */
public interface ReviewService {
    public List<Response> getReviews();
}
