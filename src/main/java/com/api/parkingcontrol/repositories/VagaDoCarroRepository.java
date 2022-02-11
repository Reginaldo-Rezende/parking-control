package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.VagaDoCarroModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface VagaDoCarroRepository extends JpaRepository<VagaDoCarroModel, UUID> {


}
