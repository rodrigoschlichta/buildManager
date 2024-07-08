package com.camfel.buildManager.repositories;

import com.camfel.buildManager.entities.Tenant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TenantRepository extends JpaRepository <Tenant, Long> {
}
