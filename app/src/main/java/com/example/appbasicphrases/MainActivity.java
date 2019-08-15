package com.example.appbasicphrases;

/*This programs aims to teach the user translations of some basic phrases
from English to French*/
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
MediaPlayer m1,m2,m3,m4,m5,m6,m7,m8;

public void play(View view)     //here we take different actions according to the users choice
    {
    String ourId=view.getResources().getResourceEntryName(view.getId());
    switch(ourId)
    {
        case "n1": {
            m1.start();
            break;
        }
         case "n2": {
             m2.start();
             break;
         }
         case "n3": {
             m3.start();
             break;
        }
        case "n4": {
            m4.start();
            break;
         }
        case "n5": {
            m5.start();
            break;
        }
        case "n6":{
            m6.start();
            break;
        }
         case "n7": {
             m7.start();
             break;
        }
        case "n8":
            m8.start();
    }
}


    @Override
    protected void onCreate(Bundle savedInstanceState) {

    /*here we assign the translation of different phrases in English to French
        which is stored in the raw file to various variables*/

        m1=(MediaPlayer.create(this,R.raw.goodevening));
        m2=(MediaPlayer.create(this,R.raw.hello));
        m3=(MediaPlayer.create(this,R.raw.howareyou));
        m4=(MediaPlayer.create(this,R.raw.ilivein));
        m5=(MediaPlayer.create(this,R.raw.mynameis));
        m6=(MediaPlayer.create(this,R.raw.please));
        m7=(MediaPlayer.create(this,R.raw.welcome));
        m8=(MediaPlayer.create(this,R.raw.doyouspeakenglish));

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
