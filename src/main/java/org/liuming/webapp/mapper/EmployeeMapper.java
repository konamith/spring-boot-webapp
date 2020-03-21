package org.liuming.webapp.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.liuming.webapp.pojo.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper {
    // 获取全部的员工信息
    List<Employee> getEmployees();

    // 新增一个员工信息
    int save(Employee employee);

    // 通过id获取员工
    Employee get(Integer id);

    // 通过id删除员工
    int delete(Integer id);
}
