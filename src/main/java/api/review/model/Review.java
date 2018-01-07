package api.review.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "testing_output")
public class Review {

    @Id
    private String id;
    @Field("category")
    private String category;
    @Field("city")
    private String city;
    @Field("sentiment")
    private String sentiment;
    @Field("rating")
    private String rating;
    @Field("source")
    private String source;
    @Field("sentiment_text")
    private String sentimentText;
    @Field("review")
    private String review;
    @Field("hotel")
    private String hotel;
    @Field("header")
    private String header;
    @Field("sentence_id")
    private String sentenceId;
    @Field("l0")
    private String l0;
    @Field("l1")
    private String l1;
    @Field("l2")
    private String l2;
    @Field("l3")
    private String l3;
    @Field("date")
    private String date;
    @Field("sentence")
    private String sentence;
    @Field("unique_id")
    private String uniqueId;
    @Field("exec_Status")
    private String execStatus;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSentimentText() {
        return sentimentText;
    }

    public void setSentimentText(String sentimentText) {
        this.sentimentText = sentimentText;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getExecStatus() {
        return execStatus;
    }

    public void setExecStatus(String execStatus) {
        this.execStatus = execStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSentenceId() {
        return sentenceId;
    }

    public void setSentenceId(String sentenceId) {
        this.sentenceId = sentenceId;
    }

    public String getL3() {
        return l3;
    }

    public void setL3(String l3) {
        this.l3 = l3;
    }

    public String getSentiment() {
        return sentiment;
    }

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getL0() {
        return l0;
    }

    public void setL0(String l0) {
        this.l0 = l0;
    }

    public String getL1() {
        return l1;
    }

    public void setL1(String l1) {
        this.l1 = l1;
    }

    public String getL2() {
        return l2;
    }

    public void setL2(String l2) {
        this.l2 = l2;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean equals(final Review review) {
        if(this.getId().equals(review.getId()))
            return true;
        else
            return false;
    }

    public int hashCode() {
        return this.getId().hashCode();
    }

    public String toString() {
        return sentence+"\n"+review+"\n"+sentimentText+"\n"+date;
    }

}