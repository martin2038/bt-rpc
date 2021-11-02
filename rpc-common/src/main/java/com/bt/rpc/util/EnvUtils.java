/**
 * Botaoyx.com Inc.
 * Copyright (c) 2021-2021 All Rights Reserved.
 */
package com.bt.rpc.util;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author Martin.C
 * @version 2021/10/11 10:05 AM
 */
public abstract class EnvUtils {


    public static String env(String key,String defaultValue){
        var value = System.getenv(key);
        if(StringUtils.isBlank(value)){
            value = defaultValue;
        }
        return value;
    }


    public static String hostName(){
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return "UnknownHostException";
    }
}