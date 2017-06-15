package com.xujun.administrator.tagindicatordemo.base;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.xujun.viewpagertabindicator.TabPagerIndicator;

import java.util.List;

/**
 * @ explain:
 * @ author：xujun on 2016/7/30 18:48
 * @ email：gdutxiaoxu@163.com
 */
public class BaseViewPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> data;
    String[] titles;

    public BaseViewPagerAdapter(FragmentManager fm, List<Fragment> data, String[] titles) {
        super(fm);
        this.data = data;
        this.titles = titles;
    }

    @Override
    public int getCount() {
        return isEmpty() ? 0 : data.size();
    }

    boolean isEmpty() {
        return data == null || data.size() == 0;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position>= TabPagerIndicator.startOffet){
           return titles[position-TabPagerIndicator.startOffet];
        }else {
            return "全部分类";
        }
    }

    @Override
    public Fragment getItem(int position) {
        return this.data.get(position);

    }
}
