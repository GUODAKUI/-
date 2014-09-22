package myAdpater;

import java.util.List;

import com.example.shixun.R;



import android.R.integer;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FavoriteAdpater extends BaseAdapter {

	
	private int mLayoutId = 0;
	private Context mContext = null;
	private List<GoodsList> mGoodsLists = null;
	

	public  FavoriteAdpater(List<GoodsList> goodsLists, int layoutId, Context context) {
		this.mGoodsLists = goodsLists;
		this.mLayoutId = layoutId;
		this.mContext = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mGoodsLists.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return mGoodsLists.get(arg0);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) mContext
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		LinearLayout ll = (LinearLayout) inflater.inflate(mLayoutId, null);

		ImageView picture = (ImageView) ll.findViewById(R.id.goodsPic);
		TextView price = (TextView) ll.findViewById(R.id.goodsPrice);
		TextView name = (TextView) ll.findViewById(R.id.goodsName);

		GoodsList goods = (GoodsList) getItem(position);

		price.setText(goods.getPrice());
		name.setText(goods.getName());

		int id = mContext.getResources().getIdentifier(goods.getPicture(), "drawable",
				mContext.getPackageName());

		picture.setImageResource(id);

		return ll;
	}


}
