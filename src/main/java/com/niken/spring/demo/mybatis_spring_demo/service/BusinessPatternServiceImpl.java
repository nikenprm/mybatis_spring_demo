package com.niken.spring.demo.mybatis_spring_demo.service;

import com.niken.spring.demo.mybatis_spring_demo.dto.InsertBusinessPatternDTO;
import com.niken.spring.demo.mybatis_spring_demo.mapper.BusinessPatternMapper;
import com.niken.spring.demo.mybatis_spring_demo.model.BusinessPattern;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nikenpramadhantie on 7/5/17.
 */
@Service
public class BusinessPatternServiceImpl implements BusinessPatternService{

    @Autowired
    BusinessPatternMapper businessPatternMapper;

    @Override
    public void insertBusinessPattern(InsertBusinessPatternDTO businessPatternDTO) {
        BusinessPattern businessPattern = new BusinessPattern();

        businessPattern.setName(businessPatternDTO.getName());
        businessPatternMapper.insertBusinessPattern(businessPattern);
    }

    @Override
    public List<BusinessPattern> findAllBusinessPatterns() {
        return businessPatternMapper.findAllBusinessPatterns();
    }

    @Override
    public BusinessPattern findBusinessPatternById(Integer id) {
        return businessPatternMapper.findBusinessPatternById(id);
    }
}
