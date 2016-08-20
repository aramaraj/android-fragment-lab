package adalwin.com.fragmentdemo;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FragmentActivity extends AppCompatActivity {
    OneFragment oneFragment;
    TwoFragment twoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        oneFragment = new OneFragment();
        twoFragment = new TwoFragment();

        //Activity's new role
        // 1. Adding and removing fragments
        // 2. Communication between fragments
        // 3. Navigation between fragments/activities
        // 4. ActionBar
    }




    public void onClickFr1(View view) {
        //1. get the FragmentManager
        FragmentManager fm = getSupportFragmentManager();
        //2. create a FragmentTransaction
        FragmentTransaction ft = fm.beginTransaction();
        //3. Add  or remove Fragments

        ft.replace(R.id.frMainActivity,oneFragment);
        ft.addToBackStack("one");
        // commit the TRansaction
        ft.commit();

    }
    public void onClickFr2(View view) {
        //1. get the FragmentManager
        FragmentManager fm = getSupportFragmentManager();
        //2. create a FragmentTransaction
        FragmentTransaction ft = fm.beginTransaction();
        //3. Add  or remove Fragments
        ft.replace(R.id.frMainActivity,twoFragment);
        ft.addToBackStack("two");
        // commit the TRansaction
        ft.commit();
    }
}
