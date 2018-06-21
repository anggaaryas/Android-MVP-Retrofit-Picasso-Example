package indonesia.angarsalabs.recentwallstreetjournal.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Angarsa Labs...!
 * Created by Angga on 21/06/2018.
 */
public class Data {
    @SerializedName("status")
    private String status;

    @SerializedName("totalResults")
    private int totalResult;

    @SerializedName("articles")
    private List<Article> articles;

    public String getStatus() {
        return status;
    }

    public int getTotalResult() {
        return totalResult;
    }

    public List<Article> getArticles() {
        return articles;
    }
}
