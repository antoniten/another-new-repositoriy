package com.development.mobile.andromeda.hometask3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button number;
    private Button sms;

    private TextView login;

    private String email=null;
    private String password=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        number = (Button) findViewById(R.id.button);
        sms = (Button) findViewById(R.id.button2);
        number.setOnClickListener(this);
        sms.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.button:
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1234567"));
                startActivity(intent);
            break;

            case R.id.button2:

                Intent intente = new Intent();
                intente.setType("vnd.android-dir/mms-sms");
                intente.putExtra("sms_body", "Some SMS text");
                startActivity(intente);
                break;
        }
    }
}
