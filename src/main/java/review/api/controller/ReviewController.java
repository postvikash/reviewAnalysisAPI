package review.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import review.api.model.CustomerReview;
import review.api.service.ReviewService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by O682559 on 12/16/2017.
 */
@RestController
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello() {
        return "Hello Guest!";
    }

    @RequestMapping("/reviews")
    public @ResponseBody List<CustomerReview> getReviews(@RequestParam (value = "startDate", required = false) String startDate,
                                                         @RequestParam (value = "endDate", required = false) String endDate,
                                                         @RequestParam (value = "source", required = false) String source,
                                                         @RequestParam (value = "city", required = false) String city,
                                                         @RequestParam (value = "property", required = false) String property) {

        return reviewService.getFilteredReviews(startDate, endDate, city, property, source);
    }

    @RequestMapping("/reviews/{property}/{city}/{source}")
    public @ResponseBody List<CustomerReview> getFilteredReviews(@RequestParam(value = "startDate", required = false) String startDate,
                                                                 @RequestParam (value = "endDate", required = false) String endDate,
                                                                 @PathVariable final String property,
                                                                 @PathVariable final String city,
                                                                 @PathVariable final String source) {

        return reviewService.getFilteredReviews(startDate, endDate, city, property, source);
    }
}
