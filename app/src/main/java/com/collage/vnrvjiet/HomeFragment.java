package com.collage.vnrvjiet;


import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewFragment;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

   private ImageView imageview1;
    private ImageView imageView2;
    private ImageView imageView4;
    android.app.FragmentTransaction fragmentTransaction;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_home, container, false);

        imageview1=(ImageView) view.findViewById(R.id.gallery);
        imageview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_container,new GallaryFragment());
                fragmentTransaction.commit();
              /*  getSupportActionBar().setTitle("Gallery");*/

            }
        } );

        imageView2=(ImageView) view.findViewById(R.id.updates);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_container,new UpdatesFragment());
                fragmentTransaction.commit();
              /*  getSupportActionBar().setTitle("Gallery");*/

            }
        } );

        imageView4=(ImageView) view.findViewById(R.id.cams);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentTransaction=getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_container,new CamsFragment());
                fragmentTransaction.commit();
              /*  getSupportActionBar().setTitle("Gallery");*/

            }
        } );

        return view;
    }

}
