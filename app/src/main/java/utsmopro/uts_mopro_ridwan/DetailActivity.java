package utsmopro.uts_mopro_ridwan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        final String data = bundle.getString("titleMember");
        final String data1 = bundle.getString("desctriptionMember");
        TextView textView = (TextView) findViewById(R.id.titleMember);
        textView.setText(""+data);
        TextView textView1 = (TextView) findViewById(R.id.desctriptionMember);
        textView1.setText(""+data1);
        Button btn = (Button)findViewById(R.id.button2);
               // Login button onClick event
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent =new Intent(getApplicationContext(),PembayaranActivity.class);
                intent.putExtra("nama",data);
                intent.putExtra("harga",data1);
                startActivity(intent);
            }
        });

    }
}
