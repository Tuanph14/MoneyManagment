package com.edu.t2f.managemoney.views;

import android.content.Context;
import android.support.design.widget.AppBarLayout;
import android.util.AttributeSet;

public class CustomAppBarLayout extends AppBarLayout {

    private boolean mScrollingEnabled;

    public CustomAppBarLayout(Context context) {
        super(context);
    }

    public CustomAppBarLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setScrollingEnabled(boolean scrollingEnabled) {
        this.mScrollingEnabled = scrollingEnabled;
    }

    @Override
    public boolean canScrollHorizontally(int direction) {
        return mScrollingEnabled;
    }

    @Override
    public boolean canScrollVertically(int direction) {
        return mScrollingEnabled;
    }

}
