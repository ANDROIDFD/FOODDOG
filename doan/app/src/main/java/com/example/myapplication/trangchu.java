package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.parsaniahardik.splashgifanimated.R;

public class trangchu extends AppCompatActivity {
    ViewFlipper viewFlipper;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangchu);
        int images[]={R.drawable.hinh1,R.drawable.hinh2,R.drawable.hinh3};
        viewFlipper=findViewById(R.id.vn);
        for(int image: images)
        {
            flipimage(image);
        }
    }

    public void flipimage (int image)
    {
        ImageView imageView =new ImageView(this);
        imageView.setBackgroundResource(image);
        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(9000);//số giây hình đổi 1000=1 giây
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.ECLAIR_MR1) {
            viewFlipper.setAutoStart(true);
        }

        viewFlipper.setInAnimation(this, R.anim.slife_in_left );
        viewFlipper.setInAnimation(this, R.anim.slide_in_right );
    }
}
