package model;

import java.util.StringTokenizer;

public class ThucDonModel {
    private String luaChon_MonChinh;
    private String luaChon_MonPhu;
    private double tongTien;

    public ThucDonModel() {
        this.luaChon_MonChinh = "";
        this.luaChon_MonPhu = "";
        this.tongTien = 0;
    }

    public String getLuaChon_MonChinh() {
        return luaChon_MonChinh;
    }

    public void setLuaChon_MonChinh(String luaChon_MonChinh) {
        this.luaChon_MonChinh = luaChon_MonChinh;
    }

    public String getLuaChon_MonPhu() {
        return luaChon_MonPhu;
    }

    public void setLuaChon_MonPhu(String luaChon_MonPhu) {
        this.luaChon_MonPhu = luaChon_MonPhu;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public void tinhTongTien() {
        this.tongTien = 0;
        if(this.luaChon_MonChinh.equals("Tôm Hùm")){
            tongTien += 2000000;
        }
        else if(this.luaChon_MonChinh.equals("Cua Hoàng Đế")){
            tongTien += 4000000;
        }
        else if(this.luaChon_MonChinh.equals("Cá Hồi")){
            tongTien += 1000000;
        }

        StringTokenizer stk = new StringTokenizer(this.luaChon_MonPhu, ";");
        while(stk.hasMoreTokens()){
            String monPhu = stk.nextToken();
            monPhu = monPhu.trim();
            if(monPhu.equals("Trà sữa")){
                tongTien += 20000;
            }
            else if(monPhu.equals("Tiramisu")){
                tongTien += 40000;
            }
            else if(monPhu.equals("Pancake")){
                tongTien += 40000;
            }
        }
    }
}
