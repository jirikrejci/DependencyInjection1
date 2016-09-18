package com.jksoft.dependencyinjection1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActOldWay1 extends AppCompatActivity implements View.OnClickListener{

    TextView tvTextView1;
    Button btnButtonShowText;
    Button btnDeleteText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_show_form);

        ((TextView) findViewById(R.id.tvMethodName)).setText("Old Way 1");
        tvTextView1 = (TextView) findViewById(R.id.tvTextView1);
        btnButtonShowText = (Button) findViewById(R.id.btnShowText);
        btnDeleteText = (Button) findViewById(R.id.btnDeleteText);


        btnButtonShowText.setOnClickListener(this);
        btnDeleteText.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        if (v == btnButtonShowText) tvTextView1.setText("Ahoj Jirko !!! Stisnuto Show Text");
        if (v == btnDeleteText) tvTextView1.setText("[-]");

    }
}
