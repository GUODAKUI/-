package com.example.shixun;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class HiTao extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hi_tao);
		
		//返回键
		Button backButton =(Button)findViewById(R.id.backbtn);
		backButton.setOnClickListener(new OnClickListener(){
			public void onClick(View v){
				
				
				try {
					this.finalize();
				} catch (Throwable e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				});
		//收藏夹
		LinearLayout favoriteButton = (LinearLayout)findViewById(R.id.favoritybtn);
		favoriteButton.setOnClickListener(new OnClickListener(){
			public void onClick(View v)
			{
				Intent intent=new Intent(HiTao.this, Myfavorite.class);
			
				startActivity(intent);
			}
		});
		
		//个人信息
		LinearLayout personinforButton = (LinearLayout)findViewById(R.id.personinforbtn);
		personinforButton.setOnClickListener(new OnClickListener(){
			public void onClick(View v)
			{
				Intent intent=new Intent(HiTao.this, PersonInfor.class);
			
				startActivity(intent);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hi_tao, menu);
		return true;
	}

}
