package com.workintech.developers;

public class HRManager extends Employee{
    private String[] JuniorDeveloper;
    private String[] MidDeveloper;
    private String[] SeniorDeveloper;


    public HRManager(int id, String name, double salary){
        super(id,name,salary);
    }

    @Override
    public void work() {
        System.out.println("HRManager sınıfı");
        super.setSalary(3500);
    }

}
