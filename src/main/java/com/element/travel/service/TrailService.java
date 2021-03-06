package com.element.travel.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.element.travel.model.Trail;
import com.element.travel.repository.TrailRepository;


@Service
//@Transactional
public class TrailService {
	private static final Logger LOGGER = LoggerFactory.getLogger(TrailService.class);
	
    private TrailRepository trailRepository;
	
	@Autowired
    public TrailService(TrailRepository trailRepository) {
        this.trailRepository = trailRepository;
    }
	
	//for initial loading data
	public List<Trail> saveAll(List<Trail> trails) {
		return trailRepository.saveAll(trails);
	}

	public Trail saveTrail(Trail trail) {
		return trailRepository.save(trail);
	}

	public List<Trail> findAllTrails() {
        return trailRepository.findAll();
    }

    public Optional<Trail> findTrailById(Long id) {
        return trailRepository.findById(id);
    }

}
