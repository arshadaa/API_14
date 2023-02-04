package com.abc.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.binding.CitizenAppBinding;
import com.abc.entity.CitizenAppEntity;

@Repository
public interface CitizenAppRepo extends JpaRepository<CitizenAppEntity, Serializable> {

	
}
