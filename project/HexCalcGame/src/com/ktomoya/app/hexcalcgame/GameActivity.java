package com.ktomoya.app.hexcalcgame;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class GameActivity extends Activity implements OnClickListener {
	TextView mTestTextView;
	int mTestCount = 0;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		TableLayout numButtonLayout;
		super.onCreate(savedInstanceState);
		setContentView(R.layout.game_activity);
		
		numButtonLayout = (TableLayout)findViewById(R.id.numButtonLayout);
		int rowNum = numButtonLayout.getChildCount();
		for (int i = 0; i < rowNum; i++) {
			TableRow row = (TableRow)numButtonLayout.getChildAt(i);
			int buttonNum = row.getChildCount();
			for (int j = 0; j < buttonNum; j++) {
				Button button = (Button)row.getChildAt(j);
				if (button instanceof Button) {
					button.setOnClickListener(this);
				}
			}
		}
		
		mTestTextView = (TextView)findViewById(R.id.TestTextView);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()) {
		case R.id.Button00:
		case R.id.Button01:
		case R.id.Button02:
		case R.id.Button03:
		case R.id.Button04:
		case R.id.Button05:
		case R.id.Button06:
		case R.id.Button07:
		case R.id.Button08:
		case R.id.Button09:
		case R.id.Button0A:
		case R.id.Button0B:
		case R.id.Button0C:
		case R.id.Button0D:
		case R.id.Button0E:
		case R.id.Button0F:
		}
	}
}