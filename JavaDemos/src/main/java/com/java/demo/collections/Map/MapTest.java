/**
 * @author FangSS(fangshanshan @ artron.net)
 * <p>
 * CreatAt: 2018/8/21 Time: 下午5:40
 * <p>
 * Copyright (c) 2000-2018. http://www.artron.net. All rights reserved.
 * <p>
 * Use of this source code is governed a license that can be found in the LICENSE file.
 */
package com.java.demo.collections.Map;

import com.java.demo.collections.hashs.HashMaps;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        int MAXIMUM_CAPACITY = 1 << 30;
        System.out.println("MapTest.main" + MAXIMUM_CAPACITY);

        map.put("22", "4324");
    }
}
