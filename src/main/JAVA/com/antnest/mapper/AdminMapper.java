package com.antnest.mapper;

import com.antnest.po.Adminer;
import org.springframework.stereotype.Repository;

@Repository("AdminMapper")
public interface AdminMapper {
    Adminer getAdmin(String admName, String admPwd);
    boolean CheckAdmin(String ano, String pwd);

}
