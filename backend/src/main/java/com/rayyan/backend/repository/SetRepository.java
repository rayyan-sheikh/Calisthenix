package com.rayyan.backend.repository;

import com.rayyan.backend.entity.Set;
import com.rayyan.backend.entity.WorkoutExercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SetRepository extends JpaRepository<Set, Long> {
    List<Set> findByWorkoutExercise(WorkoutExercise workoutExercise);
}
