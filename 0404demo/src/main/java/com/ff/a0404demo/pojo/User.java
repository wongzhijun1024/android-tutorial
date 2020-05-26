package com.ff.a0404demo.pojo;

public class User {
    private int id=0;
    private int img;
    private String name;
    private String infor;
    private String time;

    public User(int id,int img, String name, String infor, String time) {
        this.id=id;
        this.img = img;
        this.name = name;
        this.infor = infor;
        this.time = time;
    }

    public int getId(){
        return id;
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
