package com.example.more;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private TextView mText;
    private EditText mEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = findViewById(R.id.mybutton);
        mText = findViewById(R.id.myText);
        mEdit = findViewById(R.id.myEdit);

        // title name
        mButton.setText(R.string.button_name);
       // mText.setText(R.string.text_name);
        mText.setVisibility(View.INVISIBLE);

        mButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String enterText;
                enterText = mEdit.getText().toString();

                mText.setVisibility(View.VISIBLE);
                mText.setText(enterText);

            }
        });
    }

//    public void showName(View view){
//        mText.setVisibility(View.VISIBLE);
//        mText.setText(R.string.show_me);
//    }
}
