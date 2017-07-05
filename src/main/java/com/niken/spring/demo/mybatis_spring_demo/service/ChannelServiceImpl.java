package com.niken.spring.demo.mybatis_spring_demo.service;

import com.niken.spring.demo.mybatis_spring_demo.dto.InsertChannelDTO;
import com.niken.spring.demo.mybatis_spring_demo.mapper.ChannelMapper;
import com.niken.spring.demo.mybatis_spring_demo.model.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nikenpramadhantie on 7/5/17.
 */
@Service
public class ChannelServiceImpl implements ChannelService{

    @Autowired
    public ChannelMapper channelMapper;

    @Override
    public void insertChannel(InsertChannelDTO channelDTO) {
        Channel channel = new Channel();

        channel.setName(channelDTO.getName());
        channelMapper.insertChannel(channel);
    }

    @Override
    public List<Channel> findAllChannels() {
        return channelMapper.findAllChannels();
    }

    @Override
    public Channel findChannelById(Integer id) {
        return channelMapper.findChannelById(id);
    }

    @Override
    public void deleteChannelById(Integer id) {
        channelMapper.deleteChannelById(id);
    }
}
