package com.amano.springBoot.controller.input;

import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public class LoveInput {

    @NotNull(message = "userid 不能唯为空")
    private Long userId;

    @NotNull(message = "imageListId 不能唯为空")
    private String imageListId;

    @NotNull(message = "isLove 不能唯为空")
    private Boolean isLove;

}
