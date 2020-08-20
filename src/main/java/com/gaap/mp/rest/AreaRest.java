package com.gaap.mp.rest;

import com.gaap.mp.models.Area;
import com.gaap.mp.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("areas")
public class AreaRest {
    @Autowired
    AreaService areaService;
    @GetMapping("listAreas")
    public ResponseEntity<List<Area>> getAreas(){
        return new ResponseEntity(areaService.getListAreas(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Area> createArea(@RequestBody Area area){
        area = areaService.createArea(area);
        return new ResponseEntity<Area>(area, HttpStatus.OK);
    }


}
