package org.examlpe.testproject.store;

import org.examlpe.testproject.domain.Number;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PhoneLibraryRepository extends JpaRepository<Number, String> {
    Optional<Number> findByName(String name);
}
