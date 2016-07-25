package com.example.bs151.fragmentwithlistview;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {
    String[] versionName,api,releaseDate;
    TextView versionNameTextView,apiTextView,releaseDateTextView;
    public BlankFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_blank, container, false);
        versionNameTextView= (TextView) view.findViewById(R.id.versionNameTextView);
        apiTextView= (TextView) view.findViewById(R.id.apiTextView);
        releaseDateTextView= (TextView) view.findViewById(R.id.releaseDateTextView);
        versionName=this.getActivity().getResources().getStringArray(R.array.version_name);
        api=this.getActivity().getResources().getStringArray(R.array.api);
        releaseDate=this.getActivity().getResources().getStringArray(R.array.release_date);
        return view;
    }

    public void setData(int pos){
        versionNameTextView.setText(versionName[pos]);
        apiTextView.setText(api[pos]);
        releaseDateTextView.setText(releaseDate[pos]);
    }

}
