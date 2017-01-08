package com.alejandro.seccion_06_fragments.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alejandro.seccion_06_fragments.R;


public class DetailsFragment extends Fragment {


    private TextView details;


    public DetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_details, container, false);

        details = (TextView) view.findViewById(R.id.textViewDetails);

        // Inflate the layout for this fragment
        return view;
    }

    public void renderText(String text) {
        details.setText(text);
    }

}
