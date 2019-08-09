package info.androidhive.materialtabs;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Persegi extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    EditText txtsisi;
    Button btnLuasPersegi;
    TextView hasilpersegi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        toolbar = findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnLuasPersegi = (Button) findViewById(R.id.btnLuasPersegi);
        txtsisi = (EditText) findViewById(R.id.txtsisi);
        hasilpersegi = (TextView)findViewById(R.id.txthasilPersegi);
        btnLuasPersegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txtsisi.length()==0){
                    Toast.makeText(getApplication(),"Panjang dan lebar tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                //notifikasi ini akan muncul jika panjangnya tidak diisi
                else if (txtsisi.length()==0){
                    Toast.makeText(getApplication(),"Panjang tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
                //notifikasi jika lebar tidak diisi
                else if (txtsisi.length()==0){
                    Toast.makeText(getApplication(),"Lebar tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String isisisi = txtsisi.getText().toString();
                    double txtsisi = Double.parseDouble(isisisi);
                    double hs = LuasPersegi(txtsisi);
                    String output = String.valueOf(hs);
                    hasilpersegi.setText(output.toString());
                }
            }
        });
    }

    public  boolean onSupportNavigateUp(){
        finish();
        return  true;
    }
    public double LuasPersegi(double txtsisi){return txtsisi*txtsisi;}
}
