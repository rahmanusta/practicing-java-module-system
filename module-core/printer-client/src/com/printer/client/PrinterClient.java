package com.printer.client;

import com.printer.impl.Printer;

public class PrinterClient {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Hello world!");
    }
}