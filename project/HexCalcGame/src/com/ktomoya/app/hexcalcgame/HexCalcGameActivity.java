package com.ktomoya.app.hexcalcgame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HexCalcGameActivity extends Activity {
	private Button mStartButton;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hexcalcgameactivity);
        
        mStartButton = (Button)findViewById(R.id.StartButton);
        mStartButton.setOnClickListener(new OnClickListener() {
        	@Override
        	public void onClick(View v) {
        		v.setEnabled(false);
        		Intent intent = new Intent();
        		intent.setClass(HexCalcGameActivity.this, GameActivity.class);
        		startActivity(intent);
        		finish();
        	}
        });
    }
    @Override
    public void onResume() {
    	super.onResume();
    	mStartButton.setEnabled(true);
    }
}

