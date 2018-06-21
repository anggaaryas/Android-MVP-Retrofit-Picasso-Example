package indonesia.angarsalabs.recentwallstreetjournal.view.webview;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import indonesia.angarsalabs.recentwallstreetjournal.R;

public class WebViewActivity extends AppCompatActivity {
    WebView webView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        Intent mIntent = getIntent();
        String url = mIntent.getStringExtra("URL");
        webView = findViewById(R.id.wv_webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
    }

}
