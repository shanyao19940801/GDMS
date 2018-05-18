package com.amano.springBoot.entity;

import com.amano.springBoot.common.entity.BaseEntity;
import com.amano.springBoot.controller.enumConstant.DanmakuStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Danmaku extends BaseEntity {


    private Long imageDetailId;

    private String content;

    private Long userId;

    private DanmakuStatus danmakuStatus;
}
