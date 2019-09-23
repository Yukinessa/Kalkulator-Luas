package com.example.hitung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button Hitung, Hitung_p, Hitung_L;
    TextView Hasil,Hasil2, Hasil3;
    EditText Alas, Tinggi, Sisi, jariJari;
    Double alas, tinggi, hasil, sisi, hasil2, hasil3, jarijari;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ///Segitiga
        Hitung = (Button)findViewById(R.id.hitung);
        Alas = (EditText)findViewById(R.id.alass);
        Tinggi = (EditText)findViewById(R.id.tinggii);
        Hasil = (TextView)findViewById(R.id.hasill);

        ///Persegi
        Hitung_p = (Button)findViewById((R.id.hitung2));
        Sisi = (EditText) findViewById(R.id.sisis);
        Hasil2 = (TextView)findViewById(R.id.hasill2);

        ///Lingkaran
        Hitung_L = (Button)findViewById(R.id.hitung3);
        jariJari = (EditText)findViewById(R.id.jarijari);
        Hasil3 = (TextView)findViewById(R.id.hasill3);
        Hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alas = Double.parseDouble(Alas.getText().toString());
                tinggi = Double.parseDouble(Tinggi.getText().toString());
                hasil = (alas*tinggi)/2;
                Hasil.setText("Luasnya : " + hasil);

            }
        });

        Hitung_p.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sisi = Double.parseDouble(Sisi.getText().toString());
                hasil2 =  (sisi*sisi);
                Hasil2.setText("Luasnya : " + hasil2);
            }
        }));

        Hitung_L.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jarijari = Double.parseDouble(jariJari.getText().toString());
                hasil3 = (3.14*jarijari*jarijari);
                Hasil3.setText("Luasnya : " + hasil3);
            }
        }));
    }
}
