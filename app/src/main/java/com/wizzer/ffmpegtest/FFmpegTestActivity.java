package com.wizzer.ffmpegtest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class FFmpegTestActivity extends Activity {
    // Todo: Load the 'ffmpeg' libraries on application startup.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = findViewById(R.id.sample_text);
        //tv.setText(stringFromJNI());
        tv.setText("Hello AndroidTV");
    }
}
