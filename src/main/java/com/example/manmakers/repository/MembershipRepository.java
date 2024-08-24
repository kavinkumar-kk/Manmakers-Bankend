package com.example.manmakers.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.manmakers.entity.membership;

@Repository
public interface MembershipRepository extends JpaRepository<membership, Integer> {

    
} 