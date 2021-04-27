package com.milkywaylhy.ex31activity_system_intnet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //시스템 인텐트를 이용해서 다른 앱들 실행하기
    public void clickDial(View view) {
        Intent intent= new Intent();
        intent.setAction(Intent.ACTION_DIAL);

        //미리 전화번호까지 선택가능
        Uri uri= Uri.parse("tel:01033289656,01011557491");
        intent.setData(uri);

        startActivity(intent);
    }

    public void clickSMS(View view) {
        Intent intent =new Intent();
        intent.setAction(Intent.ACTION_SENDTO);

        Uri uri=Uri.parse("smsto:01033289656");
        intent.setData(uri);

        intent.putExtra("sms_body","Hello...Nice to meet you");
        startActivity(intent);
    }

    public void clickWeb(View view) {
        Intent intent= new Intent(Intent.ACTION_VIEW);
       Uri uri = Uri.parse("Http://www.naver.com");

       startActivity(intent);
    }

    public void click_Gallery(View view) {
        Intent intent=new Intent(Intent.ACTION_PICK);
        intent.setType("image/*");
        startActivityForResult(intent,7);


    }

    public void click_Camera(View view) {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(intent);

    }
}