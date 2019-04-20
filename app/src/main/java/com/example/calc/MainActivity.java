package com.example.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void count(View view)
    {
        EditText one = findViewById(R.id.one);
        EditText two = findViewById(R.id.two);
        TextView output = findViewById(R.id.output);

        String s1 = one.getText().toString();
        String s2 = two.getText().toString();

        int no1 = Integer.parseInt(s1);
        int no2 = Integer.parseInt(s2);

        int sum = no1 + no2;

        String text = String.valueOf(sum);
        output.setText(text);
    }
}
