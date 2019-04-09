package com.antnest.mapper;

import com.antnest.BaseTest;
import com.antnest.po.ErrorItem;
import com.antnest.po.Items;
import com.antnest.po.Member;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class ErroritemMapperTest  extends BaseTest {

    @Autowired
    @Qualifier("ErroritemMapper")
    private ErroritemMapper erroritemMapper;

    @Test
    public void geterroritems() {
//        ErrorItem errorItem=new ErrorItem();
//        Member member=new Member();
//        Items items=new Items();
//        items.setItId(3);
//        member.setMemId(3);
//
//        errorItem.setItems(items);
//        errorItem.setMember(member);
//        System.out.println(errorItem);
      List<ErrorItem> item=erroritemMapper.geterroritems(3);
        System.out.println(item);
    }

    @Test
    public void updateErroritems() {

        ErrorItem errorItem=new ErrorItem();
//        errorItem.setMemId(2);
//        errorItem.setItId(2);
//        errorItem.setTimes(1);
//        errorItem.setYanswer("A");

        int flag=erroritemMapper.updateErroritems(errorItem);
        System.out.println(flag);
    }
}