/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2017-11-29 22:45 创建
 */
package org.antframework.idcenter.facade.result;

import org.antframework.common.util.facade.AbstractResult;
import org.antframework.idcenter.facade.vo.IdsInfo;

import java.util.List;

/**
 * 获取批量id-result
 */
public class AcquireIdsResult extends AbstractResult {
    // 获取到的批量id
    private List<IdsInfo> idses;

    public List<IdsInfo> getIdses() {
        return idses;
    }

    public void setIdses(List<IdsInfo> idses) {
        this.idses = idses;
    }
}
