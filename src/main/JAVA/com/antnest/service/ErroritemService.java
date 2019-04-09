package com.antnest.service;

import com.antnest.po.ErrorItem;
import org.springframework.stereotype.Repository;

@Repository
public interface ErroritemService {
    boolean updateErroritems(ErrorItem erroritem);

    ErrorItem geterroritems(int mid,int itid);

    int getItemtimes(int mid,int itid);

    boolean updaterrortimes(ErrorItem erroritem);

}
