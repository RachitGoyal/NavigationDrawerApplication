package com.osahub.rachit.navigationdrawerapplication;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * @author dipenp
 *
 */
public class Activity2 extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		/**
		 * Adding our layout to parent class frame layout.
		 */
		getLayoutInflater().inflate(R.layout.activity_main, frameLayout);
		
		/**
		 * Setting title and itemChecked  
		 */
		mDrawerList.setItemChecked(position, true);
		setTitle(listArray[position]);
		
		((ImageView)findViewById(R.id.image_view)).setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.test2));
	}
}
