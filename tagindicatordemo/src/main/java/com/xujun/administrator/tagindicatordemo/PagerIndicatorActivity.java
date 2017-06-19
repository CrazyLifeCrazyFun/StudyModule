package com.xujun.administrator.tagindicatordemo;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.xujun.administrator.tagindicatordemo.base.BaseActivity;
import com.xujun.administrator.tagindicatordemo.base.BaseViewPagerAdapter;
import com.xujun.viewpagertabindicator.TabPagerIndicator;
import com.xujun.viewpagertabindicator.TabPagerIndicator.IndicatorMode;

import java.util.ArrayList;

public class PagerIndicatorActivity extends BaseActivity implements View.OnClickListener{

    private TabPagerIndicator  mPagerIndicator;
    private ViewPager mViewPager;
    private RelativeLayout mNagRoot;
    private TextView mTvTitle;
    private Button mBtnStyle;

    private ArrayList<Fragment> mFragments;
    private String[] mTitles;
    private BaseViewPagerAdapter mPagerAdapter;
    private boolean first;
    private TextView tv_all;

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_pager_indicator;
    }

    @Override
    protected void initView() {
        mPagerIndicator = (TabPagerIndicator) findViewById(R.id.pagerIndicator);
        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        tv_all=(TextView)findViewById(R.id.tv_all);
        mNagRoot = (RelativeLayout) findViewById(R.id.nag_root);
        mTvTitle = (TextView) findViewById(R.id.tv_title);
        mBtnStyle = (Button) findViewById(R.id.btn_style);
//        tv_all.setTextSize(TypedValue.COMPLEX_UNIT_PX,14);
        tv_all.setTypeface(null, Typeface.BOLD);
        tv_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mViewPager.setCurrentItem(0);
            }
        });
    }

    @Override
    protected void initListener() {
        mBtnStyle.setOnClickListener(this);
    }

    public void onColorClicked(View  view){
        int color = Color.parseColor(view.getTag().toString());
        mPagerIndicator.setIndicatorColor(color);
        mNagRoot.setBackgroundColor(color);
    }

    @Override
    protected void initData() {
        mTitles = this.getResources().getStringArray(R.array.fragments_titles);
        TestFragment testFragment = TestFragment.newInstance(0);
        TestFragment testFragment1 = TestFragment.newInstance(1);
        TestFragment testFragment2 = TestFragment.newInstance(2);
        TestFragment testFragment3 = TestFragment.newInstance(3);
        TestFragment testFragment4 = TestFragment.newInstance(4);
        TestFragment testFragment5 = TestFragment.newInstance(5);
        TestFragment testFragment6 = TestFragment.newInstance(6);

        mFragments = new ArrayList<>();
        mFragments.add(testFragment);
        mFragments.add(testFragment1);
        mFragments.add(testFragment2);
        mFragments.add(testFragment3);
        mFragments.add(testFragment4);
        mFragments.add(testFragment5);
        mFragments.add(testFragment6);

        mPagerAdapter = new BaseViewPagerAdapter(getSupportFragmentManager(), mFragments, mTitles);
        mViewPager.setAdapter(mPagerAdapter);
        mPagerIndicator.setViewPager(mViewPager);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_style:
                if(!first){
                    mPagerIndicator.setIndicatorMode(IndicatorMode.MODE_WEIGHT_EXPAND_SAME,
                            true);
                }else{
                    mPagerIndicator.setIndicatorMode(IndicatorMode.MODE_WEIGHT_EXPAND_NOSAME,
                            true);
                }
                first=!first;

                break;
            default:break;
        }
    }
}
