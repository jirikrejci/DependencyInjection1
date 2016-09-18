package com.jksoft.dependencyinjection1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActOldWay2 extends AppCompatActivity {

    TextView tvTextView1;
    Button btnShowText;
    Button btnDeleteText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_show_form);

        ((TextView) findViewById(R.id.tvMethodName)).setText("Old Way 2");

        tvTextView1 = (TextView) findViewById(R.id.tvTextView1);
        btnShowText = (Button) findViewById(R.id.btnShowText);
        btnDeleteText = (Button) findViewById(R.id.btnDeleteText);

        btnShowText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvTextView1.setText("Ahoj Jirko !!! Stisnuto Show Text !");
            }
        });

        btnDeleteText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvTextView1.setText("[-]");
            }
        });




    }
}
