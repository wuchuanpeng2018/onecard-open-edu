package com.open.design.moban;

public class ConcreteTemplate extends AbstractTemplate{
    /**
     * 基本方法的声明（由子类实现）
     */
    @Override
    protected void abstractMethod() {
        System.out.println("ConcreteTemplate-abstractMethod ");
    }
}
