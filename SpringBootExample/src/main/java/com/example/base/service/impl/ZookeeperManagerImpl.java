/**
 * @author FangSS(fangshanshan @ artron.net)
 * <p>
 * CreatAt: 2018/8/28 Time: 下午2:14
 * <p>
 * Copyright (c) 2000-2018. http://www.artron.net. All rights reserved.
 * <p>
 * Use of this source code is governed a license that can be found in the LICENSE file.
 */
package com.example.base.service.impl;

import com.example.base.service.ZookeeperManager;
import com.example.base.utils.ZKUtil;
import org.I0Itec.zkclient.ZkClient;
import org.springframework.stereotype.Service;

@Service
public class ZookeeperManagerImpl implements ZookeeperManager {

    private String wxDate;

    @Override
    public boolean init() {
        wxDate = "sssssssssss";
        syncDateToZKs();

        return false;
    }

    @Override
    public boolean updateZKDate() {
        wxDate = "TTTTTTTTTTTT";
        syncDateToZKs();

        return false;
    }

    @Override
    public boolean syncDateToZKs() {
        ZkClient zk = new ZKUtil().getZkClient();
        if (!zk.exists(ZKUtil.REDIS_WEIXIN_DATA)) {
            zk.createPersistent(ZKUtil.REDIS_WEIXIN_DATA, true);
        }
        zk.writeData(ZKUtil.REDIS_WEIXIN_DATA, wxDate);
        zk.close();
        return  true;
    }
}
