/*
 * @author Fang ShanShan (fangshanshan@artron.net)
 *
 * CreatAt: 2018/11/9 Time: 下午6:14
 *
 * Copyright (c) 2000-2018. http://www.artron.net. All rights reserved.
 *
 * Use of this source code is governed a license that can be found in the LICENSE file.
 *
 */

package com.design.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("index")
    public String index() {
        return "index";
    }

}
