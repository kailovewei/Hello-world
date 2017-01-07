package ykk.radiobutton.com.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup_1;
    private  RadioGroup radioGroup_2;
    private RadioButton a_Button;
    private RadioButton b_Button;
    private RadioButton c_Button;
    private  RadioButton d_Button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup_1= (RadioGroup) findViewById(R.id.Group_1);
        a_Button= (RadioButton) findViewById(R.id.a_ID);
        b_Button= (RadioButton) findViewById(R.id.b_Id);
        c_Button= (RadioButton) findViewById(R.id.c_Id);
        d_Button= (RadioButton) findViewById(R.id.d_ID);

        radioButtonListener listener=new radioButtonListener();
        a_Button.setOnCheckedChangeListener(listener);
        b_Button.setOnCheckedChangeListener(listener);
        //radioclikListener listener=new radioclikListener();
        //femalButton.setOnClickListener(listener);
       // maleButton.setOnClickListener(listener);

    }
       class radioButtonListener implements CompoundButton.OnCheckedChangeListener
       {

           @Override
           public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
               if(a_Button.isChecked())
               {
                   c_Button.setChecked(true);
               }
               else if (b_Button.isChecked())
               {
                   d_Button.setChecked(true);
               }
           }
       }
    /*
    class radioclikListener implements View.OnClickListener
    {

        @Override
        public void onClick(View v) {
            switch(v.getId())
            {
                case R.id.femalId:
                    Toast.makeText(MainActivity.this,"you click femal",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.maleId:
                    Toast.makeText(MainActivity.this,"You click male",Toast.LENGTH_SHORT).show();
                    break;
                default:
                    break;
            }

        }

    }
    */
}
