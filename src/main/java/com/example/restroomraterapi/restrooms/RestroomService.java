package com.example.restroomraterapi.restrooms;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class RestroomService {

    private final RestroomRepository restroomRepository;

    @Autowired
    public RestroomService(RestroomRepository restroomRepository) {
        this.restroomRepository = restroomRepository;
    }

    public List<Restroom> getRestrooms() {
        return restroomRepository.findAll();
    }

    public void deleteRestroom(String name) {
        if (restroomRepository.existsById(name)) {
            restroomRepository.deleteById(name);
        } else {
            throw new IllegalStateException("restroom with name: " + name + " doesn't exist");
        }
    }

    @Transactional
    public void editLocation(String name, String address) {
        Restroom restroom = restroomRepository.findById(name)
                .orElseThrow( () -> new IllegalStateException("restroom with name: " + name + " doesn't exist"));

        if (address != null && !address.isEmpty() && !Objects.equals(restroom.getLocation(), address)) {
            restroom.setLocation(address);
        }
    }

    public String getRestroomAddress(String name) {
        Restroom restroom = restroomRepository.findById(name)
                .orElseThrow( () -> new IllegalStateException("restroom with name: " + name + " doesn't exist"));

        return restroom.getLocation();
    }
}
