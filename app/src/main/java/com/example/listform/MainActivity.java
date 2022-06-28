package com.example.listform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private FormData data;

    public static final String FIRST_NAME = "com.example.listform.extra.FIRST_NAME";
    public static final String LAST_NAME = "com.example.listform.extra.LAST_NAME";
    public static final String REG_NO = "com.example.listform.extra.REG_NO";
    public static final String ROLL_NO = "com.example.listform.extra.ROLL_NO";
    public static final String SECTION = "com.example.listform.extra.SECTION";
    public static final String MOBILE = "com.example.listform.extra.MOBILE";
    public static final String EMAIL = "com.example.listform.extra.EMAIL";

    private EditText mFirstName;
    private EditText mLastName;
    private EditText mRegNo;
    private EditText mRollNo;
    private EditText mSection;
    private EditText mMobile;
    private EditText mEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        data = new FormData();

        mFirstName = findViewById(R.id.field_first_name);
        mLastName = findViewById(R.id.field_last_name);
        mRegNo = findViewById(R.id.field_reg_no);
        mRollNo = findViewById(R.id.field_roll_no);
        mSection = findViewById(R.id.field_section);
        mMobile = findViewById(R.id.field_mobile);
        mEmail = findViewById(R.id.field_email);
    }

    public void onSubmit(View view) {
        Intent intent = new Intent(this, SecondActivity.class);

        data.setFirstName(mFirstName.getText().toString());
        data.setLastName(mLastName.getText().toString());
        data.setRegNo(mRegNo.getText().toString());
        data.setRollNo(mRollNo.getText().toString());
        data.setSection(mSection.getText().toString());
        data.setMobile(mMobile.getText().toString());
        data.setEmail(mEmail.getText().toString());

        intent.putExtra(FIRST_NAME, data.getFirstName());
        intent.putExtra(LAST_NAME, data.getLastName());
        intent.putExtra(REG_NO, data.getRegNo());
        intent.putExtra(ROLL_NO, data.getRollNo());
        intent.putExtra(SECTION, data.getSection());
        intent.putExtra(MOBILE, data.getMobile());
        intent.putExtra(EMAIL, data.getEmail());

        startActivity(intent);
    }
}