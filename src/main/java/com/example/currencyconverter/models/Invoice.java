package com.example.currencyconverter.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "faktura")
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToMany(targetEntity = ComputerPurchase.class)
    List<ComputerPurchase> purchasedComputers;

    public Invoice() {
    }

    public Invoice(List<ComputerPurchase> purchasedComputers) {
        this.purchasedComputers = purchasedComputers;
    }
}
