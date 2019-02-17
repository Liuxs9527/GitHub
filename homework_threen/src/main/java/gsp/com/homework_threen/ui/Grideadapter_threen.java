package gsp.com.homework_threen.ui;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

import gsp.com.homework_threen.R;
import gsp.com.homework_threen.data.Shoppingbean;

/**
 * 文件描述：
 * 作者：${郭少堋}
 * 创建时间：2019/2/15   20:19
 * 更改时间：2019/2/15   20:19
 * 版本号：1
 */
public class Grideadapter_threen extends BaseQuickAdapter<Shoppingbean.ResultBean.PzshBean.CommodityListBeanX,BaseViewHolder> {
    public Grideadapter_threen(int layoutResId, @Nullable List<Shoppingbean.ResultBean.PzshBean.CommodityListBeanX> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, Shoppingbean.ResultBean.PzshBean.CommodityListBeanX item) {
        //获取文字
        helper.setText(R.id.gridetext, item.getCommodityName());
        //获取图片   记得强转一下helper.getView(R.id.image)
        Glide.with(mContext).load(item.getMasterPic()).into((ImageView) helper.getView(R.id.grideimage));

    }
}
