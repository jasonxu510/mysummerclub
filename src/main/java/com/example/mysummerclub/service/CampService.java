package com.example.mysummerclub.service;

import com.example.mysummerclub.pojo.Camp;

import java.util.List;

/**
 *
 */
public interface CampService {

    //添加新的camp
    void insertCamp(Camp camp);

    //通过ID删除camp
    void deleteCampById(Long id);

    //通过主键更新camp，更新值不为null的字段
    void updateCampById(Camp camp);

    //通过ID查找camp
    Camp findCampById(Long id);

    //显示所有camp
    List<Camp> findAllCamp();

    //通过userId查找camp
    List<Camp> findCampByUserId(Long campId);

    //通过campName查找camp
    List<Camp> findCampByCampName(String campName);

}
