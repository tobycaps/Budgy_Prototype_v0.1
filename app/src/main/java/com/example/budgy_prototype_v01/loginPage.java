package com.example.budgy_prototype_v01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextPaint;
import android.widget.Button;
import android.widget.TextView;

public class loginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        Utils.blackIconStatusBar(loginPage.this, R.color.background);

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
    }
}