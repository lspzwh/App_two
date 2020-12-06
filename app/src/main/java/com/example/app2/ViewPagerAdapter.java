package com.example.app2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> fragmentList;
    private final List<String> fragmentTitle;
    ViewPagerAdapter(@NonNull FragmentManager fm,int behavior,List<Fragment> fragmentList,List<String> fragmentTitle) {
        super(fm,behavior);
        this.fragmentList=fragmentList;
        this.fragmentTitle=fragmentTitle;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
    public CharSequence getPageTitle(int position){
        return (CharSequence) fragmentTitle.get(position);
    }


}
