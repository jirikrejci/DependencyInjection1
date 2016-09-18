package com.jksoft.dependencyinjection1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Jirka on 18.9.2016.
 */
public class ButterKnifeWay extends AppCompatActivity {

    @BindView(R.id.tvTextView1)   TextView tvTextView1;
    @BindView(R.id.tvMethodName)  TextView tvMethodName;
 //   @BindView(R.id.btnShowText)   Button btnShowText;
  //  @BindView(R.id.btnDeleteText) Button btnDeleteText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_show_form);

       ButterKnife.bind(this);
       tvMethodName.setText("Butter Knife");
    }

    @OnClick(R.id.btnShowText)
    void whatever () {
        tvTextView1.setText("Stisknuto tlačítko Show Text (ButterKnife way");
    }

    @OnClick(R.id.btnDeleteText)
    void whatever2 () {
        tvTextView1.setText("[-]");
    }



}
