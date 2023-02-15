package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.pojo.Data;

@Repository
public interface DataDao extends JpaRepository<Data, Integer> {

}
