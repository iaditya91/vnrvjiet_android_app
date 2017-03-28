package com.collage.vnrvjiet;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class AboutFragment extends Fragment{

    private WebView webView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_about, container, false);
        webView= (WebView) view.findViewById(R.id.webview1);
        webView.loadUrl("http://googleweblight.com/?lite_url=http%3A%2F%2Fwww.vnrvjiet.ac.in%2FDisplayPage.aspx%3Fpage%3Dga%26ItemID%3D56");
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());
        return view;
    }




}
