package com.example.authservice.models;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum SessionStatus{

    active,
    expired,
    logged_out,
    banned
}
