package com.kashawn.splash;

import android.os.Bundle;
import android.text.Html;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class OnBoardingScreen extends AppCompatActivity {

    private ViewPager viewPager;
    private LinearLayout myDotLayout;
    private SliderAdapter sliderAdapter;
    private TextView[] myDots;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboardingscreen);
        viewPager=findViewById(R.id.viewPager);
        myDotLayout=findViewById(R.id.dots);
        sliderAdapter=new SliderAdapter(this);
        viewPager.setAdapter(sliderAdapter);
    }

    }

