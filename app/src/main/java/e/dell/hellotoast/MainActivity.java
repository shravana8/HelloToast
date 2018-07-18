package e.dell.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static e.dell.hellotoast.R.string.toast_message;

public class MainActivity extends AppCompatActivity {
    TextView lcount;
    int mCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lcount = (TextView)findViewById(R.id.countview);

    }

    public void showToast(View view) {

        	Toast toast = Toast.makeText(this,"count is:"+mCount ,Toast.LENGTH_LONG);
        	toast.show();    }

    public void countUp(View view) {
        mCount++;
        if(lcount!=null)
            lcount.setText(Integer.toString(mCount));
    }
}
