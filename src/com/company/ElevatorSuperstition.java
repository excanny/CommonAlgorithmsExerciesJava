package com.company;

public class ElevatorSuperstition {
    public int GetLuckyNumbers(int n){

        String stringValue = String.valueOf(n);
        if(stringValue.contains("4") || stringValue.contains("13")){

            var newValue = stringValue;
            int newNumber = Integer.parseInt(newValue);
            var luckyNumber = newNumber + 1;
            var verifiedLuckyNumber = GetLuckyNumbers(luckyNumber);
            return verifiedLuckyNumber;

        }

        return n;
    }
}
