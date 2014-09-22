package com.example.shixun;

import java.util.ArrayList;
import java.util.List;



import myAdpater.FavoriteAdpater;
import myAdpater.GoodsList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {

	String name = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final TextView t = (TextView)findViewById(R.id.textshow);
		Button bn = (Button)findViewById(R.id.button1);
		bn.setOnClickListener(new OnClickListener(){
			public void onClick(View v)
			{
				t.setText(new String("ASD"));
				Intent intent=new Intent(MainActivity.this, HiTao.class);
				//intent.putExtra(name, "gdk");
				startActivity(intent);
			}
		});
	}

	

}
