package review.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import review.api.model.Response;
import review.api.service.ReviewService;

import java.util.List;
import java.util.stream.Collectors;

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
    public @ResponseBody List<Response> getReviews(@RequestParam(value = "startDate", required = false) String startDate,
                                                   @RequestParam (value = "endDate", required = false) String endDate,
                                                   @RequestParam (value = "source", required = false) String source,
                                                   @RequestParam (value = "city", required = false) String city,
                                                   @RequestParam (value = "property", required = false) String property) {
        return reviewService.getReviews();
    }

    @RequestMapping("/reviews/{property}/{city}/{source}")
    public @ResponseBody List<Response> getFilteredReviews(@RequestParam(value = "startDate", required = false) String startDate,
                                                           @RequestParam (value = "endDate", required = false) String endDate,
                                                           @PathVariable final String property,
                                                           @PathVariable String city,
                                                           @PathVariable String source) {

        List<Response> reviewList = reviewService.getReviews();
        if(!property.equals("all")) {
            reviewList.removeIf(review -> !review.getProperty().equals(property));
        }
        if(!source.equals("all")) {
            reviewList.removeIf(review -> !review.getSource().equals(source));
        }
        if(!city.equals("all")) {
            reviewList.removeIf(review -> !review.getCity().equals(city));
        }
        return reviewList;
    }
}
