package kr.hs.emirim.ksmj0211.muhanchicken;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {

    EditText mName;
    Button mButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText)findViewById(R.id.name); //타입캐스팅을 해야 함
        mButton = (Button) findViewById(R.id.btn_showmethechicken);
        mButton.setOnClickListener(this);


    }

    @Override
    protected void onResume() {
        super.onResume();
        mName.setText(null);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    @Override
    public void onClick(View v) {

        String name = mName.getText().toString();   //String 타입을 넣어야 하므로 toString()메서드를 사용한다.
//        if(name==null) {
//            Toast.makeText(this, "이름을 입력해 주세요!", Toast.LENGTH_LONG).show();
//        }else {
//            Toast.makeText(this, name + "씨, 배고파요!", Toast.LENGTH_LONG).show();
//            Intent intent = new Intent(this, ResultActivity.class);
//            startActivity(intent);
//        }
        try{
            Toast.makeText(this, name + "씨, 배고파요!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("age", 10);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }catch(NullPointerException e){
            Toast.makeText(this, "이름을 입력해 주세요!", Toast.LENGTH_LONG).show();
        }catch(Exception e){
            Toast.makeText(this, "뭔지 모르지만 잘 안 되네요!", Toast.LENGTH_LONG).show();
        }
    }
}
