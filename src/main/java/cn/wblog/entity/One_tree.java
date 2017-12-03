package cn.wblog.entity;


/**
 * 一级菜单entity
 */
public class One_tree {
  private Long id;
  private String name;
  private String state;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }
}
