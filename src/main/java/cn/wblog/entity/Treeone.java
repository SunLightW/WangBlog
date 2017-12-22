package cn.wblog.entity;

public class Treeone {
    private Integer id;

    private String name;

    private String queennum;

    private String state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getQueennum() {
        return queennum;
    }

    public void setQueennum(String queennum) {
        this.queennum = queennum == null ? null : queennum.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}