package example.rakhasehat.com.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class TargetActivity extends AppCompatActivity {

    private TextView viewData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);

        viewData = (TextView) findViewById(R.id.viewData);

        //get data
        if(getIntent().getExtras() != null){
            String data = getIntent().getExtras().getString(MainActivity.EXTRA_DATA);
            viewData.setText(data);
        }
    }
}
