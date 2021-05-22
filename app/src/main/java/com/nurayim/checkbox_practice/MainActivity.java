package com.nurayim.checkbox_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView selection;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selection = findViewById(R.id.selection);

    }

    public void onCheckBoxClicked(View view) {
        CheckBox checkBox = (CheckBox) view;
        boolean checked = checkBox.isChecked();
        switch (view.getId()){
            case R.id.java:
                if (checked)
                    selection.setText("on");
                    Toast.makeText(this,"Вы выбрали правильно Java",Toast.LENGTH_SHORT).show();
                break;
            case R.id.kotlin:
                if (checked)
                    selection.setText("on");
                    Toast.makeText(this,"Вы выбрали правильно Котлин",Toast.LENGTH_SHORT).show();
                break;

            default:
                selection.setText("off");
        }
    }
}