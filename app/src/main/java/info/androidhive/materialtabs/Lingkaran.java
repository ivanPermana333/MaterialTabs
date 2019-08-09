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

public class Lingkaran extends AppCompatActivity {
    private Toolbar toolbar;
    private TabLayout tabLayout;
    EditText jarijari;
    Button btnLuasLingkaran;
    TextView hasilLingkaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);


        toolbar = findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        jarijari = findViewById(R.id.txtjarijari);
        btnLuasLingkaran = findViewById(R.id.btnLuasLingkaran);
        hasilLingkaran = findViewById(R.id.txthasilLingkaran);
        btnLuasLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double jari = Double.parseDouble(String.valueOf(jarijari.getText()));
                double btnluaslingkaran = (3.14 * jari *jari);
                hasilLingkaran.setText(String.valueOf(btnluaslingkaran));
            }
        });
    }

    public  boolean onSupportNavigateUp(){
        finish();
        return  true;
    }
}
