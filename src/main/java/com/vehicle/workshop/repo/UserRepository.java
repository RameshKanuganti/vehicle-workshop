package com.vehicle.workshop.repo;

import com.vehicle.workshop.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Long> {

}