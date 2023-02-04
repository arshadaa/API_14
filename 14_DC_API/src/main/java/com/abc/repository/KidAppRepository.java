package com.abc.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.binding.CitizenAppBinding;
import com.abc.entity.CitizenAppEntity;
import com.abc.entity.KidAppEntity;

@Repository
public interface KidAppRepository extends JpaRepository<KidAppEntity, Serializable> {

	
}
