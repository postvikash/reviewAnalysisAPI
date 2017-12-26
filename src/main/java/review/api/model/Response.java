package review.api.model;

/**
 * Created by O682559 on 12/16/2017.
 */
public class Response {

    private String reviewId;
    private String sentenceId;
    private String l3;
    private String sentiment;
    private String sentence;
    private String verbatim;
    private String l0;
    private String l1;
    private String l2;
    private String date;
    private String source;
    private String city;
    private String property;

    public Response() {

    }

    public Response(String revId, String sentId, String l3, String sentiment, String sentence, String verbatim, String l0, String l1, String l2, String date, String source, String city, String property) {
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

}