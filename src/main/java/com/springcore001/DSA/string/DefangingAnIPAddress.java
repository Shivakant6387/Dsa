package com.springcore001.DSA.string;

public class DefangingAnIPAddress {
    public static void main(String[] args) {
        String ip = "1.1.1.1";
        System.out.println(defangIPaddr(ip));
    }

    public static String defangIPaddr(String address) {
        String ip = address.replace(".", "[.]");
        return ip;
    }
}
