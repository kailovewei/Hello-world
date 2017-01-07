package ykk.menu_toast.com.menu_toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        menu.add(Menu.NONE,Menu.FIRST+1,1,"下载").setIcon(R.drawable.ic_launcher);
        menu.add(0,2,2,"取消").setIcon(R.mipmap.ic_launcher);
        menu.add(0,3,0,"保存");
        menu.add(0,4,0,"完成");
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.add_item:
                Toast.makeText(this,"You click Add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "You click remove", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }
}
