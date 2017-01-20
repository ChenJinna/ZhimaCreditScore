package com.kina.zhimacreditscore;

import android.content.Context;

/****
 * @Project_Name: ZhimaCreditScore
 * @Copyright: Copyright © 2012-2017 G-emall Technology Co.,Ltd
 * @Version: 1.0.0.1
 * @Created by:     g-emall on 2017/1/6 14:04.
 * @Desc:
 * @ModifyHistory:
 ****/

// px与dp互相转换
public class DensityUtils {

    public static int dp2px(Context context, float dp) {
        //获取设备密度
        float density = context.getResources().getDisplayMetrics().density;
        int px = (int) (dp * density + 0.5f);
        return px;
    }

    public static float px2dp(Context context, int px) {
        //获取设备密度
        float density = context.getResources().getDisplayMetrics().density;
        float dp = px / density;
        return dp;
    }

}
