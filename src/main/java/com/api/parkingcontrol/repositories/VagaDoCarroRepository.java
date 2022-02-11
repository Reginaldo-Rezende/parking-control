package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.VagaDoCarroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VagaDoCarroRepository extends JpaRepository<VagaDoCarroModel, UUID> {


}
