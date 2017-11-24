package com.my.db;

public class Paper {
  private Long id;
  private String title;
  private String time;
  private String author;
  private String paper;
  private Long user_id;
  private Long one_id;
  private Long two_id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getPaper() {
    return paper;
  }

  public void setPaper(String paper) {
    this.paper = paper;
  }

  public Long getUser_id() {
    return user_id;
  }

  public void setUser_id(Long user_id) {
    this.user_id = user_id;
  }

  public Long getOne_id() {
    return one_id;
  }

  public void setOne_id(Long one_id) {
    this.one_id = one_id;
  }

  public Long getTwo_id() {
    return two_id;
  }

  public void setTwo_id(Long two_id) {
    this.two_id = two_id;
  }
}
