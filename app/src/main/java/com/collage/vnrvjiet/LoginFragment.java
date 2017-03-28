package com.collage.vnrvjiet;


import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import android.webkit.WebViewClient;
import android.webkit.WebViewFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {



private WebView webview;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_login, container, false);

         webview = (WebView) view.findViewById(R.id.webview1);
        webview.loadUrl("http://googleweblight.com/?lite_url=http%3A%2F%2Fwww.vnrvjiet.ac.in%2FLogin.aspx");
       /* webview.getSettings().setJavaScriptEnabled(true);*/
        WebSettings webSettings=webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webview.setWebViewClient(new WebViewClient());
        return view;
    }


    @Override
    public void onResume()
    {
        super.onResume();
        webview.onResume();

    }
    @Override
    public void onPause()
    {
        super.onPause();
        webview.onPause();

    }
}


