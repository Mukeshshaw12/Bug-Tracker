package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Project;

public interface ProjectRepository extends CrudRepository<Project,Integer> {

}
