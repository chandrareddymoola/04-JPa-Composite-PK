package com.chandra.service;

import com.chandra.entities.Person;
import com.chandra.entities.PersonPK;
import com.chandra.repository.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {
    @Autowired
    private PersonRepo personRepo;

      public void savePerson(){
          PersonPK pk=new PersonPK();
          pk.setPassport("BVP1245623");
          pk.setAadhar(1234569874456L);

          Person p=new Person();
          p.setEmail("chandra@gmail.com");
          p.setName("Moola chandra Mohan reddy");

          p.setPersonPK(pk);
          personRepo.save(p);

          }

          public void getperson(){
              PersonPK pk=new PersonPK();
              pk.setPassport("BVP1245623");
              pk.setAadhar(1234569874456L);
           Optional<Person> findById= personRepo.findById(pk);
           if(findById.isPresent()){
               System.out.println(findById.get());
           }

          }
      }

