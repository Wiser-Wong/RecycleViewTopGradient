package com.wiser.recycleviewtopgradient;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author wangxy
 *
 * 顶部渐变阴影 有点问题是滑动到顶部不显示 滑动中显示
 */
public class RecycleViewOneActivity extends FragmentActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view_one);

        RecyclerView rlvOne = findViewById(R.id.rlv_one);

        rlvOne.setLayoutManager(new LinearLayoutManager(this));
        rlvOne.setAdapter(new RecycleViewAdapter(this));
    }

}
