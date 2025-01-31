package com.example.authservice.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@MappedSuperclass
@Getter
@Setter

public class BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    Date createdDate;
}
