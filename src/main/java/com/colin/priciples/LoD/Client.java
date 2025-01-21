package com.colin.priciples.LoD;

public class Client {

    public static void main(String[] args) {

        // 1.创建经纪人类
        Agent agent = new Agent();

        // 2.创建明星对象并注入经纪人
        Star star = new Star("五月天");
        agent.setStar(star);

        // 3.创建粉丝对象并注入经纪人
        Fans fans = new Fans("小明");
        agent.setFans(fans);

        // 4.创建公司对象并注入经纪人
        Company company = new Company("娱乐天堂");
        agent.setCompany(company);

        // 5.粉丝见面
        agent.meet();

        // 6.公司洽谈
        agent.business();
    }
}
