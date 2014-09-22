package myAdpater;

import android.R.string;

public class GoodsList {
	
	public String picture = null;
	public String name = null;
	public String price = null;

	public void setPicture(String p)
	{
		this.picture=p;
	}
	
	public String getPicture()
	{
		return picture;
	}
	
	
	public void setName(String n)
	{
		this.name=n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setPrice(String p)
	{
		this.price=p;
	}
	
	public String getPrice()
	{
		return price;
	}
}
