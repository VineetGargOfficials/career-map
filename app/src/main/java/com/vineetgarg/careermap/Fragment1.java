package com.vineetgarg.careermap;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class Fragment1 extends Fragment {

    EditText nameEdt, contactEdt, ageEdt;
    RadioButton male, female;
    Button nextBtn;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_1, container, false);

        nextBtn = view.findViewById(R.id.button2);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                validateData();
                Fragment2 fragment2 = new Fragment2();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fragment2)
                        .addToBackStack(null) // Optional: Add to back stack for back navigation
                        .commit();
                View activityView = getActivity().findViewById(android.R.id.content);

                // Find the TextView within the inflated layout
                TextView textView = activityView.findViewById(R.id.dot1);

                // Get the drawable resource
                Drawable drawable = getResources().getDrawable(R.drawable.baseline_done_24);

                // Set the drawable on the TextView

                textView.setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);



            }
        });




        return view;
    }

    private boolean validateData() {
        if (TextUtils.isEmpty(nameEdt.getText().toString())){
            nameEdt.setError("Please Fill the Field");
            return false;
        }
        if (TextUtils.isEmpty(contactEdt.getText().toString())) {
            contactEdt.setError("Please Fill the Field");
            return false;
        }
        if ((contactEdt.getText().toString().length() != 10)) {
            contactEdt.setError("Please Enter Valid Contact Detail");
            return false;
        }

        if (TextUtils.isEmpty(ageEdt.getText().toString())) {
            ageEdt.setError("Please Fill the Field");
            return false;
        }

        if ((ageEdt.getText().toString().length() != 2)) {
            ageEdt.setError("Please Enter Valid Age");
            return false;
        }
        if (!male.isChecked() && !female.isChecked()) {
//            Toast.makeText(, "", Toast.LENGTH_SHORT).show();
//            Toast.makeText(this, "Please Choose Your Gender", Toast.LENGTH_SHORT).show();
            return false;
        }


        return true;

    }
}