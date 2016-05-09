package cc.fish.fishhttpdemo;

import java.io.Serializable;
import java.util.List;

/**
 * Created by fish on 16-5-9.
 */
public class JokeResponseEntity {
    /*response data is:

    {
        "showapi_res_code": 0,
            "showapi_res_error": "",
            "showapi_res_body": {
                "allNum": 2980,
                "allPages": 149,
                "contentlist": [
                {
                "ct": "2015-08-13 13:10:26.149",
                "text": "新人发帖求过…… 媳妇最近怀孕了…天天这也不想吃那也不想吃…有一天发脾气要我给他做想吃的，结果做了好多还是没有想吃的…最后着急了大喊:再做不出我想吃的我就去大街上要饭……我想说:你吃什么自己都不知道我怎么做啊…唉…想想男人女人都不容易啊…",
                "title": "媳妇儿有了…",
                "type": 1
                },
                {
                "ct": "2015-08-13 13:10:26.149",
                "text": "为了让自己多活动，我把放在电脑桌上的零食拿到了外面的茶几上，这样最起码为了吃我也能走动走动。…………现在我的零食经常会过期……",
                "title": "计划失败，吃货兼网虫的悲哀",
                "type": 1
                },...],
        "currentPage": 1,
        "maxResult": 20
        }
    }
*/
    private int showapi_res_code;
    private String showapi_res_error;
    private JokeResponseBody showapi_res_body;

    public int getShowapi_res_code() {
        return showapi_res_code;
    }

    public void setShowapi_res_code(int showapi_res_code) {
        this.showapi_res_code = showapi_res_code;
    }

    public String getShowapi_res_error() {
        return showapi_res_error;
    }

    public void setShowapi_res_error(String showapi_res_error) {
        this.showapi_res_error = showapi_res_error;
    }

    public JokeResponseBody getShowapi_res_body() {
        return showapi_res_body;
    }

    public void setShowapi_res_body(JokeResponseBody showapi_res_body) {
        this.showapi_res_body = showapi_res_body;
    }

    public class JokeResponseBody implements Serializable {
        private int allNum, allPages, currentPage, maxResult;
        private List<JokeBean> contentlist;

        public int getAllNum() {
            return allNum;
        }

        public void setAllNum(int allNum) {
            this.allNum = allNum;
        }

        public int getAllPages() {
            return allPages;
        }

        public void setAllPages(int allPages) {
            this.allPages = allPages;
        }

        public int getCurrentPage() {
            return currentPage;
        }

        public void setCurrentPage(int currentPage) {
            this.currentPage = currentPage;
        }

        public int getMaxResult() {
            return maxResult;
        }

        public void setMaxResult(int maxResult) {
            this.maxResult = maxResult;
        }

        public List<JokeBean> getContentlist() {
            return contentlist;
        }

        public void setContentlist(List<JokeBean> contentlist) {
            this.contentlist = contentlist;
        }

        @Override
        public String toString() {
            return "JokeResponseBody{" +
                    "allNum=" + allNum +
                    ", allPages=" + allPages +
                    ", currentPage=" + currentPage +
                    ", maxResult=" + maxResult +
                    ", contentlist=" + contentlist +
                    '}';
        }
    }
}
