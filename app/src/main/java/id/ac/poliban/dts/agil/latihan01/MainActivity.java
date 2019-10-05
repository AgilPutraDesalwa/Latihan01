package id.ac.poliban.dts.agil.latihan01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btAndi = findViewById(R.id.btAndi);
        Button btSarii = findViewById(R.id.btSari);
        Button btVita = findViewById(R.id.btVita);
        Button btJunai = findViewById(R.id.btJunai);
        //pasang object button dengan listener onClick Listener
        //menggunakan impement kelas sekarang (MainActifity)
        btAndi.setOnClickListener(this);
        btVita.setOnClickListener(this);
        btVita.setOnClickListener(this);
        btJunai.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //penanganan kejadian (Event handler)
        switch (v.getId()){
            case R.id.btAndi :
                Toast.makeText(this, "Hi Andi", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btSari :
                Toast.makeText(this, "Hi Sari", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btVita :
                Toast.makeText(this, "Hi Vita", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btJunai :
                Toast.makeText(this, "HI Junai", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
