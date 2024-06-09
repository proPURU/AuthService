package com.example.authservice.models;


import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
@Getter
@Setter
public class Session  extends  BaseModel{
    String token;
    Time time;
    SessionStatus sessionStatus;
}
