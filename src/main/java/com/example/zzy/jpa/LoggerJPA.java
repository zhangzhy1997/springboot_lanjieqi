package com.example.zzy.jpa;

import com.example.zzy.entity.LoggerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoggerJPA extends JpaRepository<LoggerEntity,Long>{

}
