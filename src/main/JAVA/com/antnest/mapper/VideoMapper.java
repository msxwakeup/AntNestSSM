package com.antnest.mapper;

import com.antnest.po.Video;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("VideoMapper")
public interface VideoMapper {
    boolean uploadVideo(Video video);
    List<Video> getnewvideo(); //取最新视频
    List<Video> getIndexvideo();  //首页视频取浏览次数最多的视频
    List<Video> getvideos(int size);   //
    Video getvideo(int id);
    boolean savevideotimes(int newtiems,int vid);
    int gettimes(int id);
    List<Video> getTimesvideo();  //取浏览次数最多的视频

}
