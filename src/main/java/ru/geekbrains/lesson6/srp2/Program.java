package ru.geekbrains.lesson6.srp2;

public class Program {

    public static void main(String[] args) {

        OrderInput orderInput = new OrderInput();
        Order order = orderInput.inputFromConsole();

        OrderJsonSaver orderJsonSaver = new OrderJsonSaver();
        orderJsonSaver.saveToJson(order);
    }
}
