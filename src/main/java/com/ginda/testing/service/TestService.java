package com.ginda.testing.service;

import com.ginda.testing.dto.TestDto;
import com.ginda.testing.model.TestingGinda;
import com.ginda.testing.model.TestingGindaDetail;
import com.ginda.testing.repository.TestingGindaRepository;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    private final TestingGindaRepository repository;

    public TestService(TestingGindaRepository repository) {
        this.repository = repository;
    }

    public void writeData(TestDto dto) {
        TestingGinda testingGinda= new TestingGinda();
        testingGinda.setName(dto.getName());

        TestingGindaDetail testingGindaDetail = new TestingGindaDetail();
        testingGindaDetail.setDetails(dto.getDetails());
        testingGinda.setDetail(testingGindaDetail);
        testingGindaDetail.setTestingGinda(testingGinda);
        repository.save(testingGinda);
    }

}
