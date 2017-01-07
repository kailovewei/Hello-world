package ykk.checkbox.com.checkbox;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    private CheckBox eatBox;
    private CheckBox sleepBox;
    private CheckBox dotaBox;
    private CheckBox allId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eatBox = (CheckBox) findViewById(R.id.eatId);
        sleepBox = (CheckBox) findViewById(R.id.sleepId);
        dotaBox = (CheckBox) findViewById(R.id.dotId);
        allId= (CheckBox) findViewById(R.id.allId);
        /*
        OnBoxClickListener listener=new OnBoxClickListener();
        eatBox.setOnClickListener(listener);
        sleepBox.setOnClickListener(listener);
        dotaBox.setOnClickListener(listener);
        */
        CheckBoxListener listener=new CheckBoxListener();
        eatBox.setOnCheckedChangeListener(listener);
        sleepBox.setOnCheckedChangeListener(listener);
        dotaBox.setOnCheckedChangeListener(listener);
        allId.setOnCheckedChangeListener(listener);
    }

     class CheckBoxListener implements CompoundButton.OnCheckedChangeListener
     {
         @Override
         public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
             switch(buttonView.getId()) {
                 case R.id.eatId:
                     if (isChecked)
                         Toast.makeText(MainActivity.this, "you click eat", Toast.LENGTH_SHORT).show();
                     else
                         Toast.makeText(MainActivity.this, "you cancle eat", Toast.LENGTH_SHORT).show();
                     break;
                 case R.id.sleepId:
                     if (isChecked)
                         Toast.makeText(MainActivity.this, "you click sleep", Toast.LENGTH_SHORT).show();
                     else
                         Toast.makeText(MainActivity.this, "you cancle sleep", Toast.LENGTH_SHORT).show();
                     break;
                 case R.id.dotId:
                     if (isChecked)
                         Toast.makeText(MainActivity.this, "you click dota", Toast.LENGTH_SHORT).show();
                     else
                         Toast.makeText(MainActivity.this, "you cancle dota", Toast.LENGTH_SHORT).show();
                     break;
                 case R.id.allId:
                     eatBox.setChecked(isChecked);
                     sleepBox.setChecked(isChecked);
                     dotaBox.setChecked(isChecked);

                     /*
                     if (isChecked)
                     {
                         eatBox.setChecked(true);
                         sleepBox.setChecked(true);
                         dotaBox.setChecked(true);
                         Toast.makeText(MainActivity.this, "you click all_check", Toast.LENGTH_SHORT).show();
                     }
                     else
                     {
                         eatBox.setChecked(false);
                         sleepBox.setChecked(false);
                         dotaBox.setChecked(false);
                         Toast.makeText(MainActivity.this, "you cancle all_check", Toast.LENGTH_SHORT).show();
                     }
                     */
                     break;
                 default:
                     break;
             }
             }

     }
    /* //OnClickListener的使用方法
    class OnBoxClickListener implements View.OnClickListener
    {

        @Override
        public void onClick(View v) {
            CheckBox box=(CheckBox)v;
            switch(box.getId()){
                case R.id.eatId:
                    if(box.isChecked())
                        Toast.makeText(MainActivity.this,"you click eat",Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity.this,"you cancel eat",Toast.LENGTH_SHORT).show();
                    break;
                case R.id.sleepId:
                    if(box.isChecked())
                         Toast.makeText(MainActivity.this,"you click sleep",Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity.this,"you cancel sleep",Toast.LENGTH_SHORT).show();
                   break;
                case R.id.dotId:
                    if(box.isChecked())
                        Toast.makeText(MainActivity.this,"you click dota",Toast.LENGTH_SHORT).show();
                    else
                        Toast.makeText(MainActivity.this,"you cancel dota",Toast.LENGTH_SHORT).show();
                    break;
                default:
                    break;
            }
        }
    }


*/

}
