package com.alevel.homework02;

public class ТumberModulus {
    public static void main(String[] args) {
        double firstNumber = 36.1;
        double secondNumber = 11.5;
        double thirdNumber = -45.3;
        double modOfFirstNumber = (firstNumber < 0) ? firstNumber * (-1) : firstNumber;
        double modOfSecondNumber = (secondNumber < 0) ? secondNumber * (-1) : secondNumber;
        double modOfThirdNumber = (thirdNumber < 0) ? thirdNumber * (-1) : thirdNumber;
        if(modOfFirstNumber > modOfSecondNumber && modOfFirstNumber > modOfThirdNumber){
            System.out.println(modOfFirstNumber);
        } else if (modOfSecondNumber > modOfFirstNumber && modOfSecondNumber > modOfThirdNumber){
            System.out.println(modOfSecondNumber);
        } else {
            System.out.println(modOfThirdNumber);
        }
    }
}
