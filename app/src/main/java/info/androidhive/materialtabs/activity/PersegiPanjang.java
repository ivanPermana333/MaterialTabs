package info.androidhive.materialtabs.activity;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import info.androidhive.materialtabs.R;

public class PersegiPanjang extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    EditText txtpanjang,txtlebar;
    Button btnLuasP;
    Button btnKelilingp;
    TextView hasilp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        toolbar = findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        txtpanjang = (EditText)findViewById(R.id.panjang);
        txtlebar = (EditText)findViewById(R.id.lebar);
        btnLuasP = (Button) findViewById(R.id.btnLuasP);
        hasilp = (TextView)findViewById(R.id.txthasilP);
        btnLuasP.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                //jika tidak mengisi panjang dan lebar sekaligus maka akan tampil notifikasi
                if(txtpanjang.length()==0 && txtlebar.length()==0){
                    Toast.makeText(getApplication(),"Panjang dan lebar tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }
                //notifikasi ini akan muncul jika panjangnya tidak diisi
                else if (txtpanjang.length()==0){
                    Toast.makeText(getApplication(),"Panjang tidak boleh kososng", Toast.LENGTH_LONG).show();
                }
                //notifikasi jika lebar tidak diisi
                else if (txtlebar.length()==0){
                    Toast.makeText(getApplication(),"Lebar tidak boleh kosong",Toast.LENGTH_LONG).show();
                }
                else{
                    String isipanjang = txtpanjang.getText().toString();
                    String isilebar = txtlebar.getText().toString();
                    double txtpanjang = Double.parseDouble(isipanjang);
                    double txtlebar = Double.parseDouble(isilebar);
                    double hs = LuasPersegiPanjang(txtpanjang,txtlebar);
                    String output = String.valueOf(hs);
                    hasilp.setText(output.toString());
                }
            }
        });
    }

    public  boolean onSupportNavigateUp(){
        finish();
        return  true;
    }
    public double LuasPersegiPanjang(double txtpanjang, double txtlebar){return txtpanjang*txtlebar;}

}

