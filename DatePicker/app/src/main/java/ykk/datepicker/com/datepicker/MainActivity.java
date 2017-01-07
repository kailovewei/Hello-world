package ykk.datepicker.com.datepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private DatePicker datePicker;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datePicker= (DatePicker) findViewById(R.id.datePicker_Id);
        button= (Button) findViewById(R.id.button_Id);
        ButtonListener listener=new ButtonListener();
        button.setOnClickListener(listener);
    }
    class ButtonListener implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            int year=datePicker.getYear();
            int mouth=datePicker.getMonth();
            int minute=datePicker.getDayOfMonth();
            Toast.makeText(MainActivity.this,"You select "+year+"月"+mouth+"月"+minute+"日",Toast.LENGTH_SHORT).show();
        }
    }
}
