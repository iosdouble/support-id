package com.baidu.fsg.uid;

import com.baidu.fsg.uid.exception.UidGenerateException;

/**
 * @Classname UidGenerator
 * @Description TODO
 * @Date 2020/1/15 4:45 PM
 * @Created by nihui
 */
public interface UidGenerator {

    long getUID() throws UidGenerateException;

    String parseUID(long uid);
}
