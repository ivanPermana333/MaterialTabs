package info.androidhive.materialtabs.activity;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;


import info.androidhive.materialtabs.R;
import info.androidhive.materialtabs.activity.MainActivity;

public class Segitiga extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    EditText txtalas,txttinggi;
    Button btnluas;
    Button btnkeliling;
    TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        toolbar = findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txtalas = (EditText)findViewById(R.id.alas);
        txttinggi = (EditText)findViewById(R.id.tinggi);
        btnluas = (Button) findViewById(R.id.btnLuas);
        hasil = (TextView)findViewById(R.id.txthasil);
        btnluas.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                //jika tidak mengisi panjang dan lebar sekaligus maka akan tampil notifikasi
                if(txtalas.length()==0 && txttinggi.length()==0){
                    Toast.makeText(getApplication(),"Alas dan Tinggi tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                //notifikasi ini akan muncul jika panjangnya tidak diisi
                else if (txtalas.length()==0){
                    Toast.makeText(getApplication(),"Alas tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
                //notifikasi jika lebar tidak diisi
                else if (txttinggi.length()==0){
                    Toast.makeText(getApplication(),"Tinggi tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String isialas = txtalas.getText().toString();
                    String isitinggi = txttinggi.getText().toString();
                    double alas = Double.parseDouble(isialas);
                    double tinggi = Double.parseDouble(isitinggi);
                    double hs = LuasSegitiga(alas,tinggi);
                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }

    public  boolean onSupportNavigateUp(){
        finish();
        return  true;
    }
    public double LuasSegitiga(double alas, double tinggi){return alas*tinggi/2;}


}

