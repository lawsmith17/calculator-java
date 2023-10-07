/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.theme.properties;
import java.awt.*;
import java.util.Optional;
/**
 *
 * @author User
 */
public class ColorUtil {
    private ColorUtil() {
        throw new AssertionError("Constructor is not allowed");
    }

    public static Color hex2Color(String colorHex) {
        return Optional.ofNullable(colorHex)
                .map(hex -> new Color(
                        Integer.valueOf(colorHex.substring(0, 2), 16),
                        Integer.valueOf(colorHex.substring(2, 4), 16),
                        Integer.valueOf(colorHex.substring(4, 6), 16)))
                .orElse(null);
    }
}
