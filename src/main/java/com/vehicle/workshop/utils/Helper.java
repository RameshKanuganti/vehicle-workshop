package com.vehicle.workshop.utils;

import org.springframework.util.StringUtils;

import java.sql.Timestamp;
import java.util.Date;

public class Helper {

    public static Timestamp currentTimeStamp() {
        return new Timestamp(new Date().getTime());
    }

    public static long compareTwoTimeStamps(Timestamp createdDate) {
        long milliseconds1 = createdDate.getTime();
        long milliseconds2 = currentTimeStamp().getTime();

        long diff = milliseconds2 - milliseconds1;
        //long diffSeconds = diff / 1000;
        //long diffMinutes = diff / (60 * 1000);
        //long diffHours = diff / (60 * 60 * 1000);
        long diffDays = diff / (24 * 60 * 60 * 1000);

        return diffDays;
    }

    public static int compareTimestamp(Timestamp time1, Timestamp time2) {
        long l1 = time1.getTime();
        long l2 = time2.getTime();
        if (l2 > l1)
            return 1;
        else if (l1 > l2)
            return -1;
        else
            return 0;
    }

    public static Timestamp getTimestampFromLong(Long timeInLong) {
        if (StringUtils.isEmpty(timeInLong))
            return null;
        return new Timestamp(timeInLong);
    }

    public static Long getLongFromTimestamp(Timestamp timestamp) {
        if (StringUtils.isEmpty(timestamp))
            return null;
        return timestamp.getTime();

    }
}

