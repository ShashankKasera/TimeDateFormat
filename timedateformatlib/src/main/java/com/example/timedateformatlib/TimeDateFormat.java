package com.example.timedateformatlib;

import android.util.Log;

public class TimeDateFormat {

    public static String timedateformat(int hour, int minute) {

        Log.i("thnkjrtk", "formwtTime: ");

        String Time="jhb";

        if (hour>=13){

            hour = hour-12;
            if (hour<10){

                String s = "0"+hour;
                if (minute<10){
                    String m = "0"+minute;
                    Time = s+":"+m+"PM";

                }else {
                    Time = s+":"+minute+"PM";
                }

            }else{

                if (minute<10){
                    String m = "0"+minute;
                    Time = hour+":"+m+"PM";

                }else {
                    Time = hour+":"+minute+"PM";
                }


            }


        }else {


            if (hour<10){

                String s;
                if(hour==0)
                    s = "12";
                else
                    s = "0"+hour;

                if (minute<10){
                    String m = "0"+minute;
                    Time = s+":"+m+"AM";
                }else {
                    Time = s+":"+minute+"AM";
                }

            }else{



                if (minute<10){
                    String m = "0"+minute;

                    if(hour==12)
                        Time = hour+":"+m+"PM";
                    else
                        Time = hour+":"+m+"AM";
                }else {
                    if(hour==12)
                        Time = hour+":"+minute+"PM";
                    else
                        Time = hour+":"+minute+"AM";
                }

            }

        }


        Log.i("fkjb", "formwtTime: "+Time);

        return Time;
    }
}
