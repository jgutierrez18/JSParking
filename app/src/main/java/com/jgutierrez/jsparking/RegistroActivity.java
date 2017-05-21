package com.jgutierrez.jsparking;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegistroActivity extends AppCompatActivity {


    private Button buttonLogin;
    private EditText editTextNombre;
    private EditText editTextTelefono;
    private EditText editTextEmail;
    private EditText editTextClave;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);


        mAuth = FirebaseAuth.getInstance();

        editTextNombre= (EditText) findViewById(R.id.editTextNombre);
        editTextTelefono= (EditText) findViewById(R.id.editTextTelefono);
        editTextEmail= (EditText) findViewById(R.id.editTextEmail);
        editTextClave= (EditText) findViewById(R.id.editTextClave);


        buttonLogin= (Button) findViewById(R.id.buttonLogin);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iniciarResgistro();
            }
        });


    }
    private void iniciarResgistro(){
        final String Nombre =  buttonLogin.getText().toString().trim();
        String Telefono =  buttonLogin.getText().toString().trim();
        String Email =  buttonLogin.getText().toString().trim();
        String Clave =  buttonLogin.getText().toString().trim();
        if(!TextUtils.isEmpty(Nombre) && !TextUtils.isEmpty(Telefono) &&!TextUtils.isEmpty(Email) &&!TextUtils.isEmpty(Clave)){
            mAuth.createUserWithEmailAndPassword(Email, Clave)
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if (task.isSuccessful()){
                                //startActivity(new Intent(RegistroActivity.this, LoginActivity));
                                //finish();
                                Toast.makeText(RegistroActivity.this, "Usuario Registrado ", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

        }
    }
}
