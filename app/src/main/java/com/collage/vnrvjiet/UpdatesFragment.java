package com.collage.vnrvjiet;


import android.graphics.Bitmap;
import android.os.Bundle;

import android.os.Message;
import android.support.v4.app.NotificationCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;
import android.app.FragmentManager;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.logging.Logger;


/**
 * A simple {@link Fragment} subclass.
 */
public class UpdatesFragment extends Fragment {

   private WebView webView;
    public UpdatesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_updates, container, false);
        webView=(WebView) view.findViewById(R.id.webview1);
        webView.loadUrl("http://www.vnrvjiet.ac.in/ViewAllAnnouncementPageNew.aspx");
        WebSettings webSettings=webView.getSettings();
      //  webSettings.setJavaScriptEnabled(true);

        webView.getSettings().setSupportMultipleWindows(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webSettings.setSupportMultipleWindows(true);
        //webView.setWebViewClient(new WebViewClient());



    webView.setWebChromeClient(new WebChromeClient(){

        public boolean onCreateWindow(WebView view, boolean isDialog,
                                      boolean isUserGesture, Message resultMsg) {


            resultMsg.sendToTarget();
            return true;
        }



    });








            return view;




        }}