package com.antnest.mapper;

import com.antnest.po.ErrorItem;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("ErroritemMapper")
public interface ErroritemMapper {

    int updateErroritems(ErrorItem erroritem);

    List<ErrorItem> geterroritems(int memId);

    int getItemtimes(int mid,int itid);

    boolean updaterrortimes(ErrorItem erroritem);

}
