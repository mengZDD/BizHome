package com.zdd.risk.common;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 孟庆合 on 2018/12/3.
 */
public class GetAge2 {
    public double getAgeByCardId1(String card) throws Exception {
        String birthDate = card.substring(6, 14);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date date = sdf.parse(birthDate);
        Date d=new Date();
        Long sss=(d.getTime() -date.getTime() )/ 1000;
        double l = (double) sss / (3600 * 24  * 365 );
        l = (double) Math.round(l * 100) / 100;
        return l;
    }
}
