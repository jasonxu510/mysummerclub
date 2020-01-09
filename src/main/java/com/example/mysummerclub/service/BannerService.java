package com.example.mysummerclub.service;

import com.example.mysummerclub.pojo.Banner;

import java.util.List;

/**
 *
 */
public interface BannerService {
    //添加新的banner
    void insertBanner(Banner banner);
    //通过ID删除banner
    void deleteBanner(Long id);
    //通过主键ID更新banner，更新值不为null的字段
    void updateBanner(Banner banner);
    //通过ID查找banner
    Banner findBannerById(Long id);
    //显示所有的banner
    List<Banner> findAllBanner();
}
