package com.example.nilesh.fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button submit;
    public EditText value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit=(Button)findViewById(R.id.button);
        value=(EditText)findViewById(R.id.editText);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                android.app.FragmentManager fm = getFragmentManager();
                android.app.FragmentTransaction ft=fm.beginTransaction();
                Frag1 f1=new Frag1();

                ft.add(R.id.relative_layout,f1);

                ft.commit();

            }
        });
    }
}
