package org.liuming.webapp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.liuming.webapp.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.List;
//@Service // Service层使用的
//@Controller // Controller 层使用的

@Mapper // 表示这是一个MyBatis的Mapper
@Repository  // dao层使用的
public interface DepartmentMapper {

    // @Select("sql") 注解版配置
    // 获取所有的部门信息
    List<Department> getDepartments();

    // 通过id获取部门信息
    Department getDepartment(Integer id);

}
