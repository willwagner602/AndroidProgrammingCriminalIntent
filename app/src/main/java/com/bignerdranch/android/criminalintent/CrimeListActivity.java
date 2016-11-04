package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by wwagner on 11/4/2016.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
