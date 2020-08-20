package com.gaap.mp.rest;

import com.gaap.mp.models.Area;
import com.gaap.mp.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * The type Area rest.
 */
@RestController
@RequestMapping("areas")
public class AreaRest {
    /**
     * The Area service.
     */
    @Autowired
    AreaService areaService;

    /**
     * Get areas response entity.
     *
     * @return the response entity
     */
    @GetMapping("listAreas")
    public ResponseEntity<List<Area>> getAreas(){
        return new ResponseEntity(areaService.getListAreas(), HttpStatus.OK);
    }

    /**
     * Create area response entity.
     *
     * @param area the area
     * @return the response entity
     */
    @PostMapping
    public ResponseEntity<Area> createArea(@RequestBody Area area){
        area = areaService.createArea(area);
        return new ResponseEntity<Area>(area, HttpStatus.OK);
    }


}
