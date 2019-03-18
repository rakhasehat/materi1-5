package example.rakhasehat.com.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_DATA = "EXTRA DATA";

    private EditText txtData;
    private Button btnSimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtData = (EditText)findViewById(R.id.txtData);
        btnSimpan = (Button)findViewById(R.id.btnSimpan);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = txtData.getText().toString();
                Intent intent = new Intent(MainActivity.this, TargetActivity.class);
                intent.putExtra(EXTRA_DATA, data);
                startActivity(intent);
            }
        });
    }
}
