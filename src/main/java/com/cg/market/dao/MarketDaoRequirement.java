package com.cg.market.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.market.entites.Requirement;

public interface MarketDaoRequirement extends JpaRepository<Requirement, Integer> {

}
