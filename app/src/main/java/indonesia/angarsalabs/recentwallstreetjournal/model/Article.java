package indonesia.angarsalabs.recentwallstreetjournal.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Angarsa Labs...!
 * Created by Angga on 21/06/2018.
 */
public class Article {
    @SerializedName("source")
    private Source source;

    @SerializedName("author")
    private String author;

    @SerializedName("title")
    private String title;

    @SerializedName("description")
    private String desc;

    @SerializedName("url")
    private String url;

    @SerializedName("urlToImage")
    private String image;

    @SerializedName("publishedAt")
    private String date;

    public Source getSource() {
        return source;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public String getUrl() {
        return url;
    }

    public String getImage() {
        return image;
    }

    public String getDate() {
        return date;
    }
}
