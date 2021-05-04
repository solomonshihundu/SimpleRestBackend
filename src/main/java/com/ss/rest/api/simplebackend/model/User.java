package com.ss.rest.api.simplebackend.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Table;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Table(name = "USER")
@DiscriminatorValue("USER")
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    @Column(name = "USERNAME",nullable = false,unique = true)
    private String username;

    @Column(name = "FIRST_NAME",nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME",nullable = false)
    private String lastName;

    @Column(name = "EMAIL",nullable = false,unique = true)
    private String email;

    @Column(name = "PASSWORD",nullable = false)
    private String password;

}
