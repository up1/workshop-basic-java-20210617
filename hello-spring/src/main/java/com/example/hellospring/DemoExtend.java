package com.example.hellospring;

public class DemoExtend {
    public static void main(String[] args) {
        Report1 report1 = new Report1();
        report1.build();
    }
}

interface Process {
    void generateHeader();
    void generateBody();
    void generateFooter();
}

class Report2 implements  Process {
    @Override
    public void generateHeader() {
    }

    @Override
    public void generateBody() {
    }

    @Override
    public void generateFooter() {
    }
}

abstract class Report {
    abstract void generateHeader();
    abstract void generateBody();
    abstract void generateFooter();
    public void build() {
        generateHeader();
        generateBody();
        generateFooter();
    }
}

class Report1 extends Report {
    @Override
    void generateHeader() {
        System.out.println("Generate Header");
    }

    @Override
    void generateBody() {
        System.out.println("Generate Body");
    }

    @Override
    void generateFooter() {
        System.out.println("Generate Footer");
    }
}





