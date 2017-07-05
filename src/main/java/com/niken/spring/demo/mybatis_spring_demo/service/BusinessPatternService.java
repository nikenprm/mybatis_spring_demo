package com.niken.spring.demo.mybatis_spring_demo.service;

import com.niken.spring.demo.mybatis_spring_demo.dto.InsertBusinessPatternDTO;
import com.niken.spring.demo.mybatis_spring_demo.model.BusinessPattern;

import java.util.List;

/**
 * Created by nikenpramadhantie on 7/5/17.
 */
public interface BusinessPatternService {

    public void insertBusinessPattern(InsertBusinessPatternDTO businessPatternDTO);

    public List<BusinessPattern> findAllBusinessPatterns();

    public BusinessPattern findBusinessPatternById(Integer id);

    public void deleteBusinessPatternById(Integer id);
}
