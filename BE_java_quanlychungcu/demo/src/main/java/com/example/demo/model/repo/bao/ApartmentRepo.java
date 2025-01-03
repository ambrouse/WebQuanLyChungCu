package com.example.demo.model.repo.bao;

import com.example.demo.model.entity.bao.ApartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ApartmentRepo extends JpaRepository<ApartmentEntity,String> {
    @Query(value = "select * " +
            "from apartment_ a " +
            "where delete_status_ = 1",nativeQuery = true)
    List<ApartmentEntity> findAllCustom();

}
