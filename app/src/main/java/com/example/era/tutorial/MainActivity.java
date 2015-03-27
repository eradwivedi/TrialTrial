package com.example.era.tutorial;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.StaticLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.util.Log;

public class MainActivity extends ActionBarActivity {
    private static final String TAG="era's message"; // just to filter out stuff that we wanna see, could be anything
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate");// Good for debugging, prints on screen, we never do it in our actual app

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart");// Good for debugging, prints on screen

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause");// Good for debugging, prints on screen

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"onStop");// Good for debugging, prints on screen

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onResume");// Good for debugging, prints on screen

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart");// Good for debugging, prints on screen

    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "onSaveInstanceState");
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy");// Good for debugging, prints on screen

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
 
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
