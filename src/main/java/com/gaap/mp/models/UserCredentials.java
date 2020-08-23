package com.gaap.mp.models;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Data
@ToString
@Entity
public class UserCredentials {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUserCredentials;
    private String login;
    private String passwd;
    @JoinColumn(name="credential_id_pk", unique = true)
    @OneToOne(cascade = CascadeType.ALL)
    private Employee employee;

    public UserCredentials() {
    }

}
