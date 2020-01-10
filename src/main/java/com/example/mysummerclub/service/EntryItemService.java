package com.example.mysummerclub.service;

import com.example.mysummerclub.pojo.EntryItem;

import java.util.List;

/**
 *
 */
public interface EntryItemService {

    //添加entryItem
    void insertEntryItem(EntryItem entryItem);

    //通过ID删除entryItem
    void deleteEntryItem(Long id);

    //通过主键ID更新entryItem，更新值不为null的字段
    void updateEntryItem(EntryItem entryItem);

    //通过ID查找entryItem
    EntryItem findEntryItemById(Long id);

    //显示所有的entryItem
    List<EntryItem> findAllEntryItem();

    //通过userID查找entryItem
    List<EntryItem> findEntryItemByUserId(Long userId);
}
