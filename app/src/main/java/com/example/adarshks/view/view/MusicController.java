package com.example.adarshks.view.view;//package com.example.adarshks.view.view;
//
//import android.content.Context;
//import android.widget.MediaController;
//
//public class MusicController extends MediaController {
//
//    public MusicController(Context c){
//        super(c);
//    }
//
//    public void hide(){}
//
//}

import android.content.Context;
import android.view.KeyEvent;
import android.widget.MediaController;

public class MusicController extends MediaController {
    Context c;

    public MusicController(Context c) {
        super(c);
        this.c = c;
    }

    public void hide() {
        super.hide();
    }

//    @Override
//    public boolean dispatchKeyEvent(KeyEvent event) {
//        int keyCode = event.getKeyCode();
//        if (keyCode == KeyEvent.KEYCODE_BACK) {
//            ((MainActivity) c).onBackPressed();
//            return true;
//        }
//        return super.dispatchKeyEvent(event);
//    }

}