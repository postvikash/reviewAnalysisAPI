package review.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import review.api.model.CustomerReview;
import review.api.repository.ReviewRepository;

/**
 * Created by O682559 on 12/16/2017.
 */

@SpringBootApplication
public class AppConfig implements CommandLineRunner/*extends SpringBootServletInitializer*/ {

    @Autowired
    private ReviewRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        repository.save(new CustomerReview("1","5001","L3Value", "Positive", "Great location", "Stay was great", "L0Value", "L1Value", "L2Value", "12/20/2017", "Goibibo.com", "Goa", "Treebo Zeebo Suite"));
        repository.save(new CustomerReview("2","5002","L3Value", "Neutral", "Average stay overall", "Satisfactory", "L0Value", "L1Value", "L2Value", "12/20/2017", "Yatra.com", "Bangalore", "Rain Forest Enclave"));
        repository.save(new CustomerReview("3","5003","L3Value", "Positive", "Complimentary Breakfast", "Stay was great", "L0Value", "L1Value", "L2Value", "12/20/2017", "Booking.com", "Goa", "Treebo Zeebo Suite"));
        repository.save(new CustomerReview("4","5004","L3Value", "Postive", "Cooperative Staffs", "Satisfactory", "L0Value", "L1Value", "L2Value", "12/20/2017", "Yatra.com", "Goa", "Rain Forest Enclave"));
        repository.save(new CustomerReview("5","5005","L3Value", "Neutral", "Small rooms", "Dump and small rooms", "L0Value", "L1Value", "L2Value", "12/20/2017", "Agoda", "Bangalore", "Treebo Zeebo Suite"));
        repository.save(new CustomerReview("6","5006","L3Value", "Negative", "Rooms stinks", "Dont waste your money in this hotel", "L0Value", "L1Value", "L2Value", "12/20/2017", "Makemytrip", "Goa", "Rain Forest Enclave"));
        repository.save(new CustomerReview("7","5007","L3Value", "Positive", "Budget rooms", "Worth the value", "L0Value", "L1Value", "L2Value", "12/20/2017", "Goibibo", "Goa", "Treebo Zeebo Suite"));
        repository.save(new CustomerReview("8","5008","L3Value", "Neutral", "Prime location", "Nothing great about the property", "L0Value", "L1Value", "L2Value", "12/20/2017", "TripAdvisor", "Goa", "Rain Forest Enclave"));
        repository.save(new CustomerReview("9","5009","L3Value", "Positive", "Food was great", "Would recommend to family to friends", "L0Value", "L1Value", "L2Value", "12/20/2017", "Booking.com", "Bangalore", "Treebo Zeebo Suite"));
        repository.save(new CustomerReview("10","5010","L3Value", "Postive", "Swimming pool was awesome", "Will visit again", "L0Value", "L1Value", "L2Value", "12/20/2017", "Makemytrip", "Bangalore", "Rain Forest Enclave"));

    }

    /*@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AppConfig.class);
    }*/
}
