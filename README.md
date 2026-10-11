# Registration Form – Android Application

## Description

This project is a simple Android registration form developed in Android Studio using Java and XML.

The application allows users to enter their personal information, select their gender, and accept the Terms & Conditions. After clicking the Create account button, a dialog window displays a summary of all entered information.

## Features

Registration form: Users can enter their username, full name, country, email address, phone number, and password.

Gender selection: Users can select either Male or Female using RadioButton elements inside a RadioGroup.

Terms & Conditions: A CheckBox allows users to indicate whether they accept the terms.

Scrollable layout: A ScrollView makes the form accessible on smaller screens.

Registration summary: Clicking Create account opens an AlertDialog displaying all entered information.

Terms confirmation: The dialog displays Yes or No depending on whether the CheckBox was selected.

## How It Works

The user opens the application and fills in the registration form.

The user selects a gender and optionally accepts the Terms & Conditions.

After clicking Create account, the application reads the information from all input fields using getText().toString().

The application checks the selected gender using isChecked() and verifies the Terms & Conditions CheckBox.

An AlertDialog.Builder creates a dialog titled Registration Details, displaying all the information entered by the user.

The user can close the dialog by clicking OK.

## Technologies Used

Java – Application logic and event handling.

XML – User interface design.

Android Studio – Development environment.

ScrollView and LinearLayout – Scrollable and vertically organized layout.

EditText, RadioGroup, RadioButton, CheckBox and Button – User interface components.

AlertDialog.Builder – Displays the registration summary.

## Project Structure

MainActivity.java – Handles user input, button clicks, gender selection, and the registration summary dialog.

activity_main.xml – Defines the layout and appearance of the registration form.

<img width="247" height="511" alt="EEE" src="https://github.com/user-attachments/assets/06290e85-c01e-4b71-8ddd-f98b7a9baf05" />  <img width="249" height="511" alt="ela" src="https://github.com/user-attachments/assets/8eb62c61-cf89-44c8-ba37-e9e58e2e040d" />

