package com.tfwxj.service.impl;

import com.tfwxj.dao.AreaDao;
import com.tfwxj.entity.Area;
import com.tfwxj.service.AreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class AreaServiceImpl implements AreaService {

    @Resource
    private AreaDao areaDao;



    @Override
    public List<Area> selectAllArea1(int provinceid, int cityid) {
        return areaDao.selectAllArea1(provinceid, cityid);
    }
}
