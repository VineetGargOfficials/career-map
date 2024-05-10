package com.vineetgarg.careermap;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Fragment6 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_6, container, false);
        Button prevBtn = view.findViewById(R.id.button);



        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment5 fragment5 = new Fragment5();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fragment5)
                        .addToBackStack(null) // Optional: Add to back stack for back navigation
                        .commit();
                View activityView = getActivity().findViewById(android.R.id.content);

                // Find the TextView within the inflated layout
                TextView textView = activityView.findViewById(R.id.dot6);

                // Remove the drawable from the TextView
                textView.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);

            }
        });


        return  view;
    }
}