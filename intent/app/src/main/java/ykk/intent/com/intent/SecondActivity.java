package ykk.intent.com.intent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;

/**
 * Created by Dell-home on 2016/12/31.
 */

public class SecondActivity extends Activity {
    private Button button_2;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */

    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.second_layout);
        button_2 = (Button) findViewById(R.id.button_2);
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
               // String data = intent.getStringExtra("extra_data");
                //Log.d("SecondActivity", data);
                startActivity(intent);
            }
        });

    }
}


