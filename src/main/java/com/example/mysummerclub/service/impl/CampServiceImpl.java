package com.example.mysummerclub.service.impl;

import com.example.mysummerclub.mapper.CampMapper;
import com.example.mysummerclub.pojo.Camp;
import com.example.mysummerclub.pojo.CampExample;
import com.example.mysummerclub.service.CampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class CampServiceImpl implements CampService {

    @Autowired
    private CampMapper campMapper;

    @Override
    public void insertCamp(Camp camp) {
        campMapper.insert(camp);
    }

    @Override
    public void deleteCampById(Long id) {
        campMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateCampById(Camp camp) {
        campMapper.updateByPrimaryKeySelective(camp);
    }

    @Override
    public Camp findCampById(Long id) {
        Camp camp = campMapper.selectByPrimaryKey(id);
        return camp;
    }

    @Override
    public List<Camp> findAllCamp() {
        CampExample campExample = new CampExample();
        campExample.createCriteria()
                .getAllCriteria();
        List<Camp> camps = campMapper.selectByExample(campExample);
        return camps;
    }

    @Override
    public List<Camp> findCampByUserId(Long campId) {
        CampExample campExample = new CampExample();
        campExample.createCriteria()
                .andUserIdEqualTo(campId);
        List<Camp> camps = campMapper.selectByExample(campExample);
        return camps;
    }

    @Override
    public List<Camp> findCampByCampName(String campName) {
        CampExample campExample = new CampExample();
        campExample.createCriteria()
                .andCampNameEqualTo(campName);
        List<Camp> camps = campMapper.selectByExample(campExample);
        return camps;
    }
}
