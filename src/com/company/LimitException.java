package com.company;

public class LimitException extends Throwable {
   private String message;
   private Double remainingAmount;

    public LimitException(String message, Double remainingAmount) {
        this.message = message;
        this.remainingAmount = remainingAmount;

    }

  public Double getRemainingAmount() {
        return remainingAmount;



}
    }