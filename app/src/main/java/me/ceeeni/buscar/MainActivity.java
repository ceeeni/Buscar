package me.ceeeni.buscar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static me.ceeeni.buscar.R.id.myEdit;
import static me.ceeeni.buscar.R.id.testTextView;

public class MainActivity extends Activity {


    private EditText mySearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySearch = (EditText) findViewById(myEdit);
        // final String query = mySearch.getText().toString();
        Button mySearchButton = (Button) findViewById(R.id.myButton);
        final TextView myTxt = (TextView) findViewById(R.id.testTextView);
        mySearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!TextUtils.isEmpty(mySearch.getText())) {

                    String content = mySearch.getText().toString();
                    // myTxt.setText(content);
                    Intent myIntent = new Intent(MainActivity.this, TweetActivity.class);
                    myIntent.putExtra("searchterm", content);
                    startActivity(myIntent);
                    // finish();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Test fail", Toast.LENGTH_LONG);
                }
            }
        });

    }
}