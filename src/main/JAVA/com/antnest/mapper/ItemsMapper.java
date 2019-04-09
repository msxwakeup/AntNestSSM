package com.antnest.mapper;

import com.antnest.po.Items;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository("ItemsMapper")
public interface ItemsMapper {
    //按类型查找题目
    List<Items> getItems(String catagroy);
    Items getitem(String catagroy,int num);
    int getcatagroynum(String catagroy);

}
