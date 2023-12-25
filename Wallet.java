package com.example.Backend.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name="Wallet_table")
public class Wallet {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy="wallet",cascade=CascadeType.ALL)
    private User user;
    private BigDecimal offlineBalance=BigDecimal.valueOf(0);
    private BigDecimal balance=BigDecimal.valueOf(0);
    public Long getId()
    {
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }
    public User getUser(){
        return user;
    }
    public void setUser(User user){
        this.user=user;
    }
    public BigDecimal getBalance(){
        return balance;
    }
    public void setBalance(BigDecimal balance)
    {
        this.balance=balance;
    }
    public BigDecimal getOfflineBalance()
    {
        return offlineBalance;
    }
    public void setOfflineBalance(BigDecimal offlineBalance)
    {
        this.offlineBalance=offlineBalance;
    }

}
