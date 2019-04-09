package com.antnest.service.impl;

import com.antnest.mapper.ErroritemMapper;
import com.antnest.po.ErrorItem;
import com.antnest.service.ErroritemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("ErroritemServiceImpl")
public class ErroritemServiceImpl implements ErroritemService {

    @Autowired
    @Qualifier("ErroritemMapper")
    private ErroritemMapper erroritemMapper;

    public boolean updateErroritems(ErrorItem erroritem) {

       boolean flag=false;
//        flag=erroritemMapper.updateErroritems(erroritem);
//
       return flag;
    }

    public ErrorItem geterroritems(int mid, int itid) {
        return null;
    }

    public int getItemtimes(int mid, int itid) {
        return 0;
    }

    public boolean updaterrortimes(ErrorItem erroritem) {
        return false;
    }
}
