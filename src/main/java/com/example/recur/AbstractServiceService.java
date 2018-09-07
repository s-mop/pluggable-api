
package com.example.recur;

/**
 * 为抽象不同平台的Service操作做准备
 */
public abstract class AbstractServiceService extends AbstractPersistenceService<Service> {

    /**
     * 工单详情
     */
    public String getDetailById(Integer id) {
        Service service = new Service();
        return service.toString();
    }
}
