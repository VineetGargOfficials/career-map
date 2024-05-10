package com.vineetgarg.careermap;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Fragment3 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_3, container, false);
        Button prevBtn = view.findViewById(R.id.button);
        Button nextBtn = view.findViewById(R.id.button2);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment4 fragment4 = new Fragment4();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fragment4)
                        .addToBackStack(null) // Optional: Add to back stack for back navigation
                        .commit();
                View activityView = getActivity().findViewById(android.R.id.content);

                // Find the TextView within the inflated layout
                TextView textView = activityView.findViewById(R.id.dot3);

                // Get the drawable resource
                Drawable drawable = getResources().getDrawable(R.drawable.baseline_done_24);

                // Set the drawable on the TextView

                textView.setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);



            }
        });

        prevBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment2 fragment2 = new Fragment2();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fragment2)
                        .addToBackStack(null) // Optional: Add to back stack for back navigation
                        .commit();
                View activityView = getActivity().findViewById(android.R.id.content);

                // Find the TextView within the inflated layout
                TextView textView = activityView.findViewById(R.id.dot3);

                // Remove the drawable from the TextView
                textView.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);




            }
        });


        return  view;
    }
}