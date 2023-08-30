package com.apps.pms.repository;


import com.apps.pms.model.Trip;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.List;


@Component
public class TripRepository extends SimpleJpaRepository<Trip, String> {
    private final EntityManager em;
    public TripRepository(EntityManager em) {
        super(Trip.class, em);
        this.em = em;
    }
    @Override
    public List<Trip> findAll() {
        return em.createNativeQuery("Select * from \"pms\".\"Trip\"", Trip.class).getResultList();
    }
}