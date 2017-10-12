package edu.orangecoastcollege.cs273.flagquiz;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Allows the user to adjust quiz settings such as number of choices and regions
 */
public class SettingsActivity extends AppCompatActivity {

    /**
     * Creates an instance of <code>SettingsActivity</code> in the view
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_settings);

        // Enable home button (not enabled by default) to go back
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Use fragment to fill out the content
        getFragmentManager()
                .beginTransaction()
                .replace(android.R.id.content, new SettingsActivityFragment())
                .commit();
    }

    /**
     * Fragment used to load preferences from preferences.xml
     * Inner onCreate() method generates the GUI
     */
    public static class SettingsActivityFragment extends PreferenceFragment {

        /**
         * Creates preferences GUI from preferences.xml file in res/xml
         * @param savedInstanceState
         */
        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.preferences); // load from xml
        }
    }
}
