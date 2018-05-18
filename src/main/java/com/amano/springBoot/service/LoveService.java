package com.amano.springBoot.service;

import com.amano.springBoot.controller.input.LoveInput;
import com.amano.springBoot.controller.output.Msg;
import com.amano.springBoot.entity.Love;
import com.amano.springBoot.repo.LoveRepo;
import com.amano.springBoot.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoveService {

    @Autowired
    LoveRepo loveRepo;

    public Msg love(LoveInput input) {
        Love love = new Love();
        love.setIsLove(input.getIsLove());
        love.setImageListId(input.getImageListId());
        love.setUserId(input.getUserId());

        loveRepo.save(love);
        return ResultUtil.success();
    }
}
