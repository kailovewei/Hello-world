package s01e08_margin_paddingp.com.s01e08_margin_padding;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textView);
        button=(Button)findViewById(R.id.button);
        ButtonLinstener buttonLinstener=new ButtonLinstener();
        button.setOnClickListener(buttonLinstener);

    }
    class ButtonLinstener implements View.OnClickListener
    {

        @Override
        public void onClick(View v) {
            Intent intent=new Intent(MainActivity.this,MyActivity.class);
            startActivity(intent);

        }
    }


}
