package kr.hs.emirim.ksmj0211.muhanchicken;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity implements View.OnClickListener {

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
        mName.setText("");
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "집에 가고 싶어!", Toast.LENGTH_LONG).show();
    }
}
