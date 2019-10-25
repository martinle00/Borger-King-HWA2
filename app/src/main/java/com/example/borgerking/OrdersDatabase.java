package com.example.borgerking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class OrdersDatabase {
    public static Orders getOrdersByID(int orderID) {
        return orders.get(orderID);
    }

    public static ArrayList<Orders> getAllItems() {
        return new ArrayList<Orders>((List) Arrays.asList(orders.values().toArray()));
    }

    private static final HashMap<Integer, Orders> orders = new HashMap<>();
}