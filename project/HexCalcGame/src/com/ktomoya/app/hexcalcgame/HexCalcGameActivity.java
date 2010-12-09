package com.ktomoya.app.hexcalcgame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HexCalcGameActivity extends Activity implements OnClickListener
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {	
    	Button button;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hexcalcgameactivity);
        button = (Button)findViewById(R.id.Button01);
        button.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent intent = new Intent(HexCalcGameActivity.this, MyPreferenceActivity.class);
		startActivity(intent);
	}
}

