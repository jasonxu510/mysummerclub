package com.example.mysummerclub.controller;

import com.example.mysummerclub.pojo.Camp;
import com.example.mysummerclub.service.CampService;
import com.example.mysummerclub.utils.SzpJsonResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *
 */
@RestController
public class CampController {

    @Autowired
    private CampService campService;

    //添加新的camp
    @ApiOperation("添加新的camp")
    @PostMapping("/insertCamp.action")
    public SzpJsonResult insertCamp(@RequestBody Camp camp, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        campService.insertCamp(camp);
        return SzpJsonResult.ok();
    }

    //通过ID删除camp
    @ApiOperation("通过ID删除camp")
    @DeleteMapping("/deleteCampById.action")
    public SzpJsonResult deleteCampById(@RequestBody Long id, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        campService.deleteCampById(id);
        return SzpJsonResult.ok();
    }

    //通过主键ID更新camp，更新值不为null的字段
    @ApiOperation("通过主键ID更新camp，更新值不为null的字段")
    @PutMapping("/updateCampById.action")
    public SzpJsonResult updateCampById(@RequestBody Camp camp, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        campService.updateCampById(camp);
        return SzpJsonResult.ok();
    }

    //通过ID查找camp
    @ApiOperation("通过ID查找camp")
    @GetMapping("/findCampById.action")
    public SzpJsonResult findCampById(Long id, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        Camp campById = campService.findCampById(id);
        return SzpJsonResult.ok(campById);
    }

    //显示所有的camp
    @ApiOperation("显示所有的camp")
    @GetMapping("/findAllCamp.action")
    public SzpJsonResult findAllCamp(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<Camp> allCamp = campService.findAllCamp();
        return SzpJsonResult.ok(allCamp);
    }

    //通过userID查找camp
    @ApiOperation("通过userID查找camp")
    @GetMapping("/findCampByUserId.action")
    public SzpJsonResult findCampByUserId(Long userId, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<Camp> campByUserId = campService.findCampByUserId(userId);
        return SzpJsonResult.ok(campByUserId);
    }

    //通过userName查找camp
    @ApiOperation("通过userName查找camp")
    @GetMapping("/findCampByUserName.action")
    public SzpJsonResult findCampByUserName(String userName, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<Camp> campByCampName = campService.findCampByCampName(userName);
        return SzpJsonResult.ok(campByCampName);
    }
}
