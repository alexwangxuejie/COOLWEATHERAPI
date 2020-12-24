package com.tfwxj.dao;

import com.tfwxj.entity.Area;

import java.util.List;

public interface AreaDao {


    List<Area> selectAllArea1(int provinceid,int cityid);
}
