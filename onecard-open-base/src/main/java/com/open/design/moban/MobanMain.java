package com.open.design.moban;

public class MobanMain {

    public static void main(String[] args) {
        AbstractTemplate template = new ConcreteTemplate();
        template.templateMethod();
        AbstractTemplate template1 = new AbstractTemplate() {
            @Override
            protected void abstractMethod() {

            }
        };
        template1.templateMethod();
    }

}
