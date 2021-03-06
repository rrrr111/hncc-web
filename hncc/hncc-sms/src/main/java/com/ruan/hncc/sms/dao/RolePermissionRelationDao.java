package com.ruan.hncc.sms.dao;

import com.ruan.hncc.sms.entity.RolePermissionRelation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 员工角色与权限关系表
 *
 * @author ruanteng
 * Date 2021-02-27 00:29:54
 * Copyright (C) hlhs
 */
@Mapper
public interface RolePermissionRelationDao extends BaseMapper<RolePermissionRelation> {
	
}
