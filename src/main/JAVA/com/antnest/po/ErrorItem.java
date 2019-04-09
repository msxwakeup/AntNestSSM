package com.antnest.po;

public class ErrorItem {
    private Integer eId;
    private Member member;
    private Items items;
    private  int times;    //时间
    private  String Yanswer;   //你的答案
    private  Integer finishtimes;  //做错次数


    public String toString() {
        return "ErrorItem{" +
                "eId=" + eId +
                ", member=" + member +
                ", items=" + items +
                ", times=" + times +
                ", Yanswer='" + Yanswer + '\'' +
                ", finishtimes=" + finishtimes +
                '}';
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public Member getMember() {
        return member;
    }


    public void setMember(Member member) {
        this.member = member;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public String getYanswer() {
        return Yanswer;
    }

    public void setYanswer(String yanswer) {
        Yanswer = yanswer;
    }

    public Integer getFinishtimes() {
        return finishtimes;
    }

    public void setFinishtimes(Integer finishtimes) {
        this.finishtimes = finishtimes;
    }
}
