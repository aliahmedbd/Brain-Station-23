package com.example.bs151.fragmentwithlistview;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListviewFragment extends Fragment {
    onSelectedPosition onSelectedPosition;
    ListView listView;
    ArrayAdapter<String> adapter;
    String[] versions;
    public ListviewFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_listview, container, false);
        listView= (ListView) view.findViewById(R.id.listview);
        versions=getResources().getStringArray(R.array.version_name);
        adapter=new ArrayAdapter<String>(getActivity(),R.layout.listview_layout,R.id.rawItemTextView,versions);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                onSelectedPosition.selectedPosition(pos);
            }
        });
        return view;
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        onSelectedPosition= (onSelectedPosition) context;
    }

    public interface onSelectedPosition{
        public void selectedPosition(int position);
    }
}
