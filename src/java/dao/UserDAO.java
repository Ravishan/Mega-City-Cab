/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.HashMap;

public class UserDAO {
    private static HashMap<String, String> users = new HashMap<>();
    
    static {
        users.put("admin", "password123");
    }
    
    public static boolean validate(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}

