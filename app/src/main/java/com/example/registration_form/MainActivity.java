
package com.example.registration_form;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText username = findViewById(R.id.Username);
        EditText name = findViewById(R.id.Full_name);
        EditText country = findViewById(R.id.Country);
        EditText email = findViewById(R.id.Email);
        EditText phone = findViewById(R.id.Phone);
        EditText password = findViewById(R.id.Password);

        RadioButton male = findViewById(R.id.radioButton);
        RadioButton female = findViewById(R.id.radioButton2);
        CheckBox terms = findViewById(R.id.checkBox);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(v -> {

            String user = username.getText().toString();
            String fullName = name.getText().toString();
            String userCountry = country.getText().toString();
            String userEmail = email.getText().toString();
            String userPhone = phone.getText().toString();
            String userPassword = password.getText().toString();

            String gender = "Not selected";

            if (male.isChecked()) {
                gender = "Male";
            } else if (female.isChecked()) {
                gender = "Female";
            }

            String termsAccepted = "No";

            if (terms.isChecked()) {
                termsAccepted = "Yes";
            }

            String details = "Username: " + user +
                    "\nFull name: " + fullName +
                    "\nCountry: " + userCountry +
                    "\nEmail: " + userEmail +
                    "\nPhone: " + userPhone +
                    "\nPassword: " + userPassword +
                    "\nGender: " + gender +
                    "\nTerms Accepted: " + termsAccepted;

            new AlertDialog.Builder(this)
                    .setTitle("Registration Details")
                    .setMessage(details)
                    .setPositiveButton("OK", null)
                    .show();
        });
    }
}
