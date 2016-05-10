package cc.fish.fishhttpdemo;

import java.io.Serializable;

/**
 * Created by fish on 16-5-9.
 */
public class PostParam implements Serializable{
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public PostParam() {

    }

    public PostParam(String content) {

        this.content = content;
    }
}
