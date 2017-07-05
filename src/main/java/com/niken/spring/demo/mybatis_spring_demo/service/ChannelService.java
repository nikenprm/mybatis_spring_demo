package com.niken.spring.demo.mybatis_spring_demo.service;

import com.niken.spring.demo.mybatis_spring_demo.dto.InsertChannelDTO;
import com.niken.spring.demo.mybatis_spring_demo.model.Channel;

import java.util.List;

/**
 * Created by nikenpramadhantie on 7/5/17.
 */
public interface ChannelService {

    public void insertChannel(InsertChannelDTO channelDTO);

    public List<Channel> findAllChannels();

    public Channel findChannelById(Integer id);
}
