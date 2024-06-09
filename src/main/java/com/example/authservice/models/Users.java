package com.example.authservice.models;

import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;

import java.util.List;
@Getter
@Setter
public class Users extends BaseModel{
    String name;
    String email;
    String password;


    @ManyToMany(fetch = FetchType.EAGER)
    List<Role> roles;

}
