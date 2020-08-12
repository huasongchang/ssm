package cn.tycoding.pojo;

import java.io.Serializable;
import java.sql.Date;

/**
 * 这是用户登录的JavaBean
 * @author tycoding
 * @date 18-4-7下午7:28
 */
public class User implements Serializable {

    //用户id
    private Long id;
    //用户名字
    private String username;
    //用户密码
    private String password;
    //用户账号
    private String account;
    //部门
    private String department;
    //手机号
    private String telephone;
    //邮箱
    private String mail;
    //有效时间
    private Date effectivetime;
    //状态
    private boolean status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount(){
        return account;
    }

    public void setAccount(String account){
        this.account = account;
    }

    public String getDepartment(){
        return department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getTelephone(){
        return telephone;
    }

    public void setTelephone(String telephone){
        this.telephone = telephone;
    }

    public String getMail(){
        return mail;
    }

    public void setMail(String mail){
        this.mail = mail;
    }

    public Date getEffectivetime() {
        return effectivetime;
    }

    public void setEffectivetime(Date effectivetime) {
        this.effectivetime = effectivetime;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
