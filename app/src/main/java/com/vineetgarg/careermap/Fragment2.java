package com.vineetgarg.careermap;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Fragment2 extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_2, container, false);
        Button prevBtn = view.findViewById(R.id.button);
        Button nextBtn = view.findViewById(R.id.button2);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment3 fragment3 = new Fragment3();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fragment3)
                        .addToBackStack(null) // Optional: Add to back stack for back navigation
                        .commit();
                View activityView = getActivity().findViewById(android.R.id.content);

                // Find the TextView within the inflated layout
                TextView textView = activityView.findViewById(R.id.dot2);

                // Get the drawable resource
                Drawable drawable = getResources().getDrawable(R.drawable.baseline_done_24);

                // Set the drawable on the TextView

                textView.setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);



            }
        });

        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment1 fragment1 = new Fragment1();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fragment1)
                        .addToBackStack(null) // Optional: Add to back stack for back navigation
                        .commit();
                View activityView = getActivity().findViewById(android.R.id.content);

                // Find the TextView within the inflated layout
                TextView textView = activityView.findViewById(R.id.dot2);

                // Remove the drawable from the TextView
                textView.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);




            }
        });


        return  view;
    }
}