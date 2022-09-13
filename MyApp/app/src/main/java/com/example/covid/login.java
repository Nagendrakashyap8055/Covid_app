package com.example.covid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




import android.content.Intent;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class login extends AppCompatActivity {
        private EditText etemail,mypass;
        private Button btnlogin;
        private String stremail,pass;
        boolean valid;

        TextView createnewac;
        String get_name(String email)
        {

            String[] parts = email.split("@");
            return parts[0];
        }
        public boolean
        isValidPassword(String password)
        {

            String regex = "^(?=.*[0-9])"
                    + "(?=.*[a-z])(?=.*[A-Z])"
                    + "(?=.*[@#$%^&+=])"
                    + "(?=\\S+$).{8,20}$";


            Pattern p = Pattern.compile(regex);
            if (password == null) {
                // mypass.setError("Enter Password!");
                return false;
            }

            Matcher m = p.matcher(password);
            return m.matches();
        }

        public  boolean loginValidation(){
            valid=true;
            if (emailValidation(stremail) == false) {
                etemail.setError("Enter valid email!");
                valid=false;
            }
            if (TextUtils.isEmpty(etemail.getText())) {
                etemail.setError("Enter Email!");
                valid = false;

            }

            if (TextUtils.isEmpty(mypass.getText())) {
                mypass.setError("Enter Password!");
                valid=false;

            }else if (isValidPassword(pass)==false)
            {
                mypass.setError("Password must contain min 8 characters of uppercase,lowercase,special characters and numbers");
                valid=false;
            }
            return valid;
        }

        public static boolean emailValidation(String email)
        {
            String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
            Pattern pattern = Pattern.compile(regex);
            ArrayList<String> emails = new ArrayList<String>();
            emails.add(email);


            Matcher matcher = pattern.matcher(email);
            return matcher.matches();

        }


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_login);
            etemail=findViewById(R.id.etemail);
            mypass=findViewById(R.id.mypass);
            btnlogin=findViewById(R.id.btnlogin);
            createnewac=findViewById(R.id.createnewac);
            btnlogin.setOnClickListener(
                    new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {


                            Intent intent = new Intent(login.this,home.class);
                            stremail = etemail.getText().toString();
                            pass = mypass.getText().toString();
                            intent.putExtra("email", get_name(stremail));
                            if (loginValidation()) {
                                startActivity(intent);
                            }
                        }
                    });
            createnewac.setOnClickListener(
                    new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View view)
                        {
                            startActivity(new Intent(login.this, MainActivity.class));
                        }
                    });

        }
    }

