package com.example.walking;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set fullscreen
        //this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // Set No Title
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        this.setContentView(new GameSurface(this));
    }

}

