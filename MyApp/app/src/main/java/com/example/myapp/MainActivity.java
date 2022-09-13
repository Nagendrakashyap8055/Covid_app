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

public class MainActivity extends AppCompatActivity {

    private EditText etusername,etemail,mypass;
    private Button btnlogin;
    public boolean valid;
    String stremail,pass,strusername;
    TextView create_newac;




    public static boolean emailValidation(String email)
    {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        ArrayList<String> emails = new ArrayList<String>();
        emails.add(email);


        Matcher matcher = pattern.matcher(email);
        return matcher.matches();

    }
    public static boolean
    isValidPassword(String password)
    {

        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";


        Pattern p = Pattern.compile(regex);
//        if (password == null) {
//            return false;
//        }

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

        }
        else if (isValidPassword(pass)==false)
        {
            mypass.setError("Password must contain min 8 characters of uppercase,lowercase,special characters and numbers");
            valid=false;
        }
        return valid;
    }
    String get_name(String email)
    {

        String[] parts = email.split("@");
        return parts[0];
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etusername=findViewById(R.id.etusername);
        etemail=findViewById(R.id.etemail);
        mypass=findViewById(R.id.mypass);
        btnlogin=findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        strusername=etusername.getText().toString();
                        stremail=etemail.getText().toString();
                        pass = mypass.getText().toString();

                        /*String method="register";
                            BackgroundTask backgroundTask=new BackgroundTask(this);
                            backgroundTask.execute(method,strusername,stremail,pass);*/
                        Intent intent=new Intent (MainActivity.this,home.class);
                        intent.putExtra("email",get_name(stremail));
                        if (loginValidation()) {
                            startActivity(intent);
                        }
                    }
                });
        create_newac=findViewById(R.id.createnewac);
        create_newac.setOnClickListener(
                new View.OnClickListener()
                {
                    @Override
                    public void onClick(View view)
                    {
                        startActivity(new Intent(MainActivity.this, login.class));
                    }
                });
    }
}