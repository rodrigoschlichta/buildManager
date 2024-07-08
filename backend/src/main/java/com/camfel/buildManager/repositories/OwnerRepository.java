package com.camfel.buildManager.repositories;

import com.camfel.buildManager.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner,Long> {
}
