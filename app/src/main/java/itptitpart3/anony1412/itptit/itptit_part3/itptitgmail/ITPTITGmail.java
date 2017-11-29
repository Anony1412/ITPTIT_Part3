package itptitpart3.anony1412.itptit.itptit_part3.itptitgmail;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import itptitpart3.anony1412.itptit.itptit_part3.R;

/**
 * Created by Anony1412 on 11/27/2017.
 */

public class ITPTITGmail extends AppCompatActivity {

    private WebView webview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itptitgmail);

        webview = findViewById(R.id.wv_itptitGmail);
        webview.setWebViewClient(new WebViewClient());
        String urlGmail = "http://clb.it.ptit@gmail.com";
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl(urlGmail);
    }
}
