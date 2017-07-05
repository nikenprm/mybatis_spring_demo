package com.niken.spring.demo.mybatis_spring_demo.controller;

import com.niken.spring.demo.mybatis_spring_demo.dto.InsertBusinessPatternDTO;
import com.niken.spring.demo.mybatis_spring_demo.model.BusinessPattern;
import com.niken.spring.demo.mybatis_spring_demo.service.BusinessPatternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Created by nikenpramadhantie on 7/5/17.
 */
@RestController
public class BusinessPatternController {
    
    @Autowired
    private BusinessPatternService businessPatternService;

    @RequestMapping(value = "/pattern", method = RequestMethod.POST)
    public ResponseEntity<?> insertBusinessPattern(@RequestBody InsertBusinessPatternDTO dto) {
        businessPatternService.insertBusinessPattern(dto);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @RequestMapping(value = "/pattern", method = RequestMethod.GET)
    public ResponseEntity<?> findAllBusinessPatterns() {
        return new ResponseEntity<>(businessPatternService.findAllBusinessPatterns(), HttpStatus.OK);
    }

    @RequestMapping(value = "/pattern/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> findBusinessPatternById(@PathVariable int id) {
        Integer businessPatternId = (Integer) id;

        BusinessPattern businessPattern = businessPatternService.findBusinessPatternById(businessPatternId);

        if (businessPattern != null) {
            return new ResponseEntity<>(businessPattern, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/pattern/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteBusinessPatternById(@PathVariable int id) {
        Integer businessPatternId = (Integer) id;

        businessPatternService.deleteBusinessPatternById(businessPatternId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
