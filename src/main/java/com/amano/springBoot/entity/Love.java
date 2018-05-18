package com.amano.springBoot.entity;

import com.amano.springBoot.common.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Love extends BaseEntity {


    private Long userId;

    private String imageListId;

    private Boolean isLove;


}
