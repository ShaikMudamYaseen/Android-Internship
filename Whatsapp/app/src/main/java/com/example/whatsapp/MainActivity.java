package com.example.whatsapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.pager);
        viewPager.setAdapter(new Myadapter(getSupportFragmentManager()));
        tabLayout=findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_baseline_chat_24);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_baseline_flip_camera_android_24);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_baseline_call_24);
    }
    class Myadapter extends FragmentStatePagerAdapter {

        public Myadapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:return  new chats();
                case 1:return new status();
                case 2:return new calls();
            }

            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position)
            {
                case 0:return "chats";
                case 1:return "status";
                case 2:return "calls";
            }

            return super.getPageTitle(position);
        }
    }

}
