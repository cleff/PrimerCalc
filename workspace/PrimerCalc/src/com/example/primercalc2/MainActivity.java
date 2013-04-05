package com.example.primercalc2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends Activity {

	public final static String EXTRA_MESSAGE = "com.example.primercalc2.MESSAGE";
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
/** Called when the user clicks the Calculate Button */
	public void sendMessage (View view) {
// Do something in response to the Calculate Button//
		Intent intent = new Intent(this, DisplayMessageActivity.class);
		EditText editText = (EditText) findViewById(R.id.edit_message);
		String message = editText.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, message);
		startActivity(intent);
/**
 * TODO Disable Virtual Keyboard from popping up when text field is clicked		
 */
	}
	/**
	 * Called when the user clicks the Backspace Button
	 */
	public void changeSequenceDisplay (View view) {
		EditText editText = (EditText) findViewById(R.id.edit_message);
		String message = editText.getText().toString();
		int length = message.length();
		editText.setText(editText.getText().toString().substring(0,length-1));
		
	}
	/**
	 * Input Buttons A,T,C,G
	 * @param view
	 */
	public void changeSequenceDisplayA (View view) {
		EditText editText = (EditText) findViewById(R.id.edit_message);
		editText.setText(editText.getText().toString() + 'A');
	}
	public void changeSequenceDisplayT (View view) {
		EditText editText = (EditText) findViewById(R.id.edit_message);
		editText.setText(editText.getText().toString() + 'T');
	}
	public void changeSequenceDisplayC (View view) {
		EditText editText = (EditText) findViewById(R.id.edit_message);
		editText.setText(editText.getText().toString() + 'C');
	}
	public void changeSequenceDisplayG (View view) {
		EditText editText = (EditText) findViewById(R.id.edit_message);
		editText.setText(editText.getText().toString() + 'G');
	}

}
