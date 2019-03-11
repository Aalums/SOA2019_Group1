package com.demo.Recipe.Manage;

public class Manage {
    private String memberId;
    private String menuId;
    private String menuDetail;

    public Manage() { }

    public Manage(String memberId, String menuId, String menuDetail) {
        this.memberId = memberId;
        this.menuId = menuId;
        this.menuDetail = menuDetail;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuDetail() {
        return menuDetail;
    }

    public void setMenuDetail(String menuDetail) {
        this.menuDetail = menuDetail;
    }
}
