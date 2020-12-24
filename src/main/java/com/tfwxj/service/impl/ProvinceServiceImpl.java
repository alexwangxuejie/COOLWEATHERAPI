package com.tfwxj.service.impl;

import com.tfwxj.dao.ProvinceDao;
import com.tfwxj.entity.Province;
import com.tfwxj.service.ProvinceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Resource
    private  ProvinceDao provinceDao;



    @Override
    public List<Province> findAllProvince1() {
        return provinceDao.selectAllProvince1();
    }
}
