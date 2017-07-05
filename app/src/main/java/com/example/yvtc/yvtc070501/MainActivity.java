package com.example.yvtc.yvtc070501;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    CheckBox chk1, chk2;
    ArrayList<CheckBox> chkList;
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chkList = new ArrayList<>();
        chk1 = (CheckBox) findViewById(R.id.checkBox);
        chk2 = (CheckBox) findViewById(R.id.checkBox2);
        rg = (RadioGroup) findViewById(R.id.radioGroup);
        chkList.add(chk1);
        chkList.add(chk2);
        chk1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "Check Change!! " + isChecked, Toast.LENGTH_LONG).show();
            }
        });
    }
    public void click1(View v)
    {
        for (CheckBox chk : chkList)
        {
            if (chk.isChecked())
            {
                Toast.makeText(MainActivity.this, chk.getText().toString(), Toast.LENGTH_LONG).show();
            }
        }

        switch (rg.getCheckedRadioButtonId())
        {
            case R.id.radioButton:
                Toast.makeText(MainActivity.this, "1", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton2:
                Toast.makeText(MainActivity.this, "2", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void click2(View v)
    {
        ProgressBar pb2 = (ProgressBar) findViewById(R.id.progressBar2);
        pb2.setProgress(pb2.getProgress() + 10);

    }
}
