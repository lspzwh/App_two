package com.example.app2;

public class RvData {
    private String name;
    private String content;
    private int image;
    public  RvData(int image,String name,String content){
        this.content=content;
        this.image=image;
        this.name=name;
    }

    public int getImage() {
        return image;
    }

    public String getContent() {
        return content;
    }

    public String getName() {
        return name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }
}
