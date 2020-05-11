package com.github.mauviana.citiesapi.staties.repositories;

import com.github.mauviana.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}