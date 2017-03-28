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


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public String url;
public int pos=getArguments().getInt("pos");
private WebView webView;
    public BlankFragment() {

    }

    public String setUrl(int posi)
    {

        if(posi==0)
            url="http://www.vnrvjiet.ac.in/DisplayPage.aspx?page=qg&ItemID=50";
        if(posi==1)
            url="http://www.vnrvjiet.ac.in/DisplayPage.aspx?page=ic&ItemID=50";

        return url;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       // pos=getArguments();

       View view= inflater.inflate(R.layout.fragment_blank, container, false);
        url= setUrl(pos);
        webView=(WebView) view.findViewById(R.id.webview1);
        webView.loadUrl("urle");
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());

        return view;
    }

}
