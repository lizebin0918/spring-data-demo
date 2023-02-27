package com.lzb.domain;

import com.alibaba.fastjson.JSON;
import com.lzb.BaseIntegrationTest;
import com.lzb.infr.PersonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * <br/>
 * Created on : 2023-02-27 22:39
 * @author mac
 */
class PersonIntegrationTest extends BaseIntegrationTest {

    @Autowired
    private PersonRepository personRepository;

    @Test
    void test_save() {

        Person person = new Person();
        person.setName("lizebin");
        person.setAge(18);
        person = personRepository.save(person);

        long id = person.getId();
        Assertions.assertNotNull(id);
        System.out.println("-------------");
        System.out.println(id);

        System.out.println(JSON.toJSONString(personRepository.getReferenceById(id)));

    }

}
