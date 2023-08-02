package com.example.myAddharBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.myAddharBackend.model.Login;


@Repository
public interface LoginRepository extends JpaRepository<Login, String> {

	@Query("select l from Login l where l.id = :id")
	public java.util.List<Login> userById(@Param("id") int id);
	
	

}
