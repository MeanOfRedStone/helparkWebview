package com.example.helparkwebview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.*;

public class MainActivity extends AppCompatActivity {
    private WebView webview = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webview = findViewById(R.id.webview_1);
        webview.setWebViewClient(new WebViewClient());
        webview.setWebContentsDebuggingEnabled(true);

        webview.loadUrl("http://3.34.114.142:8080/");

        webview.getSettings().setSupportZoom(false);  // 줌 설정 여부
        webview.getSettings().setBuiltInZoomControls(true);  // 줌 확대/축소 버튼 여부

        webview.getSettings().setJavaScriptEnabled(true); // 자바스크립트 사용여부
        webview.getSettings().setJavaScriptCanOpenWindowsAutomatically(true); // javascript가 window.open()을 사용할 수 있도록 설정
        webview.getSettings().setSupportMultipleWindows(true); // 멀티 윈도우 사용 여부
        //웹뷰를 통해 Content URL 에 접근 사용 여부
        webview.getSettings().setAllowContentAccess(true);
        webview.getSettings().setLoadWithOverviewMode(true);  // WebView 화면크기에 맞추도록 설정 - setUseWideViewPort 와 같이 써야함
        webview.getSettings().setUseWideViewPort(true);  // wide viewport 설정 - setLoadWithOverviewMode 와 같이 써야함

    }
}