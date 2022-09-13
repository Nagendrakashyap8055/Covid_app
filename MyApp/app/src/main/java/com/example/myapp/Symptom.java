package com.example.covid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Symptom extends AppCompatActivity {
TextView check,get,what,isolate,when,how;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_symptom);
        check= findViewById(R.id.check);
        check.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri sym = Uri.parse("https://www.cdc.gov/coronavirus/2019-ncov/symptoms-testing/coronavirus-self-checker.html");
                        Intent intent = new Intent(Intent.ACTION_VIEW, sym);

                        startActivity(intent);

                    }
                });
        get= findViewById(R.id.get);
        get.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri sym = Uri.parse("https://www.cdc.gov/coronavirus/2019-ncov/testing/index.html");
                        Intent intent = new Intent(Intent.ACTION_VIEW, sym);

                        startActivity(intent);

                    }
                });
        what= findViewById(R.id.what);
        what.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri sym = Uri.parse("https://www.cdc.gov/coronavirus/2019-ncov/if-you-are-sick/steps-when-sick.html");
                        Intent intent = new Intent(Intent.ACTION_VIEW, sym);

                        startActivity(intent);

                    }
                });
        isolate= findViewById(R.id.isolate);
        isolate.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri sym = Uri.parse("https://www.cdc.gov/coronavirus/2019-ncov/if-you-are-sick/isolation.html");
                        Intent intent = new Intent(Intent.ACTION_VIEW, sym);

                        startActivity(intent);

                    }
                });
        when= findViewById(R.id.when);
        when.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri sym = Uri.parse("https://www.cdc.gov/coronavirus/2019-ncov/if-you-are-sick/quarantine.html");
                        Intent intent = new Intent(Intent.ACTION_VIEW, sym);

                        startActivity(intent);

                    }
                });
        how= findViewById(R.id.how);
        how.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Uri sym = Uri.parse("https://www.cdc.gov/coronavirus/2019-ncov/if-you-are-sick/care-for-someone.html");
                        Intent intent = new Intent(Intent.ACTION_VIEW, sym);

                        startActivity(intent);

                    }
                });
    }
}