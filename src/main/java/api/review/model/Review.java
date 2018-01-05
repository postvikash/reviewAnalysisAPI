package api.review.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "testing_output")
public class Review {

    @Id
    private String id;
    @Field("Review Id")
    private String reviewId;
    @Field("Sentence Id")
    private String sentenceId;
    @Field("L3")
    private String l3;
    @Field("Sentiment")
    private String sentiment;
    @Field("Sentence")
    private String sentence;
    @Field("Verbatim")
    private String verbatim;
    @Field("L0")
    private String l0;
    @Field("L1")
    private String l1;
    @Field("L2")
    private String l2;
    @Field("Date")
    private String date;
    @Field("Source")
    private String source;
    @Field("City")
    private String city;
    @Field("Property")
    private String property;

    public Review() {

    }

    public Review(String revId, String sentId, String l3, String sentiment,
                          String sentence, String verbatim, String l0, String l1, String l2,
                          String date, String source, String city, String property) {
        this.reviewId = revId;
        this.sentenceId = sentId;
        this.l3 = l3;
        this.sentiment = sentiment;
        this.sentence = sentence;
        this.verbatim = verbatim;
        this.l0 = l0;
        this.l1 = l1;
        this.l2 = l2;
        this.date = date;
        this.source = source;
        this.city = city;
        this.property = property;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReviewId() {
        return reviewId;
    }

    public void setReviewId(String reviewId) {
        this.reviewId = reviewId;
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

    public String getVerbatim() {
        return verbatim;
    }

    public void setVerbatim(String verbatim) {
        this.verbatim = verbatim;
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

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
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
        return sentence +"\n"+verbatim+"\n"+sentiment+"\n"+date;
    }

}