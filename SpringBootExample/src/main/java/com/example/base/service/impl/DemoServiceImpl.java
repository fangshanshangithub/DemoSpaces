/**
 * @author FangSS(fangshanshan @ artron.net)
 * <p>
 * CreatAt: 2018/8/28 Time: 上午11:47
 * <p>
 * Copyright (c) 2000-2018. http://www.artron.net. All rights reserved.
 * <p>
 * Use of this source code is governed a license that can be found in the LICENSE file.
 */
package com.example.base.service.impl;

import com.example.base.dao.SnapshotEntityMapper;
import com.example.base.entity.SnapshotEntity;
import com.example.base.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private SnapshotEntityMapper mapper;

    @Override
    public SnapshotEntity findByID(Integer id) {
        return mapper.findSnapshotEntityById(id);
    }
}
