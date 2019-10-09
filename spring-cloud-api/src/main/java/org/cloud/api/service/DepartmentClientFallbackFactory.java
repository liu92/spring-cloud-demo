package org.cloud.api.service;

import feign.hystrix.FallbackFactory;
import org.cloud.api.po.Department;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName: DepartmentClientFallbackFactory
 * @Description:
 * @Author: lin
 * @Date: 2019/10/5 11:50
 * History:
 * @<version> 1.0
 *  @Component  注解一定不要忘记添加
 */
@Component
public class DepartmentClientFallbackFactory implements FallbackFactory<DepartmentClientService> {

    @Override
    public DepartmentClientService create(Throwable throwable) {

        return new DepartmentClientService() {
            @Override
            public Department findById(int id) {
                return new Department()
                          .setId(id)
                          .setDepartmentName("该ID："+id+"没有对应的信息, Consumer客户端提供的降级信息, 此刻服务Provider已经关闭");
            }

            @Override
            public Boolean add(Department department) {
                return null;
            }

            @Override
            public List<Department> findAll() {
                return null;
            }
        };
    }
}
