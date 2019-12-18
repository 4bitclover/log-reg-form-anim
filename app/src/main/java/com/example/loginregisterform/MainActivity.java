package com.example.loginregisterform;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        Fragment login = new LoginFragment();
        Fragment registration = new RegistrationFragment();

        FragmentManager fm = getSupportFragmentManager();

        fm.beginTransaction().add(R.id.fragment_container, login).commit();
        fm.beginTransaction().add(R.id.fragment_container, registration).hide(registration).commit();

    }
}
