package study.meetpast.com.studymodule.adapter;

import android.content.Context;

import java.util.List;

import study.meetpast.com.studymodule.transformer.TransFormerItem;


/**
 * @ explain:
 * @ author：xujun on 2016/8/15 11:18
 * @ email：gdutxiaoxu@163.com
 */
public class MenuAdapter extends BaseListAdapter<TransFormerItem> {


    public MenuAdapter(Context context, List<TransFormerItem> datas) {
        super(context, datas);
    }

    @Override
    protected BaseViewHolder<TransFormerItem> getHolder() {
        return new MenuHolder(mContext);
    }


}
