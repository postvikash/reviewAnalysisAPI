package api.review.controller;

import api.review.model.CustomerReview;
import api.review.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import api.review.service.ReviewService;

import java.util.List;


@RestController
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @RequestMapping("/hello")
    public @ResponseBody String sayHello() {
        return "Hello Guest!";
    }

    @RequestMapping("/reviews")
    @ResponseBody
    public List<CustomerReview> getReviewsLegacy(@RequestParam (value = "startDate", required = false) String startDate,
                                                 @RequestParam (value = "endDate", required = false) String endDate,
                                                 @RequestParam (value = "source", required = false) String source,
                                                 @RequestParam (value = "city", required = false) String city,
                                                 @RequestParam (value = "property", required = false) String property) {

        return reviewService.getFilteredReviews(startDate, endDate, city, property, source);
    }

    @RequestMapping("/reviews/{property}/{city}/{source}")
    @ResponseBody
    public List<CustomerReview> getFilteredReviewsLegacy(@RequestParam(value = "startDate", required = false) String startDate,
                                                         @RequestParam (value = "endDate", required = false) String endDate,
                                                         @PathVariable final String property,
                                                         @PathVariable final String city,
                                                         @PathVariable final String source) {

        return reviewService.getFilteredReviews(startDate, endDate, city, property, source);
    }

    @RequestMapping("/mongodb/reviews")
    @ResponseBody
    public List<Review> getReviewsForKeyValuePairs
            (@RequestParam (value = "startDate", required = false) String startDate,
             @RequestParam (value = "endDate", required = false) String endDate,
             @RequestParam (value = "source", required = false) String source,
             @RequestParam (value = "city", required = false) String city,
             @RequestParam (value = "property", required = false) String property) {

        return reviewService.getReviewsFromMongoDB(startDate, endDate, city, property, source);
    }

    @RequestMapping("/mongodb/reviews/{property}/{city}/{source}")
    @ResponseBody
    public List<Review> getReviewsForResourceBasedURL
            (@RequestParam(value = "startDate", required = false) String startDate,
             @RequestParam (value = "endDate", required = false) String endDate,
             @PathVariable final String property,
             @PathVariable final String city,
             @PathVariable final String source) {

        return reviewService.getReviewsFromMongoDB(startDate, endDate, city, property, source);
    }
}
