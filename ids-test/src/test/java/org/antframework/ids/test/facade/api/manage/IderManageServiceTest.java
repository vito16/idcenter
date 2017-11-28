/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2017-11-22 23:20 创建
 */
package org.antframework.ids.test.facade.api.manage;

import org.antframework.ids.facade.api.manage.IderManageService;
import org.antframework.ids.facade.enums.PeriodType;
import org.antframework.ids.facade.order.*;
import org.antframework.ids.facade.result.*;
import org.antframework.ids.test.AbstractTest;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * id提供者管理服务单元测试
 */
@Ignore
public class IderManageServiceTest extends AbstractTest {
    @Autowired
    private IderManageService iderManageService;

    @Test
    public void testAddOrModifyIder() {
        AddOrModifyIderOrder order = new AddOrModifyIderOrder();
        order.setIdCode("oid");
        order.setPeriodType(PeriodType.HOUR);
        order.setMaxId(9000000000L);

        AddOrModifyIderResult result = iderManageService.addOrModifyIder(order);
        assertSuccess(result);
    }

    @Test
    public void testModifyIderProducerNumber() {
        ModifyIderProducerNumberOrder order = new ModifyIderProducerNumberOrder();
        order.setIdCode("oid");
        order.setNewProducerNumber(4);

        ModifyIderProducerNumberResult result = iderManageService.modifyIderProducerNumber(order);
        assertSuccess(result);
    }

    @Test
    public void testModifyIderCurrent() {
        ModifyIderCurrentOrder order = new ModifyIderCurrentOrder();
        order.setIdCode("oid");
        order.setNewCurrentPeriod(new Date());
        order.setNewCurrentId(100);

        ModifyIderCurrentResult result = iderManageService.modifyIderCurrent(order);
        assertSuccess(result);
    }

    @Test
    public void testDeleteIder() {
        DeleteIderOrder order = new DeleteIderOrder();
        order.setIdCode("oid");

        DeleteIderResult result = iderManageService.deleteIder(order);
        assertSuccess(result);
    }

    @Test
    public void testQueryIder() {
        QueryIderOrder order = new QueryIderOrder();
        order.setPageNo(1);
        order.setPageSize(10);
        order.setIdCode("o");

        QueryIderResult result = iderManageService.queryIder(order);
        assertSuccess(result);
    }
}
