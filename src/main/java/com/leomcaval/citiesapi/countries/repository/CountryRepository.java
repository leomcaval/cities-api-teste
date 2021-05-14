package com.leomcaval.citiesapi.countries.repository;

import com.leomcaval.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
