package com.example.vinove.tablayoutwithicononly;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    ViewPager viewPager;
    TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.viewPager_id);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new RecentsFragment(), "recents");
        adapter.addFragment(new NearbyFragment(), "favorite");
        adapter.addFragment(new FavoritesFragment(), "nearby");


        viewPager.setAdapter(adapter);

        tabLayout = findViewById(R.id.tabLayout_id);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.phone);
        tabLayout.getTabAt(1).setIcon(R.drawable.heart);
        tabLayout.getTabAt(2).setIcon(R.drawable.account);

    }
}
