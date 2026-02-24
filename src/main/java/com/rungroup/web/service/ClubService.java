package com.rungroup.web.service;
import java.util.List;

import com.rungroup.web.models.Club;

public interface ClubService {
    List<Club> findAllClubs();
    Club save(Club club);
    Club getById(Long id);
}
