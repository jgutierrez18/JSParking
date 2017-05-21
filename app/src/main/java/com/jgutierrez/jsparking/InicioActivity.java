package com.jgutierrez.jsparking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }
    Button btnlogin = (Button) findViewById(R.id.btnlogin);

       // btnlogin.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View v) {
          //Intent intent = new Intent(v.getContext(),LoginActivity.class);
            //startActivityForResult(intent,0);

        //}
    //};

    Button btnregistro = (Button) findViewById(R.id.btnregistro);
        //btnregistro.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View v) {
          //  Intent intent1 = new Intent(v.getContext(),RegistroActivity.class);
            //startActivityForResult(intent1,0);
        //}
    //});
}

