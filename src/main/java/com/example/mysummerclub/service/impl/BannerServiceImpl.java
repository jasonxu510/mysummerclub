package com.example.mysummerclub.service.impl;

import com.example.mysummerclub.mapper.BannerMapper;
import com.example.mysummerclub.pojo.Banner;
import com.example.mysummerclub.pojo.BannerExample;
import com.example.mysummerclub.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerServiceImpl implements BannerService {

    @Autowired
    private BannerMapper bannerMapper;

    @Override
    public void insertBanner(Banner banner) {
        bannerMapper.insert(banner);
    }

    @Override
    public void deleteBanner(Long id) {
        bannerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateBanner(Banner banner) {
        bannerMapper.updateByPrimaryKeySelective(banner);
    }

    @Override
    public Banner findBannerById(Long id) {
        Banner banner = bannerMapper.selectByPrimaryKey(id);
        return banner;
    }

    @Override
    public List<Banner> findAllBanner() {
        BannerExample bannerExample = new BannerExample();
        bannerExample.createCriteria()
                .getAllCriteria();
        List<Banner> banners = bannerMapper.selectByExample(bannerExample);
        return banners;
    }
}
