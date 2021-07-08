package com.xuexiang.starlight;

import com.xuexiang.starlight.core.http.entity.TipInfo;
import com.xuexiang.xhttp2.model.ApiResult;
import com.xuexiang.xutil.net.JsonUtil;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);


        TipInfo info = new TipInfo();
        info.setTitle("Welcome to StarLight");
        info.setContent("这里是一个小组项目软件 STARLIGHT，为大学生提供心理健康的解决方案 ~");
        List<TipInfo> list = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            list.add(info);
        }
        ApiResult<List<TipInfo>> result = new ApiResult<>();
        result.setData(list);
        System.out.println(JsonUtil.toJson(result));
    }
}