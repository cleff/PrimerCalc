package com.example.primercalc2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class DoTheMath extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_do_the_math);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.do_the_math, menu);
		return true;
	}

		public String getAnnealingTemp (String sequence){
			/**
			 * And here goes the math for the String called sequence
			 */
			char[] arySequence = sequence.toCharArray();
			Integer intAcount=0;
			Integer intTcount=0;
			Integer intCcount=0;
			Integer intGcount=0;
			String answer;
			

			    for (char c : arySequence){
			        if (Character.toString(c).matches("[A]"))
			        	intAcount++;
			        if (Character.toString(c).matches("[T]"))
				    	intTcount++;
			        if (Character.toString(c).matches("[C]"))
				    	intCcount++;
			        if (Character.toString(c).matches("[G]"))
				    	intGcount++;
			    }
			
			
			answer = ("Tm: ");
			answer += ((intAcount + intTcount)*2 + (intCcount + intGcount)*4)-5;
			answer += "degrees C";
		return answer;
		}
}


