package com.kodilla.sandbox.task_1_1;

public class Application {
    public static void main(String[] args) {
        System.out.println("Starting...");
        String name = "Adam";
        double age = 40.5;
        double height = 178;

        UserValidator validator = new UserValidator();
        boolean isHigherThanThirty = validator.validateAge(age);

        if (isHigherThanThirty) {
            validator.validateHeight(height);
        }
        System.out.println("End of the program");
    }
}
