package adalwin.com.fragmentdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by aramar1 on 6/7/16.
 */
public class OneFragment extends Fragment{
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
    // non view related ininitialization
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        //inflate views here
        View view = inflater.inflate(R.layout.fragment1,container,false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        //this is where we do our lookups
        //and initialization
        TextView tvLabel = (TextView) view.findViewById(R.id.tvLabel);
        tvLabel.setText("Hello");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        //this is when activity is created
        super.onCreate(savedInstanceState);
    }
}

