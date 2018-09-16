package com.czn.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setCupSize();
    }
}
