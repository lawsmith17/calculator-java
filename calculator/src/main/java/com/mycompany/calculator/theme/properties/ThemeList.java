/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator.theme.properties;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
/**
 *
 * @author User
 */
public class ThemeList {
   private List<Theme> themes;
   
   public List<Theme> getThemes()
   {
       return themes;
   }
   
   public void setThemes(List<Theme> themes)
   {
       this.themes = themes;
   }
   
   public Map<String,Theme> getThemesAsMap()
   {
     return themes.stream().collect(Collectors.toMap(Theme::getName, Function.identity()));
   }
}
