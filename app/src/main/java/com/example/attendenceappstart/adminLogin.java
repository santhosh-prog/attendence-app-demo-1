package com.example.attendenceappstart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.attendenceappstart.AdminFragments.HomeFragment;
import com.example.attendenceappstart.AdminFragments.NotificationFrag;
import com.example.attendenceappstart.AdminFragments.RequestsFrag;
import com.example.attendenceappstart.AdminFragments.SettingsFrag;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class adminLogin extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    HomeFragment homeFragment=new HomeFragment();
    NotificationFrag notificationFrag=new NotificationFrag();
    RequestsFrag requestsFrag=new RequestsFrag();
    SettingsFrag settingsFrag=new SettingsFrag();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_login);

        bottomNavigationView=findViewById(R.id.bottomNavigationBar);
        getSupportFragmentManager().beginTransaction().replace(R.id.FrameContainer,homeFragment).commit();

        BadgeDrawable badgeDrawable = bottomNavigationView.getOrCreateBadge(R.id.notification);
        badgeDrawable.setVisible(true);
        badgeDrawable.setNumber(8);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.FrameContainer,homeFragment).commit();
                        return true;
                    case R.id.notification:
                        getSupportFragmentManager().beginTransaction().replace(R.id.FrameContainer,notificationFrag).commit();
                        return true;
                    case R.id.requests:
                        getSupportFragmentManager().beginTransaction().replace(R.id.FrameContainer,requestsFrag).commit();
                        return true;
                    case R.id.settings:
                        getSupportFragmentManager().beginTransaction().replace(R.id.FrameContainer,settingsFrag).commit();
                        return true;
                }

                return false;
            }
        });

    }
}