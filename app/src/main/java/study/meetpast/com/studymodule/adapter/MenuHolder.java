package study.meetpast.com.studymodule.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import java.util.List;

import study.meetpast.com.studymodule.R;
import study.meetpast.com.studymodule.transformer.TransFormerItem;


/**
 * @ explain:
 * @ author：xujun on 2016/8/15 11:57
 * @ email：gdutxiaoxu@163.com
 */
public class MenuHolder extends BaseViewHolder<TransFormerItem>{

    TextView tvContent;


    public MenuHolder(Context context) {
        super(context);
    }

    @Override
    public View initView() {
        mConvertView=View.inflate(mContext, R.layout.item_menu,null);
        tvContent= (TextView) mConvertView.findViewById(R.id.tv_content);
        return mConvertView;
    }

    @Override
    public void refreshData(List<TransFormerItem> data, int position, TransFormerItem
            transFormerItem) {
        String title = transFormerItem.title;
        if(!TextUtils.isEmpty(title)){
            tvContent.setText(title);
        }

    }
}
