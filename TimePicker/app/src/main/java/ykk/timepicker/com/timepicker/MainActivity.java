package ykk.timepicker.com.timepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TimePicker timePicker;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker= (TimePicker) findViewById(R.id.timePicker_Id);
        button= (Button) findViewById(R.id.button_Id);
        timePicker.setIs24HourView(true);
        ButtonListener listener=new ButtonListener();
        button.setOnClickListener(listener);
       // TimePickerListener listener=new TimePickerListener();
        //timePicker.setOnTimeChangedListener(listener);
    }

    class ButtonListener implements View.OnClickListener
    {
        @Override
        public void onClick(View v) {
            int hour=timePicker.getCurrentHour();
            int minute=timePicker.getCurrentMinute();
            Toast.makeText(MainActivity.this,"you click "+hour+"小时"+minute+"分钟",Toast.LENGTH_SHORT).show();

        }
    }
    class TimePickerListener implements TimePicker.OnTimeChangedListener
    {

        @Override
        public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
            Toast.makeText(MainActivity.this,"you click "+hourOfDay+"小时"+minute+"分钟",Toast.LENGTH_SHORT).show();
        }
    }
}
