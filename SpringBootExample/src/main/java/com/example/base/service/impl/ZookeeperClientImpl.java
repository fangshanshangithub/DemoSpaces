/**
 * @author FangSS(fangshanshan @ artron.net)
 * <p>
 * CreatAt: 2018/8/28 Time: 下午2:33
 * <p>
 * Copyright (c) 2000-2018. http://www.artron.net. All rights reserved.
 * <p>
 * Use of this source code is governed a license that can be found in the LICENSE file.
 */
package com.example.base.service.impl;

import com.example.base.service.ZookeeperClient;
import com.example.base.utils.ZKUtil;
import org.I0Itec.zkclient.IZkDataListener;
import org.I0Itec.zkclient.ZkClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ZookeeperClientImpl implements ZookeeperClient {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private  String redisWXData;

    @Override
    public void getRedisWXData() {
        if(null == redisWXData) {
            ZkClient zkClient = new ZKUtil().getZkClient();
            redisWXData = zkClient.readData(ZKUtil.REDIS_WEIXIN_DATA);
            logger.info("zk子节点获取最新的redisWXData为{}" ,redisWXData);
            zkClient.subscribeDataChanges(ZKUtil.REDIS_WEIXIN_DATA, new IZkDataListener() {
                @Override
                public void handleDataChange(String s, Object o) throws Exception {
                    redisWXData = (String) o;
                }

                @Override
                public void handleDataDeleted(String s) throws Exception {
                    redisWXData = null;
                }
            });

        }

    }
}
