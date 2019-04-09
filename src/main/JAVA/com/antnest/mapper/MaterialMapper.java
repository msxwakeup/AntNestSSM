package com.antnest.mapper;

import com.antnest.po.Material;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
@Repository("MaterialMapper")
public interface MaterialMapper {
    //按名字查询显示系列文件
    public List<Material> getMaterial(String names)throws SQLException;
    //通过id查询link
    public Material getMaterials(int id)throws SQLException;
    public boolean uploadMaterial(Material material)throws SQLException;
    //按知识点查询显示系列
    public List<Material> getSeries(String knowledge, int start, int size)throws SQLException;
    //按类型显示系列
    //public List<Material> getshow(int id )throws SQLException;
    public  List<Material> getshow(String name,int start,int size)throws SQLException;
    public List<Material> getMaterials(String knowledge)throws SQLException;

}
