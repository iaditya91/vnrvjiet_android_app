package com.collage.vnrvjiet;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.widget.ImageView;

import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

import android.view.MenuInflater;
import android.view.MenuItem;



public class Vnrvjiet extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle mtoggle;
    private ImageView imageView1;
    android.app.FragmentTransaction fragmentTransaction;
    NavigationView navigationView;

    @Override
    protected void onResume() {
        super.onResume();
    }

    @RequiresApi(api = Build.VERSION_CODES.GINGERBREAD)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vnrvjiet);










        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mtoggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(mtoggle);
        mtoggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

       fragmentTransaction= getFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.main_container,new HomeFragment());
        fragmentTransaction.commit();
        getSupportActionBar().setTitle("VnrVjiet");
        navigationView=(NavigationView) findViewById(R.id.navigation_view);


        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId())
                {
                    case R.id.nav_item1:
                        fragmentTransaction=getFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container,new HomeFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Home");
                        drawerLayout.closeDrawers();

                        break;
                    case R.id.nav_item2:
                        fragmentTransaction=getFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container,new LoginFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("login");
                        drawerLayout.closeDrawers();

                        break;
                    case R.id.nav_item3:
                        fragmentTransaction=getFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container,new AlumniFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Alumni");
                        drawerLayout.closeDrawers();

                        break;
                    case R.id.nav_item4:
                        fragmentTransaction=getFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container,new FeedbackFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Feedback");
                        drawerLayout.closeDrawers();

                        break;

                }
                return true;
            }
        });



    }


    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater minflate = getMenuInflater();
        minflate.inflate(R.menu.main_menu, menu);


        return super.onCreateOptionsMenu(menu);

    }






    public boolean onOptionsItemSelected(MenuItem item) {
        if(mtoggle.onOptionsItemSelected(item) )
        {
            return true;
        }
        switch (item.getItemId()) {
            case R.id.about_us:
                fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_container, new AboutFragment());
                fragmentTransaction.commit();
                getSupportActionBar().setTitle("About Us");


                break;
            case R.id.location:
                fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main_container, new RoutemapFragment());
                fragmentTransaction.commit();
                getSupportActionBar().setTitle("Route Map");


                break;
            case R.id.gray:

                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.grey)));
                if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.LOLLIPOP){
                  /*  Window window = getWindow();*/
               getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.grey));}
                break;
            case R.id.pink:

                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.pink)));
                if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.LOLLIPOP)
                  /*  Window window = getWindow();*/
                {getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                    getWindow().setStatusBarColor(getResources().getColor(R.color.pink));}
                break;
            case R.id.blue:

                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.blue)));
                if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.LOLLIPOP){
                  /*  Window window = getWindow();*/
                    getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.blue));}
                break;
            case R.id.black:

                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));
                if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.LOLLIPOP){
                  /*  Window window = getWindow();*/
                    getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.black));}
                break;
            case R.id.green:

                getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.green)));
                if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.LOLLIPOP){
                  /*  Window window = getWindow();*/
                    getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                getWindow().setStatusBarColor(getResources().getColor(R.color.green));}
                break;



        }
        return super.onOptionsItemSelected(item);
    }
}

