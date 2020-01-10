package com.example.mysummerclub.service.impl;

import com.example.mysummerclub.mapper.EntryItemMapper;
import com.example.mysummerclub.pojo.EntryItem;
import com.example.mysummerclub.pojo.EntryItemExample;
import com.example.mysummerclub.service.EntryItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class EntryItemServiceImpl implements EntryItemService {

    @Autowired
    private EntryItemMapper entryItemMapper;

    @Override
    public void insertEntryItem(EntryItem entryItem) {
        entryItemMapper.insert(entryItem);
    }

    @Override
    public void deleteEntryItem(Long id) {
        entryItemMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void updateEntryItem(EntryItem entryItem) {
        entryItemMapper.updateByPrimaryKeySelective(entryItem);
    }

    @Override
    public EntryItem findEntryItemById(Long id) {
        EntryItem entryItem = entryItemMapper.selectByPrimaryKey(id);
        return entryItem;
    }

    @Override
    public List<EntryItem> findAllEntryItem() {
        EntryItemExample entryItemExample = new EntryItemExample();
        entryItemExample.createCriteria()
                .getAllCriteria();
        List<EntryItem> entryItems = entryItemMapper.selectByExample(entryItemExample);
        return entryItems;
    }

    @Override
    public List<EntryItem> findEntryItemByUserId(Long userId) {
        EntryItemExample entryItemExample = new EntryItemExample();
        entryItemExample.createCriteria()
                .andUserIdEqualTo(userId);
        List<EntryItem> entryItems = entryItemMapper.selectByExample(entryItemExample);
        return entryItems;
    }
}
