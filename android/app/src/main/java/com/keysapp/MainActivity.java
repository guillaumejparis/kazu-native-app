package com.keysapp;

import android.view.KeyEvent;
import com.github.kevinejohn.keyevent.KeyEventModule;

import android.os.Bundle;
import com.facebook.react.ReactActivity;
import org.devio.rn.splashscreen.SplashScreen;

public class MainActivity extends ReactActivity {

   @Override
    protected void onCreate(Bundle savedInstanceState) {
        SplashScreen.show(this);
        super.onCreate(savedInstanceState);
    }

   @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
      if (event.getRepeatCount() == 0) {
        KeyEventModule.getInstance().onKeyDownEvent(keyCode, event);
      }

      return super.onKeyDown(keyCode, event);
    }


    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "KeysApp";
    }
}
