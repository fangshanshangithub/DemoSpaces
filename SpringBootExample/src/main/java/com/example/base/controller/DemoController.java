/**
 * @author FangSS(fangshanshan @ artron.net)
 * <p>
 * CreatAt: 2018/8/28 Time: 上午11:28
 * <p>
 * Copyright (c) 2000-2018. http://www.artron.net. All rights reserved.
 * <p>
 * Use of this source code is governed a license that can be found in the LICENSE file.
 */
package com.example.base.controller;

import com.example.base.entity.SnapshotEntity;
import com.example.base.service.DemoService;
import com.example.base.service.ZookeeperManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private final Logger logger = LoggerFactory.getLogger(getClass());


    @Autowired
    private DemoService demoservice;

    @Autowired
    private ZookeeperManager manager;


    @RequestMapping("/demo")
    public String demo() {

        manager.init();
        return "SUCCESS";
    }

    @RequestMapping("/test_{id}")
    public SnapshotEntity test(@PathVariable("id") Integer id) {
        logger.info("******* LOGGER ***********");
        manager.updateZKDate();
        return demoservice.findByID(id);
    }
}
