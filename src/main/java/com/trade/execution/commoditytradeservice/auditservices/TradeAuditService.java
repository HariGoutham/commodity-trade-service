package com.trade.execution.commoditytradeservice.auditservices;

import com.trade.execution.commoditytradeservice.model.Trade;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.envers.AuditReader;
import org.hibernate.envers.AuditReaderFactory;
import org.hibernate.envers.query.AuditEntity;
import org.hibernate.envers.query.AuditQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TradeAuditService {

    @Autowired
    private EntityManager entityManager;

    public List<Object[]> getAuditLogs(Long tradeId) {
        Session session = entityManager.unwrap(Session.class);
        AuditReader auditReader = AuditReaderFactory.get(session);

        AuditQuery query = auditReader.createQuery()
                .forRevisionsOfEntity(Trade.class, false, true)
                .add(AuditEntity.id().eq(tradeId));
        return query.getResultList();
    }
}
