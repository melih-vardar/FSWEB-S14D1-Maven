package com.workintech.developers;

public class HRManager extends Employee {

    private String[] JuniorDeveloper = new String[10];
    private String[] MidDeveloper = new String[10];
    private String[] SeniorDeveloper = new String[10];

    public HRManager(int id, String name, int salary) {
        super(id, name, salary);
    }

    public void addEmployee(String category, String developerName) {
        String[] targetArray;

        switch (category.toLowerCase()) {
            case "junior":
                targetArray = JuniorDeveloper;
                break;
            case "mid":
                targetArray = MidDeveloper;
                break;
            case "senior":
                targetArray = SeniorDeveloper;
                break;
            default:
                System.out.println("Invalid category: " + category);
                return;
        }

        for (int i = 0; i < targetArray.length; i++) {
            if (targetArray[i] == null) {
                targetArray[i] = developerName;
                return;
            }
        }
    }

    @Override
    public void work() {
        System.out.println("HRManager starts working.");
        setSalary(5000);
    }
}
