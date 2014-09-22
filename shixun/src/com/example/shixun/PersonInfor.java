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
	

	//�ҵ������޸İ�ť
	final EditText name = (EditText)findViewById(R.id.person_name);
	name.setOnClickListener(new OnClickListener(){
		public void onClick(View v)
		{
			name.setEnabled(true);
		}
	});
	
	//�ҵ��Ա��޸İ�ť
		final EditText sex = (EditText)findViewById(R.id.person_sex);
		sex.setOnClickListener(new OnClickListener(){
			public void onClick(View v)
			{
				sex.setEnabled(true);
			}
		});
	
	//�ҵ������޸İ�ť
		final EditText phone = (EditText)findViewById(R.id.person_phone);
		phone.setOnClickListener(new OnClickListener(){
			public void onClick(View v)
			{
				phone.setEnabled(true);
			}
		});
	}
	
}
