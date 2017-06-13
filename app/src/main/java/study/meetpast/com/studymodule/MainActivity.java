package study.meetpast.com.studymodule;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * activity .setContentView绘制流程分析
     * 创建PhoneWindow mWindow，mWindow.setContentView
     * 创建ViewGroup mContentParent，创建DecorView mDecor
     * mContentParent = generateLayout(mDecor); mDecor = generateDecor(-1);
     * mLayoutInflater.inflate(layoutResID, mContentParent); mLayoutInflater = LayoutInflater.from(context);
     *
     */
}
