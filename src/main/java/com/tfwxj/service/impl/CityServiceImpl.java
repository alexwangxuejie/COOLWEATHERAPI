package com.tfwxj.service.impl;

import com.tfwxj.dao.CityDao;
import com.tfwxj.entity.City;
import com.tfwxj.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Resource
    private CityDao cityDao;



    @Override
    public List<City> selectAllCity1(int provinceid) {
        return cityDao.selectAllCity1(provinceid);
    }
}
