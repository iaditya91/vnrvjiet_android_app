package com.collage.vnrvjiet;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class GallaryFragment extends Fragment {
   // private WebView webView;

    android.app.FragmentTransaction fragmentTransaction;
    public GallaryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_gallary, container, false);
       // webView = (WebView) view.findViewById(R.id.webview1);
       // WebSettings webSettings=webView.getSettings();
        ListView listView=(ListView) view.findViewById(R.id.listview1);
        String[] gallaryitems = {"Infrastructure", "Felicitation to Sri.C.V.Rao Garu" ,"Open House","INDAS","Sports Facilities","NSS", "Convergence"
                                  ,"Sintillashunz","Womens Day","Annual Day","Cultural Day"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,gallaryitems);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            /*  fragmentTransaction=getFragmentManager().beginTransaction();

                 Bundle bd= new Bundle();
                bd.putInt("pos",position);

                BlankFragment fragmentB = new BlankFragment ();
                fragmentB .setArguments(bd);
                fragmentTransaction.replace(R.id.main_container,fragmentB);
                fragmentTransaction.commit();  */


                Intent i=new Intent(Intent.ACTION_VIEW);
             switch(position)
                {
                    case 0:
                       /* webView.loadUrl("http://www.vnrvjiet.ac.in/DisplayPage.aspx?page=qg&ItemID=50");
                        WebSettings webSettings0=webView.getSettings();
                        webSettings0.setJavaScriptEnabled(true);
                        webView.setWebViewClient(new WebViewClient());
                        break;  */

                        i.setData(Uri.parse("http://www.vnrvjiet.ac.in/DisplayPage.aspx?page=qg&ItemID=50"));
                        startActivity(i);
                        break;
                   case 1:
                      /*  webView.loadUrl("http://www.vnrvjiet.ac.in/DisplayPage.aspx?page=ic&ItemID=50");
                        WebSettings webSettings1=webView.getSettings();
                        webSettings1.setJavaScriptEnabled(true);
                        webView.setWebViewClient(new WebViewClient());
                        break;  */
                       /* Intent i=new Intent(Intent.ACTION_VIEW); */
                        i.setData(Uri.parse("http://www.vnrvjiet.ac.in/DisplayPage.aspx?page=ic&ItemID=50"));
                        startActivity(i);
                        break;
                   case 2:
                     /*   webView.loadUrl("http://www.vnrvjiet.ac.in/DisplayPage.aspx?page=cqq&ItemID=50");
                        WebSettings webSettings2=webView.getSettings();
                        webSettings2.setJavaScriptEnabled(true);
                        webView.setWebViewClient(new WebViewClient());
                        break;  */
                        /*Intent i=new Intent(Intent.ACTION_VIEW);  */
                        i.setData(Uri.parse("http://www.vnrvjiet.ac.in/DisplayPage.aspx?page=cqq&ItemID=50"));
                        startActivity(i);
                        break;

                    case 3:
                      /*  webView.loadUrl("http://www.vnrvjiet.ac.in/DisplayPage.aspx?page=gi&ItemID=50");
                        WebSettings webSettings3=webView.getSettings();
                        webSettings3.setJavaScriptEnabled(true);
                        webView.setWebViewClient(new WebViewClient());
                        break;  */

                       i.setData(Uri.parse("http://www.vnrvjiet.ac.in/DisplayPage.aspx?page=gi&ItemID=50"));
                        startActivity(i);
                        break;
                   case 4:
                      /*  webView.loadUrl("http://www.vnrvjiet.ac.in/DisplayPage.aspx?page=ia&ItemID=50");
                        WebSettings webSettings4=webView.getSettings();
                        webSettings4.setJavaScriptEnabled(true);
                        webView.setWebViewClient(new WebViewClient());
                        break;  */
                       i.setData(Uri.parse("http://www.vnrvjiet.ac.in/DisplayPage.aspx?page=ia&ItemID=50"));
                        startActivity(i);
                        break;
                   case 5:
                    /*    webView.loadUrl("http://www.vnrvjiet.ac.in/DisplayPage.aspx?page=gs&ItemID=50");
                        WebSettings webSettings5=webView.getSettings();
                        webSettings5.setJavaScriptEnabled(true);
                        webView.setWebViewClient(new WebViewClient());
                        break;  */

                       i.setData(Uri.parse("http://www.vnrvjiet.ac.in/DisplayPage.aspx?page=gs&ItemID=50"));
                        startActivity(i);
                        break;
                     case 6:
                      /*  webView.loadUrl("http://www.vnrvjiet.ac.in/DisplayPage.aspx?page=qk&ItemID=50");
                        WebSettings webSettings6=webView.getSettings();
                        webSettings6.setJavaScriptEnabled(true);
                        webView.setWebViewClient(new WebViewClient());
                        break;  */

                        i.setData(Uri.parse("http://www.vnrvjiet.ac.in/DisplayPage.aspx?page=qk&ItemID=50"));
                        startActivity(i);
                        break;
                     case 7:
                  /*      webView.loadUrl("http://www.vnrvjiet.ac.in/DisplayPage.aspx?page=qm&ItemID=50");
                        WebSettings webSettings7=webView.getSettings();
                        webSettings7.setJavaScriptEnabled(true);
                        webView.setWebViewClient(new WebViewClient());
                        break;*/

                        i.setData(Uri.parse("http://www.vnrvjiet.ac.in/DisplayPage.aspx?page=qm&ItemID=50"));
                        startActivity(i);
                        break;
                   case 8:
                      /*  webView.loadUrl("http://www.vnrvjiet.ac.in/DisplayPage.aspx?page=qi&ItemID=50");
                        WebSettings webSettings8=webView.getSettings();
                        webSettings8.setJavaScriptEnabled(true);
                        webView.setWebViewClient(new WebViewClient());
                        break;  */

                       i.setData(Uri.parse("http://www.vnrvjiet.ac.in/DisplayPage.aspx?page=qi&ItemID=50"));
                        startActivity(i);
                        break;
                    case 9:
                      /*  webView.loadUrl("http://www.vnrvjiet.ac.in/DisplayPage.aspx?page=qo&ItemID=50");
                        WebSettings webSettings9=webView.getSettings();
                        webSettings9.setJavaScriptEnabled(true);
                        webView.setWebViewClient(new WebViewClient());
                        break;*/

                       i.setData(Uri.parse("http://www.vnrvjiet.ac.in/DisplayPage.aspx?page=qo&ItemID=50"));
                        startActivity(i);
                        break;
                    case 10:
                     /*   webView.loadUrl("http://www.vnrvjiet.ac.in/DisplayPage.aspx?page=sa&ItemID=50");
                        WebSettings webSettings10=webView.getSettings();
                        webSettings10.setJavaScriptEnabled(true);
                        webView.setWebViewClient(new WebViewClient());
                        break;*/
                      i.setData(Uri.parse("http://www.vnrvjiet.ac.in/DisplayPage.aspx?page=sa&ItemID=50"));
                      startActivity(i);
                        break;







                }
            }
        });

        listView.setAdapter(arrayAdapter);
        return view;

    }

}
