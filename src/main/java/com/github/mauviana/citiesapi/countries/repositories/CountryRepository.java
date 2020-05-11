package com.github.mauviana.citiesapi.countries.repositories;

import com.github.mauviana.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
