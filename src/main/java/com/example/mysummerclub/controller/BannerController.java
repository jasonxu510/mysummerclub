package com.example.mysummerclub.controller;

import com.example.mysummerclub.pojo.Banner;
import com.example.mysummerclub.service.BannerService;
import com.example.mysummerclub.service.impl.BannerServiceImpl;
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
public class BannerController {

    @Autowired
     private BannerService bannerService;

    //添加新的banner
    @ApiOperation("添加新的banner")
    @PostMapping("/insertBanner.action")
    public SzpJsonResult insertBanner(@RequestBody Banner banner, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        bannerService.insertBanner(banner);
        return SzpJsonResult.ok();
    }

    //通过ID删除banner
    @ApiOperation("通过ID删除banner")
    @DeleteMapping("/deleteBannerById.action")
    public SzpJsonResult deleteBannerById(@RequestBody Long id, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        bannerService.deleteBanner(id);
        return SzpJsonResult.ok();
    }

    //通过主键ID更新banner，更新值不为null的字段
    @ApiOperation("通过主键ID更新banner，更新值不为null的字段")
    @PutMapping("/updateBannerById.action")
    public SzpJsonResult updateBannerById(@RequestBody Banner banner, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        bannerService.updateBanner(banner);
        return SzpJsonResult.ok();
    }

    //通过ID找到banner
    @ApiOperation("通过ID查找banner")
    @GetMapping("/findBannerById.action")
    public SzpJsonResult findBannerById(Long id, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        Banner bannerById = bannerService.findBannerById(id);
        return SzpJsonResult.ok(bannerById);
    }

    //显示所有banner
    @ApiOperation("显示所有的banner")
    @GetMapping("/findAllBanner.action")
    public SzpJsonResult findAllBanner(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<Banner> allBanner = bannerService.findAllBanner();
        return SzpJsonResult.ok(allBanner);
    }
}
