package com.company;

import com.company.LimitException;

import java.text.BreakIterator;

public class BankAccount {
    private int amount;

    public int getAmount() {
        return amount;
    }
    public String deposit(int sum) {
        amount = +sum;
        return "Ваш баланс составляет: " + sum;
    }

    public String withDraw(int sum) throws LimitException {
        if (sum >= amount) {
            throw new LimitException("Было потраченно средств : " +  amount , (double) amount) ;
        }
        amount = amount - sum;
        return "Успешно. Вы вывели на сумму 6000. остаток: " + amount;

    }

}