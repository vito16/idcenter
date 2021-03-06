/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2017-11-25 17:35 创建
 */
package org.antframework.idcenter.dal.dao;

import org.antframework.idcenter.dal.entity.Producer;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.repository.RepositoryDefinition;

import javax.persistence.LockModeType;
import java.util.List;

/**
 * id生产者dao
 */
@RepositoryDefinition(domainClass = Producer.class, idClass = Long.class)
public interface ProducerDao {

    void save(Producer producer);

    void delete(Producer producer);

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    List<Producer> findLockByIdCodeOrderByIndexAsc(String idCode);

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    Producer findLockByIdCodeAndIndex(String idCode, Integer index);

    List<Producer> findByIdCodeOrderByIndexAsc(String idCode);
}
