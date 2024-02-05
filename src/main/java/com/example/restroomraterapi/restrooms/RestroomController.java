package com.example.restroomraterapi.restrooms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/restroom")
public class RestroomController {

    private final RestroomService restroomService;

    @Autowired
    public RestroomController(RestroomService restroomService) {
        this.restroomService = restroomService;
    }

    @GetMapping
    public List<Restroom> getRestrooms() {
        return restroomService.getRestrooms();
    }

    @DeleteMapping(path = "delete/{name}")
    public void deleteRestroom(@PathVariable("name") String name) {
        restroomService.deleteRestroom(name);
    }

    @PutMapping(path = "{name}")
    public void editLocation(@PathVariable("name") String name, @RequestParam(required = false) String address) {
        restroomService.editLocation(name, address);
    }

    @GetMapping("search")
    public String getRestroomAddress(@RequestParam(name = "name") String restroomName) {
        return restroomService.getRestroomAddress(restroomName);
    }

}
