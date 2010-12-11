package com.ktomoya.app.hexcalcgame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HexCalcGameActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {	
    	Button startButton;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hexcalcgameactivity);
        
        startButton = (Button)findViewById(R.id.StartButton);
        startButton.setOnClickListener(new OnClickListener(){
        	@Override
        	public void onClick(View v) {
        		Intent intent = new Intent();
        		intent.setClass(HexCalcGameActivity.this, GameActivity.class);
        		startActivity(intent);
        		finish();
        	}
        });
    }
}

