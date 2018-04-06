package com.alex.hellodb.repository;

import com.alex.hellodb.model.Task;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface TaskRepository extends PagingAndSortingRepository<Task, Long>{

    List<Task> findAllByOrderByUrgentDesc();

}
