package utsmopro.uts_mopro_ridwan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PembayaranActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        final String data = bundle.getString("nama");
        final String data1 = bundle.getString("harga");
        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText("" + data);
        TextView textView1 = (TextView) findViewById(R.id.textView4);
        textView1.setText("" + data1);
        final TextView textView2 = (TextView) findViewById(R.id.total);
        final EditText input= (EditText)findViewById(R.id.editText);


        Button btn = (Button)findViewById(R.id.button3);
        // Login button onClick event
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                int harga = Integer.parseInt(data1.toString());
                int total = Integer.parseInt(input.getText().toString());
                if(total<=harga){
                    Toast.makeText(getApplicationContext(),"Jumalah Bayar Kurang", Toast.LENGTH_SHORT).show();
                }
                else if (total>=harga){
                    int hasil = total-harga;
                    textView2.setText(""+hasil);
                }

            }
        });
    }
}
