package com.ff.a0404demo.pojo;

public class User {

    private int img;
    private String name;
    private String infor;
    private String time;

    public User(int img, String name, String infor, String time) {
        this.img = img;
        this.name = name;
        this.infor = infor;
        this.time = time;
    }

    public int getImg() {
        return this.img;
    }

    public String getName() {
        return this.name;
    }

    public String getInfor() {
        return this.infor;
    }

    public String getTime() {
        return this.time;
    }

}
