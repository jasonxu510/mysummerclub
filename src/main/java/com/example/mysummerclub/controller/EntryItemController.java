package com.example.mysummerclub.controller;

import com.example.mysummerclub.pojo.EntryItem;
import com.example.mysummerclub.service.EntryItemService;
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
public class EntryItemController {

    @Autowired
    private EntryItemService entryItemService;

    //添加entryItem
    @ApiOperation("添加entryItem")
    @PostMapping("/insertEntryItem.action")
    public SzpJsonResult insertEntryItem(@RequestBody EntryItem entryItem, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        entryItemService.insertEntryItem(entryItem);
        return SzpJsonResult.ok();
    }

    //通过ID删除entryItem
    @ApiOperation("通过ID删除entryItem")
    @DeleteMapping("/deleteEntryItem.action")
    public SzpJsonResult deleteEntryItemById(@RequestBody Long id, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        entryItemService.deleteEntryItem(id);
        return SzpJsonResult.ok();
    }

    //通过主键ID更新entryItem，更新值不为null的字段
    @ApiOperation("通过主键ID更新entryItem，更新值不为null的字段")
    @PutMapping("/updateEntryItemById.action")
    public SzpJsonResult updateEntryItemById(@RequestBody EntryItem entryItem, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        entryItemService.updateEntryItem(entryItem);
        return SzpJsonResult.ok();
    }

    //通过ID查找entryItem
    @ApiOperation("通过ID查找entryItem")
    @GetMapping("/findEntryItemById.action")
    public SzpJsonResult findEntryItemById(Long id, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        EntryItem entryItemById = entryItemService.findEntryItemById(id);
        return SzpJsonResult.ok(entryItemById);
    }

    //显示所有的entryItem
    @ApiOperation("显示所有的entryItem")
    @GetMapping("/findAllEntryItem.action")
    public SzpJsonResult findAllEntryItem(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<EntryItem> allEntryItem = entryItemService.findAllEntryItem();
        return SzpJsonResult.ok(allEntryItem);
    }

    //通过userID查找entryItem
    @ApiOperation("通过userID查找entryItem")
    @GetMapping("/findEntryItemByUserId.action")
    public SzpJsonResult findEntryItemByUserId(Long userId, HttpServletResponse response){
        response.setHeader("Access-Control-Allow-Origin", "*");
        List<EntryItem> entryItemByUserId = entryItemService.findEntryItemByUserId(userId);
        return SzpJsonResult.ok(entryItemByUserId);
    }
}
