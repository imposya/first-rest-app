package ru.imposya.firstrestapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.imposya.firstrestapp.models.Person;

public interface PeopleRepository extends JpaRepository<Person, Integer> {
}
