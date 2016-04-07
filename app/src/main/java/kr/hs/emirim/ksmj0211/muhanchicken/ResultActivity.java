package kr.hs.emirim.ksmj0211.muhanchicken;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by appcreator26 on 2016. 3. 28..
 */
public class ResultActivity extends Activity {
    static String TAG = "무한치킨:ResultActivity";
    TextView mResult;
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Log.d(TAG, "결과 액티비티 시작!");

        mResult = (TextView)findViewById(R.id.result);
        mImageView = (ImageView) findViewById(R.id.imageView);
        Log.d(TAG,"텍스트뷰 연결 성공!");

        Random r = new Random();
        int result = r.nextInt(2);
        Log.d(TAG,"랜덤값 생성! : " + result);


        mImageView.setImageResource(R.drawable.c01+result);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        Log.d(TAG,"인턴트값 읽기<name>! : " + name);

        int age = intent.getIntExtra("age", -1);
        Log.d(TAG,"인턴트값 읽기<age>! : " + age);
        mResult.setText(name + "님 안녕하세요!");
    }
}