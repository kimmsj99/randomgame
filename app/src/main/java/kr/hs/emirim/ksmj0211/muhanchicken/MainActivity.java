package kr.hs.emirim.ksmj0211.muhanchicken;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

    EditText mName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText)findViewById(R.id.name); //타입캐스팅을 해야 함

    }

    @Override
    protected void onResume() {
        super.onResume();
        mName.setText("");
    }
}
