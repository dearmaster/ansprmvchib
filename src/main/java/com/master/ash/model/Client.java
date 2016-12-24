package com.master.ash.model;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "client_tbl", uniqueConstraints = { @UniqueConstraint(columnNames = { "mail", "phone" }) })
public class Client {

    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "gender")
    private String gender;
    //@JSONField is used to format the date type, from fastjson
    @Column(name = "birthday")
    @JSONField(format = "yyyy-MM-dd")
    private Date birthday;
    @Column(name = "address")
    private String address;
    @Column(name = "firm")
    private String firm;
    @Basic(optional = false)
    @Column(name = "mail")
    private String mail;
    @Column(name = "phone", nullable = false)
    private String phone;

    public Client() {
    }

    public Client(String name, String gender, Date birthday, String address, String firm, String mail, String phone) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
        this.firm = firm;
        this.mail = mail;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", firm='" + firm + '\'' +
                ", mail='" + mail + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}