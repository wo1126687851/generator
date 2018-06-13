package com.xlkh.report.mapper;

import com.xlkh.report.pojo.SysRoleFunction;
import com.xlkh.report.pojo.SysRoleFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysRoleFunctionMapper {
    int countByExample(SysRoleFunctionExample example);

    int deleteByExample(SysRoleFunctionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysRoleFunction record);

    int insertSelective(SysRoleFunction record);

    List<SysRoleFunction> selectByExample(SysRoleFunctionExample example);

    SysRoleFunction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysRoleFunction record, @Param("example") SysRoleFunctionExample example);

    int updateByExample(@Param("record") SysRoleFunction record, @Param("example") SysRoleFunctionExample example);

    int updateByPrimaryKeySelective(SysRoleFunction record);

    int updateByPrimaryKey(SysRoleFunction record);
}