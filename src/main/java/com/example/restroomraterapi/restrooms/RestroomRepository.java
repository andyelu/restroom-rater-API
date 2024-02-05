package com.example.restroomraterapi.restrooms;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestroomRepository extends JpaRepository<Restroom, String> {

}
