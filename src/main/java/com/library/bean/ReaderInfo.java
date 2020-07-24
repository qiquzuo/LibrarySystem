package com.library.bean;

import java.io.Serializable;
import java.util.Date;

public class ReaderInfo implements Serializable {
    private long reader_id;//读者id
    private String name;//读者姓名
    private String sex;//读者性别
    private Date birth;//读者生日
    private String address;//读者地址
    private String phone;//读者电话
    //一下是get  set方法
    public long getReaderId() {
        return reader_id;
    }
    public void setReaderId(long reader_id) {
        this.reader_id = reader_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public Date getBirth() {
        return birth;
    }
    public void setBirth(Date birth) {
        this.birth = birth;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
