package com.example.bong.fragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity implements First_Fragment_Activity.OnHeadlineSelectedListener {
    @Override
    public void onArticleSelected(String str) {

        Second_Fragment_Activity Second_fragment = (Second_Fragment_Activity)getFragmentManager().findFragmentById(R.id.fragment2);
        Second_fragment.setText(str);



        ///////fdfghjkjhgfdsdfghjk
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }



}
