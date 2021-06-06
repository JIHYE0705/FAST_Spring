package com.fastcampust.javaallinone.project3.mycontect.repository;

import com.fastcampust.javaallinone.project3.mycontect.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface PersonRepository extends JpaRepository<Person, Long> {

}
