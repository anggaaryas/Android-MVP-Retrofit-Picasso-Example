package indonesia.angarsalabs.recentwallstreetjournal.view.main;

import java.util.List;

import indonesia.angarsalabs.recentwallstreetjournal.model.Article;

/**
 * Angarsa Labs...!
 * Created by Angga on 21/06/2018.
 */
public interface MainInterface {
    void showList(List<Article> articles);
    void showArticle(String url);
}
