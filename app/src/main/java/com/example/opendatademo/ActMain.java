package com.example.opendatademo;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.opendatademo.fragment.AboutFragment;
import com.example.opendatademo.fragment.ChartFragment;
import com.example.opendatademo.fragment.ListFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Wade on 2020/2/12.
 */
public class ActMain extends AppCompatActivity {
    private static final String TAG = "ActMain";
    private Boolean isExit = false;
    private Boolean hasTask = false;
    private Timer timerExit;
    private TimerTask task;

    private void InitTask(){
        timerExit = new Timer();
        task = new TimerTask() {
            @Override
            public void run() {
                isExit = false;
                hasTask = true;
            }
        };
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitTask();

        BottomNavigationView mBottomNavigationView = findViewById(R.id.mBottomNavigationView);
        mBottomNavigationView.setOnNavigationItemSelectedListener(mBottomNavigationView_Listener);

        loadFragment(ListFragment.newInstance());
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mBottomNavigationView_Listener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()){
                case R.id.ListFragment:
                    loadFragment(ListFragment.newInstance());
                    return true;
                case R.id.ChartFragment:
                    loadFragment(ChartFragment.newInstance());
                    return true;
                case R.id.AboutFragment:
                    loadFragment(AboutFragment.newInstance());
                    return true;
            }
            return false;
        }
    };

    private void loadFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.mFrameLayout,fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
            if(!isExit) {
                isExit = true;
                Toast.makeText(this, "再按一次離開", Toast.LENGTH_SHORT).show();

                if(!hasTask) {
                    timerExit.schedule(task, 2000);
                }
            } else {
                finish();
                System.exit(0);
            }
        }
        return false;
    }
}