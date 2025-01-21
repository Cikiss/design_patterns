package com.colin.priciples.LoD;

// 经纪人类
public class Agent {

    private Star star;
    private Company company;
    private Fans fans;

    // 和粉丝见面的方法
    public void meet() {
        System.out.println(fans.getName() + "和" + star.getName() + "见面");
    }

    // 和媒体公司洽谈的方法
    public void business() {
        System.out.println(company.getName() + "和" + star.getName() + "洽谈");
    }


    public void setStar(Star star) {
        this.star = star;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }
}
