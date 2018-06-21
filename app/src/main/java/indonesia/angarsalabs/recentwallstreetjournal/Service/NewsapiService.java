package indonesia.angarsalabs.recentwallstreetjournal.Service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Angarsa Labs...!
 * Created by Angga on 21/06/2018.
 */
public class NewsapiService {
    private Retrofit retrofit = null;

    public WallstreetAPI getAPI() {
        String BASE_URL = "http://newsapi.org/";

        if (retrofit == null) {
            retrofit = new Retrofit
                    .Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit.create(WallstreetAPI.class);
    }
}
