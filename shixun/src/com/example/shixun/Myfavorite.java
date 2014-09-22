package com.example.shixun;

import java.util.ArrayList;
import java.util.List;

import myAdpater.FavoriteAdpater;
import myAdpater.GoodsList;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class Myfavorite extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.shoucangjia);
		FavoriteAdpater fAdpater = new FavoriteAdpater(creatgoods(),R.layout.favority_list ,this );
		ListView ls = (ListView)findViewById(R.id.favoritylist);
		ls.setAdapter(fAdpater);
	}

	private List<GoodsList> creatgoods()
	{
		List<GoodsList> GG= new ArrayList<GoodsList>();
		GoodsList g1 = new GoodsList();
		g1.setName("联想电脑");
		g1.setPrice("3000");
		g1.setPicture("computer");
		GG.add(g1);
		
		GoodsList g2 = new GoodsList();
		g2.setName("三星品牌");
		g2.setPrice("4000");
		g2.setPicture("computer");
		GG.add(g2);
		
		GoodsList g3 = new GoodsList();
		g3.setName("苹果电脑");
		g3.setPrice("4500");
		g3.setPicture("computer");
		GG.add(g3);
		return GG;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.myfavorite, menu);
		return true;
	}

}
