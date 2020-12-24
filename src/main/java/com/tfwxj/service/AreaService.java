package com.tfwxj.service;

import com.tfwxj.entity.Area;

import java.util.List;

public interface AreaService {


    List<Area> selectAllArea1(int provinceid,int cityid);
}
