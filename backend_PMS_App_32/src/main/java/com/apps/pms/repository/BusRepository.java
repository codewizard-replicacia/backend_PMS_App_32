package com.apps.pms.repository;


import com.apps.pms.model.Bus;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class BusRepository extends SimpleJpaRepository<Bus, String> {
    private final EntityManager em;
    public BusRepository(EntityManager em) {
        super(Bus.class, em);
        this.em = em;
    }
    @Override
    public List<Bus> findAll() {
        return em.createNativeQuery("Select * from \"pms\".\"Bus\"", Bus.class).getResultList();
    }
}