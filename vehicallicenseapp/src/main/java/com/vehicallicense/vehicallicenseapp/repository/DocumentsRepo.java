package com.vehicallicense.vehicallicenseapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicallicense.vehicallicenseapp.entity.Documents;

@Repository
public interface DocumentsRepo extends JpaRepository<Documents,Integer>{

}
