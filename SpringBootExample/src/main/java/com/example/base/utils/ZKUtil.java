/**
 * @author FangSS(fangshanshan @ artron.net)
 * <p>
 * CreatAt: 2018/8/28 Time: 下午2:20
 * <p>
 * Copyright (c) 2000-2018. http://www.artron.net. All rights reserved.
 * <p>
 * Use of this source code is governed a license that can be found in the LICENSE file.
 */
package com.example.base.utils;

import org.I0Itec.zkclient.ZkClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ZKUtil {
    private final Logger logger = LoggerFactory.getLogger(getClass());


    @Value("zookeeper.local")
    public String zkAddrs;

    public static final String REDIS_WEIXIN_DATA = "/RedisWXData";

    public ZkClient getZkClient() {
        logger.debug("######zookeeper.local: {}", zkAddrs);
        return new ZkClient("127.0.0.1:2181,172.16.241.130:2181,");
    }
}
