package com.example.budgy_prototype_v01;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextPaint;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    private TextView budgy, subhead;
    private ImageView bg_element;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        Utils.blackIconStatusBar(SplashScreen.this, R.color.background);

        TextView textView = (TextView) findViewById(R.id.budgy);

        TextPaint paint = textView.getPaint();
        float width = paint.measureText("Budgy");

        Shader textShader = new LinearGradient(0, 0, width, textView.getTextSize(),
                new int[]{
                        Color.parseColor("#686D86"),
                        Color.parseColor("#686D86"),
                        Color.parseColor("#686D86"),
                        Color.parseColor("#4E5265")
                }, null, Shader.TileMode.CLAMP);
        textView.getPaint().setShader(textShader);

        bg_element = findViewById(R.id.bg_element);
        budgy = findViewById(R.id.budgy);
        subhead = findViewById(R.id.subhead);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, loginPage.class);
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(SplashScreen.this,
                        Pair.create(budgy, "logo_text"),
                        Pair.create(subhead, "sub_head"),
                        Pair.create(bg_element, "background_element"));
                startActivity(intent, options.toBundle());
            }
        }, 3000);
    }
}