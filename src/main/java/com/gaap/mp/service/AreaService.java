package com.gaap.mp.service;

import com.gaap.mp.models.Area;
import com.gaap.mp.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AreaService {
    @Autowired
    AreaRepository areaRepository;

    public Area createArea(Area area){
        areaRepository.save(area);
        return area;
    }
    List<Area> listArea = new ArrayList<>();
    public List<Area> getListAreas(){
        return areaRepository.findAll();
    }
}
