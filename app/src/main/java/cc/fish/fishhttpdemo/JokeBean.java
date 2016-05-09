package cc.fish.fishhttpdemo;

/**
 * Created by fish on 16-5-9.
 */
public class JokeBean {
    /*
    "ct": "2015-08-13 13:10:26.149",
    "text": "为了让自己多活动，我把放在电脑桌上的零食拿到了外面的茶几上，这样最起码为了吃我也能走动走动。…………现在我的零食经常会过期……",
    "title": "计划失败，吃货兼网虫的悲哀",
    "type": 1
    */

    private String ct, text, title;
    private int type;

    public String getCt() {
        return ct;
    }

    public void setCt(String ct) {
        this.ct = ct;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "JokeBean{" +
                "ct='" + ct + '\'' +
                ", text='" + text + '\'' +
                ", title='" + title + '\'' +
                ", type=" + type +
                '}';
    }
}
