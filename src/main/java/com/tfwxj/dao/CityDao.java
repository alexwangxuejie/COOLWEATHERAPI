package com.tfwxj.dao;

import com.tfwxj.entity.City;

import java.util.List;

public interface CityDao {


    List<City> selectAllCity1(int provinceid);
}
