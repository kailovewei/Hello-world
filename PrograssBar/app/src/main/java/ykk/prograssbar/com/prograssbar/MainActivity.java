package ykk.prograssbar.com.prograssbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private Button button_1;
    private  Button button_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar= (ProgressBar) findViewById(R.id.prograssBar_ID);
        button_1= (Button) findViewById(R.id.button1_id);
        button_2= (Button) findViewById(R.id.button2_id);
        ButtonListener listener=new ButtonListener();
        button_1.setOnClickListener(listener);
        button_2.setOnClickListener(listener);
    }
    class ButtonListener implements View.OnClickListener
    {

        @Override
        public void onClick(View v) {
            Button button=(Button)v;
            switch (button.getId())
            {
                case R.id.button1_id:
                    progressBar.incrementProgressBy(10);
                    break;
                case R.id.button2_id:
                    progressBar.incrementSecondaryProgressBy(10);
                    break;
                default:
                    break;
            }
        }
    }
}
