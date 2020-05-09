package com.wiser.recycleviewtopgradient;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

/**
 * **************************************
 * 项目名称:RecycleViewTopGradient
 *
 * @author wangxy
 * 邮箱：wangxianyu@ksjgs.com
 * 创建时间: 2020/5/9 5:56 PM
 * 用途：
 * **************************************
 */
public class CustomRecycleView extends RecyclerView {
    public CustomRecycleView(@NonNull Context context) {
        super(context);
    }

    public CustomRecycleView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomRecycleView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected float getTopFadingEdgeStrength() {
        return super.getTopFadingEdgeStrength();
    }

    @Override
    protected float getLeftFadingEdgeStrength() {
        return super.getLeftFadingEdgeStrength();
    }

    @Override
    protected float getBottomFadingEdgeStrength() {
        return super.getBottomFadingEdgeStrength();
    }

    @Override
    protected float getRightFadingEdgeStrength() {
        return super.getRightFadingEdgeStrength();
    }

}
