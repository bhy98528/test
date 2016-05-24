package com.example.bong.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Bong on 2016-03-30.
 */
public class Second_Fragment_Activity extends Fragment {
    private TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_second_fragment, container, false);
    }

    @Override
    public void onResume() {
        textView=(TextView)this.getActivity().findViewById(R.id.tv01);
        super.onResume();
    }

    public void setText(String str){
        textView.setText(str);
    }
}
