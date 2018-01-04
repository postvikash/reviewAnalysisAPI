package review.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by O682559 on 12/16/2017.
 */

// To deploy the WAR file in tomcat container, uncomment the lines in class definition

@SpringBootApplication
public class AppBootstraper /*extends SpringBootServletInitializer*/ {

    public static void main(String[] args) {
        SpringApplication.run(AppBootstraper.class, args);
    }

    /*@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
        return app.sources(AppBootstraper.class);
    }*/
}
