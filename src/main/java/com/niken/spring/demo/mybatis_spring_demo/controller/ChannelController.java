package com.niken.spring.demo.mybatis_spring_demo.controller;

import com.niken.spring.demo.mybatis_spring_demo.dto.InsertChannelDTO;
import com.niken.spring.demo.mybatis_spring_demo.model.Channel;
import com.niken.spring.demo.mybatis_spring_demo.service.ChannelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by nikenpramadhantie on 7/5/17.
 */

@RestController
public class ChannelController {

    @Autowired
    public ChannelService channelService;

    @RequestMapping(value = "/channel", method = RequestMethod.POST)
    public ResponseEntity<?> insertChannel(@RequestBody InsertChannelDTO dto) {
        channelService.insertChannel(dto);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/channel", method = RequestMethod.GET)
    public ResponseEntity<?> findAllChannels() {
        return new ResponseEntity<>(channelService.findAllChannels(), HttpStatus.OK);
    }

    @RequestMapping(value = "/channel/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> findChannelById(@PathVariable int id) {
        Integer channelId = (Integer) id;

        Channel channel = channelService.findChannelById(channelId);

        if (channel != null) {
            return new ResponseEntity<>(channel, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
