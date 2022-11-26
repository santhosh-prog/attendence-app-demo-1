package com.example.attendenceappstart;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.attendenceappstart.AdminFragments.HomeFragment;
import com.example.attendenceappstart.EmployeeFragment.EmpHomeFrag;
import com.example.attendenceappstart.EmployeeFragment.EmpNotificationFrag;
import com.example.attendenceappstart.EmployeeFragment.EmpRequestFrag;
import com.example.attendenceappstart.EmployeeFragment.EmpSettingsFrag;
import com.example.attendenceappstart.databinding.ActivityEmployeeLoginBinding;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Employee_Login extends AppCompatActivity {

    ActivityEmployeeLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEmployeeLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
         replaceFragment(new EmpHomeFrag());
        binding.EmployeeBottomNavigationBar.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.EmployeeHome:
                        replaceFragment(new EmpHomeFrag());
                        break;
                    case R.id.EmpNotification:
                        replaceFragment(new EmpNotificationFrag());
                        break;
                    case R.id.EmpRequests:
                        replaceFragment(new EmpRequestFrag());
                        break;
                    case R.id.EmpSettings:
                        replaceFragment(new EmpSettingsFrag());
                        break;
                }

            return true;
            }
        });
    }
    private void replaceFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.EmployeeContainer, fragment);
        fragmentTransaction.commit();

    }
}