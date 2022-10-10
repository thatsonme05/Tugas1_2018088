package com.example.tugas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Luas extends AppCompatActivity {
    EditText alas ,tinggi;
    Button hasil;
    TextView luas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas);

        alas=(EditText) findViewById(R.id.input_alas);
        tinggi =(EditText) findViewById(R.id.input_tinggi);
        hasil=(Button) findViewById(R.id.btn_luas);
        luas =(TextView) findViewById(R.id.output_hasil);

                hasil.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view){
                        double bilangan1, bilangan2, hitung;
                        bilangan1=Double.valueOf(alas.getText().toString().trim());
                        bilangan2=Double.valueOf(tinggi.getText().toString().trim());

                        hitung =(bilangan1 / 2) * bilangan2;
                        String Hasil = String.valueOf(hitung);
                        luas.setText(Hasil);

                    }
                });
    }
}