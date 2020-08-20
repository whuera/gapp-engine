package com.gaap.mp.service;

import com.gaap.mp.models.Area;
import com.gaap.mp.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Area service.
 */
@Service
public class AreaService {
    /**
     * The Area repository.
     */
    @Autowired
    AreaRepository areaRepository;

    /**
     * Create area area.
     *
     * @param area the area
     * @return the area
     */
    public Area createArea(Area area){
        areaRepository.save(area);
        return area;
    }

    /**
     * The List area.
     */
    List<Area> listArea = new ArrayList<>();

    /**
     * Get list areas list.
     *
     * @return the list
     */
    public List<Area> getListAreas(){
        return areaRepository.findAll();
    }
}
