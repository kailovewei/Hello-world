package ykk.seekbar.com.seekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    private SeekBar seekBar;
    private Button button;
    private RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar= (SeekBar) findViewById(R.id.seekBar_Id);
        button= (Button) findViewById(R.id.button_Id);
        ratingBar= (RatingBar) findViewById(R.id.ratingBar_ID);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ratingBar.setRating(ratingBar.getRating()+(float) 0.5);
            }
        });
    }

    class SeekBarListener implements SeekBar.OnSeekBarChangeListener
    {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {

        }
    }
}
