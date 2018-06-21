package indonesia.angarsalabs.recentwallstreetjournal.Service;

import indonesia.angarsalabs.recentwallstreetjournal.model.Data;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Angarsa Labs...!
 * Created by Angga on 21/06/2018.
 */
public interface WallstreetAPI {
    @GET("v2/everything?domains=wsj.com&apiKey=ccdc9e113c2042549554fed8c4c7ec7e")
    Call<Data> getResults();
}
