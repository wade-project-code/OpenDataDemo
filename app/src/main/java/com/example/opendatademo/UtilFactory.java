package com.example.opendatademo;

/**
 * Created by Wade on 2020/2/12.
 */
public class UtilFactory {
    public static String getArea_Pkid(int Pkid){
        String area = "";
        switch(Pkid){
            case 2:
                area = "臺北市";
                break;
            case 3:
                area = "新北市";
                break;
            case 4:
                area = "基隆市";
                break;
            case 5:
                area = "宜蘭縣";
                break;
            case 6:
                area = "桃園縣";
                break;
            case 7:
                area = "新竹縣";
                break;
            case 8:
                area = "新竹市";
                break;
            case 9:
                area = "苗栗縣";
                break;
            case 10:
                area = "臺中市";
                break;
            case 11:
                area = "彰化縣";
                break;
            case 12:
                area = "南投縣";
            case 13:
                area = "雲林縣";
                break;
            case 14:
                area = "嘉義縣";
                break;
            case 15:
                area = "嘉義市";
            case 16:
                area = "臺南市";
                break;
            case 17:
                area = "高雄市";
                break;
            case 18:
                area = "屏東縣";
                break;
            case 19:
                area = "花蓮縣";
                break;
            case 20:
                area = "臺東縣";
                break;
            case 21:
                area = "澎湖縣";
                break;
            case 22:
                area = "金門縣";
                break;
            case 23:
                area = "連江縣";
                break;
        }

        return area;
    }
}
