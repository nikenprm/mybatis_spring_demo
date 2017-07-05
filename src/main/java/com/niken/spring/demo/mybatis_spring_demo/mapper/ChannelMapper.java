package com.niken.spring.demo.mybatis_spring_demo.mapper;

import com.niken.spring.demo.mybatis_spring_demo.model.Channel;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by nikenpramadhantie on 7/4/17.
 */
public interface ChannelMapper {

    @Insert("insert into channel(name) values(#{name})")
    public void insertChannel(Channel channel);

    @Select("select * from channel")
    public List<Channel> findAllChannels();

    @Select("select * from channel where id=#{id}")
    public Channel findChannelById(Integer id);

}
