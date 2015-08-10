package mns.com.remindmee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private Toolbar tolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initToolbar();
    }

private void initToolbar(){
    tolbar = (Toolbar) findViewById(R.id.toolbar);
    tolbar.setTitle(R.string.app_name);
    tolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
        @Override
        public boolean onMenuItemClick(MenuItem item) {
            return false;
        }
    });

    tolbar.inflateMenu(R.menu.menu_main);
}
}
