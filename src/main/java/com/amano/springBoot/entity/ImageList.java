package com.amano.springBoot.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "imageList")
public class ImageList {
//    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "type")
    private Integer type;

    @Column(name = "title")
    private String title;

    @Column(name = "uploadDt")
    private String uploadDt;

    @Column(name = "headImage")
    private String headImage;

    @Column(name = "height")
    private String height;

    @Column(name = "width")
    private String width;

    public ImageList(Integer type, String title, String uploadDt, String headImage, String height, String width) {
        this.type = type;
        this.title = title;
        this.uploadDt = uploadDt;
        this.headImage = headImage;
        this.height = height;
        this.width = width;
    }

    public ImageList() {
    }
}
