package com.example.userinputs;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class GenerateEmail extends Activity {
    EditText firstName;
    EditText lastName;
    TextView resultsTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generate_email);
        firstName=findViewById(R.id.fName);
        lastName=findViewById(R.id.lName);
        resultsTxt=findViewById(R.id.results);

    }

    public void createEmail(View view) {
        String fName=firstName.getText().toString();
        String lName=lastName.getText().toString();
        String email=fName+"."+lName+"@google.com";
        if (TextUtils.isEmpty(fName)==false
            &&!TextUtils.isEmpty(lName)){
        resultsTxt.setText(email);
    }else{
            Toast.makeText(this,"Enter all the fields" ,Toast.LENGTH_SHORT ).show();
        }
    }
}
