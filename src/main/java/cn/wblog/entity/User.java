package cn.wblog.entity;

public class User {
  private Long id;
  private String username;
  private String password;
  private String realname;//真实姓名
  private String state;//角色
  private String email;
  private String tel;
  private String createtime;
  private String updatetime;
  private String isexist;//是否存在。0.不存在;1.存在
  private String lastip;
  private String iplocation;

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

  public String getRealname() {
    return realname;
  }

  public void setRealname(String realname) {
    this.realname = realname;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public String getCreattime() {
    return createtime;
  }

  public void setCreattime(String creattime) {
    this.createtime = creattime;
  }

  public String getUpdatetime() {
    return updatetime;
  }

  public void setUpdatetime(String updatetime) {
    this.updatetime = updatetime;
  }

  public String getIsexist() {
    return isexist;
  }

  public void setIsexist(String isexist) {
    this.isexist = isexist;
  }

  public String getLastip() {
    return lastip;
  }

  public void setLastip(String lastip) {
    this.lastip = lastip;
  }

  public String getIplocation() {
    return iplocation;
  }

  public void setIplocation(String iplocation) {
    this.iplocation = iplocation;
  }
}
