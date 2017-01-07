package ykk.imageview.com.imageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView1;
    ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView1= (ImageView) findViewById(R.id.imageViewId);
        imageView2= (ImageView) findViewById(R.id.imageView2Id);
        //imageView.setImageResource(R.mipmap.ic_launcher);
        imageView1.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }
}
