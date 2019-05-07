package br.com.digitalhouse.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextEmail;
    EditText editTextSenha;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextSenha = findViewById(R.id.editTextSenha);
        btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = editTextEmail.getText().toString();
                String senha = editTextSenha.getText().toString();

                if (email.isEmpty()) {
                    Toast.makeText(MainActivity.this, "E-mail não pode ser vazio!", Toast.LENGTH_SHORT).show();
                }else if (!email.contains("@")) {
                    Toast.makeText(MainActivity.this, "E-mail invalido!", Toast.LENGTH_SHORT).show();
                } else if(senha.length() < 6){
                    Toast.makeText(MainActivity.this, "Senha deve ter no minimo 6 caracteres", Toast.LENGTH_SHORT).show();
                } else if(senha.equals("123456")) {
                    Toast.makeText(MainActivity.this, "Senha padrão Ok", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }


}
