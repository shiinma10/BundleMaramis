package com.example.bundlemaramis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class DetailActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    Pegawai pegawaiDetail;
    TabFragmentAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tabLayout = (TabLayout)findViewById(R.id.tab_layout);
        viewPager = (ViewPager)findViewById(R.id.view_pager);
        Intent intent = getIntent();
        pegawaiDetail = (Pegawai) intent.getSerializableExtra("pegawainya");
        pagerAdapter=new TabFragmentAdapter(getSupportFragmentManager(),pegawaiDetail);
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setTabTextColors(getResources().getColor(R.color.colorsatu),getResources().getColor(R.color.colorsatu));
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
    }
}

