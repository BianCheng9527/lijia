package com.seaboxdata.hlbejk.service.modules.dao;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.seaboxdata.hlbejk.api.vo.TodosVO;
import com.seaboxdata.hlbejk.service.modules.entity.Todos;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Map;

/**
 * 待办事项
 * 
 * @author zdl
 * @email 492587402@qq.com
 * @date 2020-09-16 10:21:25
 */
@Repository
@Mapper
public interface TodosDao extends BaseMapper<Todos> {

    List<TodosVO> getTodosList(@Param("param") Map param);
}
