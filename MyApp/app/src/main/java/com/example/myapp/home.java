package com.example.MyApp.Ui.login;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.example.myapp.R;
import com.google.android.material.navigation.NavigationView;

public class home extends AppCompatActivity {
    private static final int MODE_DARK = 0;
    private static final int MODE_LIGHT = 1;

TextView self,symptoms,vaccination,updates,self_assess,ambulance,test,care;
ImageView  img_self,img_symptoms,img_vaccination,img_updates,img_self_assess,img_ambulance,img_test,img_care;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        setContentView(R.layout.activity_home);
        self = findViewById(R.id.prevent);
        self.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(home.this, com.example.covid.Prevent.class);

                        //Uri uri = Uri.parse("https://www.cdc.gov/coronavirus/2019-ncov/prevent-getting-sick/prevention.html");
                        //Intent intent = new Intent(Intent.ACTION_VIEW, uri);

                        startActivity(intent);
                    }
                });

        symptoms= findViewById(R.id.symptom);
        symptoms.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Uri sym = Uri.parse("https://www.cdc.gov/coronavirus/2019-ncov/symptoms-testing/symptoms.html");
                        //Intent intent = new Intent(Intent.ACTION_VIEW, sym);
                        Intent intent = new Intent(home.this, com.example.covid.Symptom.class);
                        startActivity(intent);

                    }
                });
        vaccination= findViewById(R.id.vaccination);
        vaccination.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri sym = Uri.parse("https://www.cowin.gov.in/home");
                        Intent intent = new Intent(Intent.ACTION_VIEW, sym);

                        startActivity(intent);

                    }
                });
        updates= findViewById(R.id.updates);
        updates.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri sym = Uri.parse("https://www.worldometers.info/coronavirus/country/india/");
                        Intent intent = new Intent(Intent.ACTION_VIEW, sym);

                        startActivity(intent);

                    }
                });
        self_assess= findViewById(R.id.self);
        self_assess.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri sym = Uri.parse("https://covid19.karnataka.gov.in/covid19-self-assessment/src/self-assessment/index.html#q1");
                        Intent intent = new Intent(Intent.ACTION_VIEW, sym);

                        startActivity(intent);

                    }
                });
        ambulance= findViewById(R.id.ambulance);
        ambulance.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri sym = Uri.parse("https://www.sulekha.com/ambulance-services/mysore");
                        Intent intent = new Intent(Intent.ACTION_VIEW, sym);

                        startActivity(intent);

                    }
                });
        test= findViewById(R.id.testing);
        test.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri sym = Uri.parse("https://covid19.karnataka.gov.in/page/Testing+Centers/COVID+Testing+Centers/en");
                        Intent intent = new Intent(Intent.ACTION_VIEW, sym);

                        startActivity(intent);

                    }
                });
        care= findViewById(R.id.care);
        care.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri sym = Uri.parse("https://covid19.karnataka.gov.in/new-page/Designated%20Covid-19%20Hospitals/en");
                        Intent intent = new Intent(Intent.ACTION_VIEW, sym);

                        startActivity(intent);

                    }
                });









        img_self = findViewById(R.id.img_prevent);
        img_self.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(home.this, com.example.covid.Prevent.class);

                        //Uri uri = Uri.parse("https://www.cdc.gov/coronavirus/2019-ncov/prevent-getting-sick/prevention.html");
                        //Intent intent = new Intent(Intent.ACTION_VIEW, uri);

                        startActivity(intent);
                    }
                });

        img_symptoms= findViewById(R.id.img_symptom);
        img_symptoms.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Uri sym = Uri.parse("https://www.cdc.gov/coronavirus/2019-ncov/symptoms-testing/symptoms.html");
                        //Intent intent = new Intent(Intent.ACTION_VIEW, sym);
                        Intent intent = new Intent(home.this, com.example.covid.Symptom.class);
                        startActivity(intent);

                    }
                });
        img_vaccination= findViewById(R.id.img_vaccination);
        img_vaccination.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri sym = Uri.parse("https://www.cowin.gov.in/home");
                        Intent intent = new Intent(Intent.ACTION_VIEW, sym);

                        startActivity(intent);

                    }
                });
        img_updates= findViewById(R.id.img_updates);
        img_updates.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri sym = Uri.parse("https://www.worldometers.info/coronavirus/country/india/");
                        Intent intent = new Intent(Intent.ACTION_VIEW, sym);

                        startActivity(intent);

                    }
                });
        img_self_assess= findViewById(R.id.img_self);
        img_self_assess.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri sym = Uri.parse("https://covid19.karnataka.gov.in/covid19-self-assessment/src/self-assessment/index.html#q1");
                        Intent intent = new Intent(Intent.ACTION_VIEW, sym);

                        startActivity(intent);

                    }
                });
        img_ambulance= findViewById(R.id.img_ambulance);
        img_ambulance.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri sym = Uri.parse("https://www.sulekha.com/ambulance-services/mysore");
                        Intent intent = new Intent(Intent.ACTION_VIEW, sym);

                        startActivity(intent);

                    }
                });
        img_test= findViewById(R.id.img_test);
        img_test.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri sym = Uri.parse("https://covid19.karnataka.gov.in/page/Testing+Centers/COVID+Testing+Centers/en");
                        Intent intent = new Intent(Intent.ACTION_VIEW, sym);

                        startActivity(intent);

                    }
                });
        img_care= findViewById(R.id.img_care);
        img_care.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri sym = Uri.parse("https://covid19.karnataka.gov.in/new-page/Designated%20Covid-19%20Hospitals/en");
                        Intent intent = new Intent(Intent.ACTION_VIEW, sym);

                        startActivity(intent);

                    }
                });


    }
}


