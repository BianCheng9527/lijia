package com.seaboxdata.hlbejk.service.modules.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.seaboxdata.hlbejk.service.modules.entity.Modelaccessinfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * 模型调用表
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-14 17:38:49
 */
@Repository
@Mapper
public interface ModelaccessinfoDao extends BaseMapper<Modelaccessinfo> {
	
}
