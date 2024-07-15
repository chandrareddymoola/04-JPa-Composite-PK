package com.chandra.repository;

import com.chandra.entities.Person;
import com.chandra.entities.PersonPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<Person, PersonPK> {

}
