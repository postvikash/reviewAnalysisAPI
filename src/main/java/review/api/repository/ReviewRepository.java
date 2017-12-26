package review.api.repository;

import org.springframework.stereotype.Repository;
import review.api.model.Response;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by O682559 on 12/24/2017.
 */
@Repository
public class ReviewRepository {
    List<Response> reviewList = new ArrayList<Response>();

    public ReviewRepository() {

    }

    public List<Response> getReviewList() {
        reviewList.clear();
        reviewList.add(new Response("1","5001","L3Value", "Positive", "Great location", "Stay was great", "L0Value", "L1Value", "L2Value", "12/20/2017", "Goibibo.com", "Goa", "Treebo Zeebo Suite"));
        reviewList.add(new Response("2","5002","L3Value", "Neutral", "Average stay overall", "Satisfactory", "L0Value", "L1Value", "L2Value", "12/20/2017", "Yatra.com", "Bangalore", "Rain Forest Enclave"));
        reviewList.add(new Response("3","5003","L3Value", "Positive", "Complimentary Breakfast", "Stay was great", "L0Value", "L1Value", "L2Value", "12/20/2017", "Booking.com", "Goa", "Treebo Zeebo Suite"));
        reviewList.add(new Response("4","5004","L3Value", "Postive", "Cooperative Staffs", "Satisfactory", "L0Value", "L1Value", "L2Value", "12/20/2017", "Yatra.com", "Goa", "Rain Forest Enclave"));
        reviewList.add(new Response("5","5005","L3Value", "Neutral", "Small rooms", "Dump and small rooms", "L0Value", "L1Value", "L2Value", "12/20/2017", "Agoda", "Bangalore", "Treebo Zeebo Suite"));
        reviewList.add(new Response("6","5006","L3Value", "Negative", "Rooms stinks", "Dont waste your money in this hotel", "L0Value", "L1Value", "L2Value", "12/20/2017", "Makemytrip", "Goa", "Rain Forest Enclave"));
        reviewList.add(new Response("7","5007","L3Value", "Positive", "Budget rooms", "Worth the value", "L0Value", "L1Value", "L2Value", "12/20/2017", "Goibibo", "Goa", "Treebo Zeebo Suite"));
        reviewList.add(new Response("8","5008","L3Value", "Neutral", "Prime location", "Nothing great about the property", "L0Value", "L1Value", "L2Value", "12/20/2017", "TripAdvisor", "Goa", "Rain Forest Enclave"));
        reviewList.add(new Response("9","5009","L3Value", "Positive", "Food was great", "Would recommend to family to friends", "L0Value", "L1Value", "L2Value", "12/20/2017", "Booking.com", "Bangalore", "Treebo Zeebo Suite"));
        reviewList.add(new Response("10","5010","L3Value", "Postive", "Swimming pool was awesome", "Will visit again", "L0Value", "L1Value", "L2Value", "12/20/2017", "Makemytrip", "Bangalore", "Rain Forest Enclave"));
        return reviewList;
    }

}
