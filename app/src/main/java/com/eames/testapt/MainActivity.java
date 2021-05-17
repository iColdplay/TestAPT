package com.eames.testapt;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.eames.apt_annotation.BindView;
import com.eames.apt_library.BindViewTools;

public class MainActivity extends Activity {

    @BindView(R.id.tv)
    TextView mTextView;
    @BindView(R.id.btn)
    Button   mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BindViewTools.bind(this);
        mTextView.setText("bind TextView success");
        mButton.setText("bind Button success");
    }
}