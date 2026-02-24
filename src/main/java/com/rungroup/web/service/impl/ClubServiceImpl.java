package com.rungroup.web.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rungroup.web.models.Club;
import com.rungroup.web.repository.ClubRepository;
import com.rungroup.web.service.ClubService;

@Service
public class ClubServiceImpl implements ClubService{
    private ClubRepository clubRepository;

    @Autowired
    public ClubServiceImpl(ClubRepository clubRepository){
        this.clubRepository = clubRepository;
    }

    @Override
    public List<Club> findAllClubs(){
        return clubRepository.findAll();
    }

    @Override
    public Club save(Club club){
        return clubRepository.save(club);
    }
}
