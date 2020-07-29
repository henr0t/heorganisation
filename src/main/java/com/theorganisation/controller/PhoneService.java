package com.theorganisation.controller;

import com.theorganisation.domain.Phone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PhoneService {

    @Autowired
    PhoneRepository pr;

    public Phone addPhone(Phone phone) {
        System.out.println("Called addPhone in PhoneService");
        return pr.save(phone);
    }

    public Iterable<Phone> getAllPhone() {
        System.out.println("Called getAllPhone from PhoneService");
        return pr.findAll();
    }

    public Phone getPhoneById(long id) {
        System.out.println("Called getPhoneById from PhoneService");
        return pr.findById(id).get();
    }


}
