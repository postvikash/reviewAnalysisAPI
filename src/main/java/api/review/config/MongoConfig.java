package api.review.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;

@Configuration
public class MongoConfig extends AbstractMongoConfiguration {
    @Value("${mongodb.hostName}")
    private String mongodbHostName;

    @Value("${mongodb.portNumber}")
    private int mongodbPort;

    @Value("${mongodb.database}")
    private String mongodbDatabase;

    @Override
    protected String getDatabaseName() {
        return mongodbDatabase;
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient(mongodbHostName, mongodbPort);
    }

    @Override
    protected String getMappingBasePackage() {
        return "api.review";
    }
}
