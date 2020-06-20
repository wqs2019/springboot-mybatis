package com.wuqingshi.springboot.mapper;

import com.wuqingshi.springboot.bean.Department;
import org.apache.ibatis.annotations.*;

//@Mapper
public interface DepartmentMapper {
    /**
     * 根据ID查询
     */
    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Delete("delete from department where id=#{id}")
    public Department deleteDeptById(Integer id);

    //返回id
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateDept(Department department);
}
