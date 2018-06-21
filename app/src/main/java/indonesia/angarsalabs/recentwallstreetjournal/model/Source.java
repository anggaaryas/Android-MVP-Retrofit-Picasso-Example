package indonesia.angarsalabs.recentwallstreetjournal.model;

import com.google.gson.annotations.SerializedName;

/**
 * Angarsa Labs...!
 * Created by Angga on 21/06/2018.
 */
public class Source {
    @SerializedName("id")
    private String id;

    @SerializedName("name")
    private String name;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
