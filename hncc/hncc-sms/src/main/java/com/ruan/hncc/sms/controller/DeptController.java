package com.ruan.hncc.sms.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


import com.ruan.hncc.common.api.CommonPage;
import com.ruan.hncc.common.api.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import com.ruan.hncc.sms.entity.Dept;
import com.ruan.hncc.sms.service.DeptService;



/**
 * 科室表(done)
 *
 * @author ruanteng
 * Date 2021-02-27 00:29:54
 * Copyright (C) hlhs
 */
@RestController
@RequestMapping("sms/dept")
public class DeptController {
    @Resource
    private DeptService deptService;

    /**
     * 获得树状所有科室
     * @return
     */
    public CommonResult<List<Dept>> list() {
       List<Dept> list= deptService.listAll();
        return CommonResult.success(list);
    }


}
