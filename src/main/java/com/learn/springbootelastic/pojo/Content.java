package com.learn.springbootelastic.pojo;

import org.springframework.stereotype.Component;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/10/26 1:03<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
@Component
public class Content {
    private String img;
    private String price;
    private String title;

    public Content() {
    }

    public Content(String img, String price, String name) {
        this.img = img;
        this.price = price;
        this.title = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Content{" +
                "img='" + img + '\'' +
                ", price='" + price + '\'' +
                ", name='" + title + '\'' +
                '}';
    }
}
