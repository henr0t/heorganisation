package com.theorganisation.controller;

import com.theorganisation.domain.Phone;
import org.springframework.data.repository.CrudRepository;

public interface PhoneRepository extends CrudRepository<Phone,Long> {
}
