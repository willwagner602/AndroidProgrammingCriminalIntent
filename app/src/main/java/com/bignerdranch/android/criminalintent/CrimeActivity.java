package com.bignerdranch.android.criminalintent;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.util.Log;

import java.util.UUID;

public class CrimeActivity extends SingleFragmentActivity {
    private static final String EXTRA_CRIME_ID = "com.bignerdranch.android.criminalintent.crime_id";
    public static final String CRIME_INDEX = "com.bignerdranch.android.criminalintent.crime_index";

    public static Intent newIntent(Context packageContext, UUID crimeId) {
        Intent intent = new Intent(packageContext, CrimeActivity.class);
        intent.putExtra(EXTRA_CRIME_ID, crimeId);
        return intent;
    }

    @Override
    protected Fragment createFragment() {
        UUID crimeId = (UUID) getIntent().getSerializableExtra(EXTRA_CRIME_ID);
        Intent data = new Intent();
        data.putExtra(CRIME_INDEX, getIntent().getIntExtra(CRIME_INDEX, -1));
        setResult(RESULT_OK, data);
        return CrimeFragment.newInstance(crimeId);
    }
}
