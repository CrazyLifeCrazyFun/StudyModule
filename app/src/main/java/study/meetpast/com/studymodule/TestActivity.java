package study.meetpast.com.studymodule;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;


import java.util.ArrayList;
import java.util.List;

import study.meetpast.com.studymodule.adapter.MenuAdapter;
import study.meetpast.com.studymodule.transformer.CubeOutTransformer;
import study.meetpast.com.studymodule.transformer.DefaultTransformer;
import study.meetpast.com.studymodule.transformer.DepthPageTransformer;
import study.meetpast.com.studymodule.transformer.TableTransformer;
import study.meetpast.com.studymodule.transformer.TransFormerItem;
import study.meetpast.com.studymodule.transformer.ZoomOutPageTransformer;

public class TestActivity extends AppCompatActivity {

    ListView mListView;
    private List<TransFormerItem> mTransFormerItems;
    private MenuAdapter mMenuAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        mListView= (ListView) findViewById(R.id.listView);

        mTransFormerItems = new ArrayList<>();
        mTransFormerItems.add(new TransFormerItem(DefaultTransformer.class));
        mTransFormerItems.add(new TransFormerItem(ZoomOutPageTransformer.class));
        mTransFormerItems.add(new TransFormerItem(DepthPageTransformer.class));
        mTransFormerItems.add(new TransFormerItem(CubeOutTransformer.class));
        mTransFormerItems.add(new TransFormerItem(TableTransformer.class));

        mMenuAdapter = new MenuAdapter(this, mTransFormerItems);
        mListView.setAdapter(mMenuAdapter);
    }
}
