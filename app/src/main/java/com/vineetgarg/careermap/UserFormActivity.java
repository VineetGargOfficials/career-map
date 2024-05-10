package com.vineetgarg.careermap;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipDrawable;
import com.google.android.material.chip.ChipGroup;
import com.vineetgarg.careermap.courses.CSActivity;
import com.vineetgarg.careermap.courses.CaActivity;
import com.vineetgarg.careermap.courses.JournalismActivity;
import com.vineetgarg.careermap.courses.LLBActivity;
import com.vineetgarg.careermap.courses.PharmacyActivity;

public class UserFormActivity extends AppCompatActivity {

    FrameLayout frameLayout;


    Button submitBtn;
    EditText nameEdt, contactEdt, ageEdt, yearOfPassEdt, higherStudyEdt;
    RadioButton male, female, tenth, twelfth;
    ImageButton hobbiesBtn, skillsBtn;
    ChipGroup hobbiesChipGroup, skillsChipGroup;
    EditText hobbiesEdt, skillsEdt;
    Spinner fieldOfStudySpinner, areaOfInterestSpinner;
    ArrayAdapter<CharSequence> areaAdapter;
    int selectedFieldPosition = 0;
    String selectedAreaOfInterest = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_user_form);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();


        Fragment1 fragment1 = new Fragment1();
        fragmentTransaction.add(R.id.fragment_container, fragment1);
        fragmentTransaction.commit();

//
//        hobbiesBtn = findViewById(R.id.hobbiesBtn);
//        hobbiesEdt = findViewById(R.id.hobbiesEdt);
//        hobbiesChipGroup = findViewById(R.id.hobbiesChipEntryGroup);
//        submitBtn = findViewById(R.id.submitBtn);
//        nameEdt = findViewById(R.id.nameEdt);
//        contactEdt = findViewById(R.id.contactEdt);
//        ageEdt = findViewById(R.id.ageEdt);
//        yearOfPassEdt = findViewById(R.id.yearOfPassEdt);
//        higherStudyEdt = findViewById(R.id.higherStudyEdt);
//        male = findViewById(R.id.maleRadioBtn);
//        female = findViewById(R.id.femaleRadioBtn);
//        tenth = findViewById(R.id.tenthRadioButton);
//        twelfth = findViewById(R.id.TwelthRadioButton);
//        fieldOfStudySpinner = findViewById(R.id.fieldOfStudySpinner_options);
//        areaOfInterestSpinner = findViewById(R.id.areaOfInterestSpinner_options);
//        skillsEdt = findViewById(R.id.skillsEdt);
//        skillsBtn = findViewById(R.id.skillsBtn);
//        skillsChipGroup = findViewById(R.id.skillsChipEntryGroup);


//        hobbiesBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                hobbiesbtnClick(v);
//            }
//        });
//        skillsBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                skillsbtnClick(v);
//            }
//        });
//

//
//        // Create ArrayAdapter for fieldOfStudySpinner
//        ArrayAdapter<CharSequence> fieldAdapter = ArrayAdapter.createFromResource(this,
//                R.array.fieldOfStudy_option_array, android.R.layout.simple_spinner_item);
//        fieldAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//        fieldOfStudySpinner.setAdapter(fieldAdapter);
//
//        // Set onItemSelectedListener for fieldOfStudySpinner
//        fieldOfStudySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                selectedFieldPosition = position;
//                updateAreaOfInterestSpinner();
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                // Do nothing
//            }
//        });
//
//        // Set onItemSelectedListener for areaOfInterestSpinner
//        areaOfInterestSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//                selectedAreaOfInterest = parent.getItemAtPosition(position).toString();
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//                // Do nothing
//            }
//        });
//
//        submitBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String username = nameEdt.getText().toString();
//                if (validateData()) {
//
//                    if (selectedAreaOfInterest.equals("Business Studies") || selectedAreaOfInterest.equals("Finance") || selectedAreaOfInterest.equals("Accountancy") ) {
//                        Intent ca_intent = new Intent(UserFormActivity.this, CaActivity.class);
//                        ca_intent.putExtra("keyname", username);
//                        startActivity(ca_intent);
//                        finish();
//                    }
//                    else if (selectedAreaOfInterest.equals("Business Laws")) {
//                        Intent intent = new Intent(UserFormActivity.this, CSActivity.class);
//                        intent.putExtra("keyname", username);
//                        startActivity(intent);
//                        finish();
//                    } else if (selectedAreaOfInterest.equals("Civil Litigation") || selectedAreaOfInterest.equals("Legal Analysis")) {
//                        Intent intent = new Intent(UserFormActivity.this, LLBActivity.class);
//                        intent.putExtra("keyname", username);
//                        startActivity(intent);
//                        finish();
//                    } else if (selectedAreaOfInterest.equals("Investigative Journalism") || selectedAreaOfInterest.equals("Political Reporting")) {
//                        Intent intent = new Intent(UserFormActivity.this, JournalismActivity.class);
//                        intent.putExtra("keyname", username);
//                        startActivity(intent);
//                        finish();
//                    }
//                    else if (selectedAreaOfInterest.equals("Pharmaceutical Research") || selectedAreaOfInterest.equals("Clinical Pharmacy")) {
//                        Intent intent = new Intent(UserFormActivity.this, PharmacyActivity.class);
//                        intent.putExtra("keyname", username);
//                        startActivity(intent);
//                        finish();
//                    }
//
//
//                }
//
//            }
//        });


    }

    private void updateAreaOfInterestSpinner() {
        switch (selectedFieldPosition) {
            case 0:
                areaAdapter = ArrayAdapter.createFromResource(UserFormActivity.this,
                        R.array.default_areaOfInterest_option_array, android.R.layout.simple_spinner_item);
                break;
            case 1:
                areaAdapter = ArrayAdapter.createFromResource(UserFormActivity.this,
                        R.array.areaOfInterest_option_array1, android.R.layout.simple_spinner_item);
                break;
            case 2:
                areaAdapter = ArrayAdapter.createFromResource(UserFormActivity.this,
                        R.array.areaOfInterest_option_array2, android.R.layout.simple_spinner_item);
                break;
            case 3:
                areaAdapter = ArrayAdapter.createFromResource(UserFormActivity.this,
                        R.array.areaOfInterest_option_array3, android.R.layout.simple_spinner_item);
                break;
            case 4:
                areaAdapter = ArrayAdapter.createFromResource(UserFormActivity.this,
                        R.array.areaOfInterest_option_array4, android.R.layout.simple_spinner_item);
                break;

        }

        if (areaAdapter != null) {
            areaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            areaOfInterestSpinner.setAdapter(areaAdapter);
        }
    }


    private void skillsbtnClick(View v) {
        Chip chip = new Chip(this);

        ChipDrawable drawable = ChipDrawable.createFromAttributes(this, null, 0, com.google.android.material.R.style.Widget_MaterialComponents_Chip_Entry);
        chip.setChipDrawable(drawable);

        chip.setCheckable(false);
        chip.setClickable(false);
        chip.setPadding(60, 10, 60, 10);
        chip.setText(skillsEdt.getText().toString());
        chip.setOnCloseIconClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skillsChipGroup.removeView(chip);
            }
        });
        skillsChipGroup.addView(chip);
        skillsEdt.setText("");
    }

    //  Validating Data
    private boolean validateData() {
//        Name
        if(TextUtils.isEmpty(nameEdt.getText().toString())) {
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

        if(TextUtils.isEmpty(yearOfPassEdt.getText().toString())) {
            yearOfPassEdt.setError("Please Fill the Field");
            return false;
        }

        if ((yearOfPassEdt.getText().toString().length() != 4)) {
            yearOfPassEdt.setError("Please Enter Valid Age");
            return false;
        }

        if (!male.isChecked() && !female.isChecked()) {
            Toast.makeText(this, "Please Choose Your Gender", Toast.LENGTH_SHORT).show();
            return false;
        }

        if (!tenth.isChecked() && !twelfth.isChecked()) {
            Toast.makeText(this, "Please Choose Your Qualification", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (!(higherStudyEdt.getText().toString().equalsIgnoreCase("Yes")) && !(higherStudyEdt.getText().toString().equalsIgnoreCase("No")) && !(higherStudyEdt.getText().toString().equalsIgnoreCase("YES")) && !(higherStudyEdt.getText().toString().equalsIgnoreCase("NO")) && !(higherStudyEdt.getText().toString().equalsIgnoreCase("yes")) && !(higherStudyEdt.getText().toString().equalsIgnoreCase("no"))){
            higherStudyEdt.setError("Please Enter YES or NO");
            return false;
        }
        if (selectedFieldPosition == 0) {
            Toast.makeText(this, "Please Select the Field of Study", Toast.LENGTH_SHORT).show();
            return false;
        }
        if (selectedAreaOfInterest.equals("Area Of Interest")) {
            Toast.makeText(this, "Please Select the Area Of Interest", Toast.LENGTH_SHORT).show();
            return false;
        }



        return true;
    }


//    Hobbies
    private void hobbiesbtnClick(View view) {
    Chip chip = new Chip(this);

    ChipDrawable drawable = ChipDrawable.createFromAttributes(this, null, 0, com.google.android.material.R.style.Widget_MaterialComponents_Chip_Entry);
    chip.setChipDrawable(drawable);

    chip.setCheckable(false);
    chip.setClickable(false);
    chip.setPadding(60, 10, 60, 10);
    chip.setText(hobbiesEdt.getText().toString());
    chip.setOnCloseIconClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            hobbiesChipGroup.removeView(chip);
        }
    });
    hobbiesChipGroup.addView(chip);
    hobbiesEdt.setText("");

}




}