/**
 * BestULearn.com Inc.
 * Copyright (c) 2021-2021 All Rights Reserved.
 */
package com.bt.rpc.serial;

import java.lang.reflect.ParameterizedType;

import com.bt.rpc.internal.InputProto;
import com.bt.rpc.internal.OutputProto;

/**
 *
 * @author martin.cong
 * @version 2021-10-17 13:01
 */
public interface Serial  extends ServerSerial{

    void writeInput(Object[] args, InputProto.Builder builder);


    <T> T readOutput(OutputProto proto , Class<T> type) ;

    <T> T readOutput(OutputProto proto , ParameterizedType type) ;


    // server side
    //
    //<T> T  readInput(InputProto proto, Class<T> type);
    //
    //void writeOutput(Object obj, OutputProto.Builder out);


    class Instance{
        static final   Serial JSON =  new JsonSerial();
        private static Serial instance = JSON;
        public static Serial get(){
            return instance;
        }
        public static void set(Serial ins){
            instance = ins;
        }
    }

}