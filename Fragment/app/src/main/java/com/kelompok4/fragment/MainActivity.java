package com.kelompok4.fragment;

import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.frame_container)
    FrameLayout frameContainer;

    @BindView(R.id.btn_fragment1)
    Button btn1;

    @BindView(R.id.btn_fragment2)
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(MainActivity.this);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        fragmentTransaction.add(R.id.frame_container, new FirstFragment());
        fragmentTransaction.add(R.id.frame_container, new SecondFragment());
        fragmentTransaction.commit();
    }

    @OnClick(R.id.btn_fragment1)
    public void onBtnFragment1Clicked(){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frame_container, new FirstFragment());
        fragmentTransaction.commit();
    }

    @OnClick(R.id.btn_fragment2)
    public void onBtnFragment2Clicked(){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frame_container, new SecondFragment());
        fragmentTransaction.commit();
    }
}
