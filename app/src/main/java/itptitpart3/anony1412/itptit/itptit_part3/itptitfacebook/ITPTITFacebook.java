package itptitpart3.anony1412.itptit.itptit_part3.itptitfacebook;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import itptitpart3.anony1412.itptit.itptit_part3.R;

/**
 * Created by Anony1412 on 11/26/2017.
 */

public class ITPTITFacebook extends AppCompatActivity {

    private WebView webview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itptitfacebook);

        webview = findViewById(R.id.wv_itptitFb);
        webview.setWebViewClient(new WebViewClient());
        String urlFb = "https://www.facebook.com/messages/t/ITPTIT";
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl(urlFb);
    }
}
