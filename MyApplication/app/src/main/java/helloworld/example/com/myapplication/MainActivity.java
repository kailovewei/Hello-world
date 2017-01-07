package helloworld.example.com.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textView);//返回view(父类)类型，因此向下转型。
        button=(Button)findViewById(R.id.button);
        ButtonLinstener buttonLinstener=new ButtonLinstener();
        button.setOnClickListener(buttonLinstener);
    }
    class ButtonLinstener implements View.OnClickListener
    {

        @Override
        public void onClick(View v) {
            count++;
            textView.setText(count+" ");//接受的是一个字符串
            if(count>5)
            {
                textView.setText("love");
                count=0;
            }

        }
    }
}
