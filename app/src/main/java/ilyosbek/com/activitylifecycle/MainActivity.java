package ilyosbek.com.activitylifecycle;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "MainActivity";
    TextView textView;
    private static String TEXT_CONTENTS = "Contents";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: In here");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
        Log.d(TAG, "onCreate: OUT");
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "OnResume: program is resumed!");
        super.onResume();
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "OnStart: program started!");
        super.onStart();

    }

    @Override
    protected void onRestart() {
        Log.d(TAG, "onRestart: program restarted!");
        super.onRestart();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause: program paused!");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop: program stopped!");
        super.onStop();
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        Log.d(TAG, "onSavedInstanceState: program is saving the state...");
        savedInstanceState.putString(TEXT_CONTENTS, textView.getText().toString());
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: Program is being destroyed...");
        super.onDestroy();
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        Log.d(TAG, "onRestoreInstanceState: program is restoring the saved instance...");
        super.onRestoreInstanceState(savedInstanceState);
        textView.setText(savedInstanceState.getString(TEXT_CONTENTS));
    }

    public void press(View view) {
        textView.setText("Hi man");

    }

}
