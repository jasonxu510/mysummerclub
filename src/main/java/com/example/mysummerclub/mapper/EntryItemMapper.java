package com.example.mysummerclub.mapper;

import com.example.mysummerclub.pojo.EntryItem;
import com.example.mysummerclub.pojo.EntryItemExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface EntryItemMapper {
    long countByExample(EntryItemExample example);

    int deleteByExample(EntryItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EntryItem record);

    int insertSelective(EntryItem record);

    List<EntryItem> selectByExample(EntryItemExample example);

    EntryItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EntryItem record, @Param("example") EntryItemExample example);

    int updateByExample(@Param("record") EntryItem record, @Param("example") EntryItemExample example);

    int updateByPrimaryKeySelective(EntryItem record);

    int updateByPrimaryKey(EntryItem record);
}