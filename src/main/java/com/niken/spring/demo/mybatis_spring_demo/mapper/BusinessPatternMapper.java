package com.niken.spring.demo.mybatis_spring_demo.mapper;

import com.niken.spring.demo.mybatis_spring_demo.model.BusinessPattern;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by nikenpramadhantie on 7/4/17.
 */
public interface BusinessPatternMapper {

    @Insert("insert into business_pattern(name) values(#{name})")
    public void insertBusinessPattern(BusinessPattern businessPattern);

    @Select("select * from business_pattern")
    public List<BusinessPattern> findAllBusinessPatterns();

    @Select("select * from business_pattern where id=#{id}")
    public BusinessPattern findBusinessPatternById(Integer id);

    @Delete("delete from business_pattern where id=#{id}")
    public void deleteBusinessPatternById(Integer id);
}
