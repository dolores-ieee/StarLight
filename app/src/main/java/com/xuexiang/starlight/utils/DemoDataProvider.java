/*
 * Copyright (C) 2020 xuexiangjys(xuexiangjys@163.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.xuexiang.starlight.utils;

import android.content.Context;
import android.graphics.drawable.Drawable;

import com.xuexiang.starlight.R;
import com.xuexiang.starlight.adapter.entity.NewInfo;
import com.xuexiang.xaop.annotation.MemoryCache;
import com.xuexiang.xui.adapter.simple.AdapterItem;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.widget.banner.widget.banner.BannerItem;

import java.util.ArrayList;
import java.util.List;

/**
 * 演示数据
 *
 * @author xuexiang
 * @since 2018/11/23 下午5:52
 */
public class DemoDataProvider {

    public static String[] titles = new String[]{
            "3分钟心理学：每天3分钟，获得1个心理知识",
            "心理减肥术：不自虐，做得到的高效瘦身法",
            "复旦沈奕斐的社会学爱情思维课",
            "壹心理首个自我成长系列课程｜用心理学实现自我进化",
            "13堂女性自我提升课：活出女性的力量，从平凡到通透",
    };

    public static String[] urls = new String[]{//640*360 360/640=0.5625
            "https://ossimg.xinli001.com/20181008/5a5a33197f293767f5d1f13b78174733.jpg",//3分钟心理学：每天3分钟，获得1个心理知识
            "https://ossimg.xinli001.com/2021313/1615605231612dXAWrYjSyNwvt8mb3LLbAY1XcZsm8YS3.jpg",//心理减肥术：不自虐，做得到的高效瘦身法
            "https://ossimg.xinli001.com/20200824/d5b4dd97ab937e2dd31a7c61906acd0e.jpg",//复旦沈奕斐的社会学爱情思维课
            "https://ossimg.xinli001.com/20190601/b06a5945a711a2fcdc29bd84b2a2ed51.jpg",//壹心理首个自我成长系列课程｜用心理学实现自我进化
            "https://ossimg.xinli001.com/2021625/1624605876355hJiRM76o00UELd9AEKtcY818u7c8lefO.jpg",//13堂女性自我提升课：活出女性的力量，从平凡到通透
    };

    @MemoryCache
    public static List<BannerItem> getBannerList() {
        List<BannerItem> list = new ArrayList<>();
        for (int i = 0; i < urls.length; i++) {
            BannerItem item = new BannerItem();
            item.imgUrl = urls[i];
            item.title = titles[i];

            list.add(item);
        }
        return list;
    }

    /**
     * 用于占位的空信息
     *
     * @return
     */
    @MemoryCache
    public static List<NewInfo> getDemoNewInfos() {
        List<NewInfo> list = new ArrayList<>();
        list.add(new NewInfo("随便找了个链接1", "随便起个名字1")
                .setSummary("随便概括一下1\n")
                .setDetailUrl("http://mp.weixin.qq.com/mp/homepage?__biz=Mzg2NjA3NDIyMA==&hid=5&sn=bdee5aafe9cc2e0a618d055117c84139&scene=18#wechat_redirect")
                .setImageUrl("https://p6-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/463930705a844f638433d1b26273a7cf~tplv-k3u1fbpfcp-watermark.image"));

        list.add(new NewInfo("随便找了个链接2", "随便起个名字2")
                .setSummary("随便概括一下2\n")
                .setDetailUrl("https://juejin.im/post/5c3ed1dae51d4543805ea48d")
                .setImageUrl("https://user-gold-cdn.xitu.io/2019/1/16/1685563ae5456408?imageView2/0/w/1280/h/960/format/webp/ignore-error/1"));

        list.add(new NewInfo("随便找了个链接3", "随便起个名字3")
                .setSummary("随便概括一下3")
                .setDetailUrl("https://juejin.im/post/5b480b79e51d45190905ef44")
                .setImageUrl("https://user-gold-cdn.xitu.io/2018/7/13/16492d9b7877dc21?imageView2/0/w/1280/h/960/format/webp/ignore-error/1"));

        list.add(new NewInfo("随便找了个链接4", "随便起个名字4")
                .setSummary("随便概括一下4")
                .setDetailUrl("https://juejin.im/post/5b6b9b49e51d4576b828978d")
                .setImageUrl("https://user-gold-cdn.xitu.io/2018/8/9/1651c568a7e30e02?imageView2/0/w/1280/h/960/format/webp/ignore-error/1"));

        list.add(new NewInfo("随便找了个链接5", "随便起个名字5")
                .setSummary("随便概括一下5")
                .setDetailUrl("https://juejin.im/post/5c6fc0cdf265da2dda694f05")
                .setImageUrl("https://user-gold-cdn.xitu.io/2019/2/22/16914891cd8a950a?imageView2/0/w/1280/h/960/format/webp/ignore-error/1"));
        return list;
    }

    public static List<AdapterItem> getGridItems(Context context) {
        return getGridItems(context, R.array.grid_titles_entry, R.array.grid_icons_entry);
    }


    private static List<AdapterItem> getGridItems(Context context, int titleArrayId, int iconArrayId) {
        List<AdapterItem> list = new ArrayList<>();
        String[] titles = ResUtils.getStringArray(titleArrayId);
        Drawable[] icons = ResUtils.getDrawableArray(context, iconArrayId);
        for (int i = 0; i < titles.length; i++) {
            list.add(new AdapterItem(titles[i], icons[i]));
        }
        return list;
    }

    /**
     * 用于占位的空信息
     *
     * @return
     */
    @MemoryCache
    public static List<NewInfo> getEmptyNewInfo() {
        List<NewInfo> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(new NewInfo());
        }
        return list;
    }

}
