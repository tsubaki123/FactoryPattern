/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.msc;

import java.util.Scanner;

/**
 *
 * @author Kabi
 */
public class Cube extends MensurationCalculation {

    @Override
    public double calculate() {
        System.out.println("Enter  Length");
        setLength(input.nextDouble());
        return getLength() * getLength() * getLength();
    }

}
