package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
     List<Fragment> fragmentList= new ArrayList<>();
     List<String> fragmentTitle=new ArrayList<>();
     ViewPager viewPager;
     TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager =findViewById(R.id.vp_tab);
        tabLayout=findViewById(R.id.tab_layout);

        fragmentTitle.add("全球热门视频");
        fragmentTitle.add("直播视频");
        fragmentTitle.add("学习资料");
        fragmentList.add(new Afragment());
        fragmentList.add((new Bfragment()));
        fragmentList.add((new Cfragment()));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager(),ViewPagerAdapter
                .BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT,fragmentList,fragmentTitle));
        tabLayout.setupWithViewPager(viewPager);

    }
}