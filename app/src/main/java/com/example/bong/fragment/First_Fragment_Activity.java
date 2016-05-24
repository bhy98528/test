package com.example.bong.fragment;

        import android.app.Activity;
        import android.app.Fragment;
        import android.os.Bundle;
        import android.support.annotation.Nullable;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.EditText;

/**
 * Created by Bong on 2016-03-30.
 */
public class First_Fragment_Activity extends Fragment{
    private EditText edit_01;
    private Button button;
    OnHeadlineSelectedListener mCallback;
    public interface OnHeadlineSelectedListener{
        public void onArticleSelected(String str);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_first_fragment, container, false);



    }

    @Override
    public void onResume() {
        edit_01=(EditText)this.getActivity().findViewById(R.id.ed_01);
        button=(Button)this.getActivity().findViewById(R.id.bt01);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 mCallback.onArticleSelected(edit_01.getText().toString());
            }
        });
        super.onResume();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mCallback=(OnHeadlineSelectedListener)activity;
        }catch (ClassCastException e){
            throw new ClassCastException(activity.toString()
                    +"must implement OnHeadlineSelectedListener");
        }
    }
}
