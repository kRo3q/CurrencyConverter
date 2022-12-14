package com.example.currencyconverter.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "zakup_komputera")
public class ComputerPurchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "nazwa")
    String name;

    @Column(name = "data_zaksiegowania")
    LocalDate postDate;

    @Column(name = "koszt_USD")
    int costUSD;

    @Column(name = "koszt_PLN")
    int costPLN;

    public ComputerPurchase() {
    }

    public ComputerPurchase(String name, LocalDate postDate, int costUSD, int costPLN) {
        this.name = name;
        this.postDate = postDate;
        this.costUSD = costUSD;
        this.costPLN = costPLN;
    }

    @Override
    public String toString() {
        return "ComputerPurchase{" +
                "name='" + name + '\'' +
                ", postDate=" + postDate +
                ", costUSD=" + costUSD/100 +
                ", costPLN=" + costPLN/100 +
                '}';
    }
}
