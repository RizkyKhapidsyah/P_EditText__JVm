package com.rizkykhapidsyah.p_edittext__jvm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtDemo_IDJAVA;
    TextView txtEdt_IDJAVA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtDemo_IDJAVA = findViewById(R.id.edtDemo_IDXML);
        txtEdt_IDJAVA = findViewById(R.id.txtEdt_IDXML);

        edtDemo_IDJAVA.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //Kosong
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String Kalimat = edtDemo_IDJAVA.getText().toString();
                txtEdt_IDJAVA.setText(Kalimat);
            }

            @Override
            public void afterTextChanged(Editable s) {
                //Kosong
            }
        });
    }
}

/*
    Penjelasan :

    TextWatcher adalah salah satu method interface di library android (android.text.TextWatcher)
    yang digunakan untuk membaca atau mendeteksi text ,ketika user (pengguna ) menginputkan data
    pada widget EditText Android. TextWatcher juga memungkinkan Aplikasi, untuk membaca setiap
    karakter ketika dimasukan atau dinputkan. Contoh penggunaan TextWatcher biasanya diterapkan
    saat kita Login atau Register di suatu platform Aplikasi. Contoh lainya lagi ketika kita
    menginputkan keyword atau kata kunci di Google Search.
 */
