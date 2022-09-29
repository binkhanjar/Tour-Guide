package com.example.android.tourguide;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class ViewPagerAdapter extends FragmentPagerAdapter {


    /**
     * Context of the app
     */
    private Context mContext;

    public ViewPagerAdapter(Context context, @NonNull FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HistoricalFragment();
        } else if (position == 1) {
            return new HotelsFragment();
        } else {
            return new ShoppingFragment();
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0) {
            return mContext.getString(R.string.historical);
        } else if (position == 1) {
            return mContext.getString(R.string.hotels);
        } else {
            return mContext.getString(R.string.shopping);
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
