/**
 * Botaoyx.com Inc.
 * Copyright (c) 2021-2022 All Rights Reserved.
 */
package test.gen;

import java.util.Arrays;

import com.bt.rpc.util.JsonUtils;
import com.btyx.test.dto.Img;

/**
 *
 * @author Martin.C
 * @version 2022/01/11 5:47 PM
 */
public class TestBytes {

    public static void main(String[] args) {

        var json = "{\"name\":\"123\",\"img\":[1,2,3,4]}";

        var img = JsonUtils.parse(json, Img.class);
        System.out.println(
                Arrays.toString(img.getImg())
        );
    }

}