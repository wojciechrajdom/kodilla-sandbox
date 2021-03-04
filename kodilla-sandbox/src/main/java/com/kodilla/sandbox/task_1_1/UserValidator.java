package com.kodilla.sandbox.task_1_1;

public class UserValidator {
    public boolean validateAge(double age) {

        if (age > 30) {
            System.out.println("User is average age");
            return true;
        } else {
            System.out.println("User is young");
            return false;
        }
    }
    public void validateHeight(double height) {
        if (height > 160) {
            System.out.println("User is height person");
        } else if (height < 160) {
            System.out.println("User is short person");

        }
    }
}


