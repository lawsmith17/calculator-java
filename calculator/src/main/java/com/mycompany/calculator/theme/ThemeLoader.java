/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.theme;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.mycompany.calculator.theme.properties.Theme;
import com.mycompany.calculator.theme.properties.ThemeList;
import java.util.Map;

import java.io.File;
import java.io.IOException; 
import java.util.Collections;
/**
 *
 * @author User
 */
public class ThemeLoader {
    
    private ThemeLoader()
    {
        throw new AssertionError("Construcrtor is not allowed");
        
    }
    
    public static Map<String, Theme> loadThemes()
    {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        mapper.findAndRegisterModules();
        try
        {
         ThemeList themeList = mapper.readValue(new File("src/main/resources/application.yaml"), ThemeList.class);
        return themeList.getThemesAsMap();
        }catch(IOException e)
        {
            return Collections.emptyMap();
        }
    }
}
