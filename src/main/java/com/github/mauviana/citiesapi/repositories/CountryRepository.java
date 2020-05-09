package com.github.mauviana.citiesapi.repositories;

import com.github.mauviana.citiesapi.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
