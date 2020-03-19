package com.example.Hibernate2Assignment.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
//@Table(name = "card")
@Table(name = "CreditCardTablePerClass")
public class CreditCardTablePerClass extends PaymentTablePerClass {
    private String cardNumber;

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
