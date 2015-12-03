package com.example.mapper;

import com.example.domain.City;
import org.apache.ibatis.annotations.Param;

public interface CityMapper {

    City findByState(@Param("state") String state);

}
