package com.example.shixun;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class PersonInfor extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_person_infor);
	

	//我的姓名修改按钮
	final EditText name = (EditText)findViewById(R.id.person_name);
	name.setOnClickListener(new OnClickListener(){
		public void onClick(View v)
		{
			name.setEnabled(true);
		}
	});
	
	//我的性别修改按钮
		final EditText sex = (EditText)findViewById(R.id.person_sex);
		sex.setOnClickListener(new OnClickListener(){
			public void onClick(View v)
			{
				sex.setEnabled(true);
			}
		});
	
	//我的姓名修改按钮
		final EditText phone = (EditText)findViewById(R.id.person_phone);
		phone.setOnClickListener(new OnClickListener(){
			public void onClick(View v)
			{
				phone.setEnabled(true);
			}
		});
	}
	
}
