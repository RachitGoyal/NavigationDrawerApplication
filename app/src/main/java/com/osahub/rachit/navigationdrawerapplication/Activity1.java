package com.osahub.rachit.navigationdrawerapplication;

import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * @author dipenp
 *
 */
public class Activity1 extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		/**
		 *  We will not use setContentView in this activty 
		 *  Rather than we will use layout inflater to add view in FrameLayout of our base activity layout*/
		
		/**
		 * Adding our layout to parent class frame layout.
		 */
		getLayoutInflater().inflate(R.layout.activity_main, frameLayout);
		
		/**
		 * Setting title and itemChecked  
		 */
		mDrawerList.setItemChecked(position, true);
		setTitle(listArray[position]);
		
		((ImageView)findViewById(R.id.image_view)).setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.test1));
	}
}
