package org.salim.tutos;

import java.util.ResourceBundle;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main(String[] args){
        ResourceBundle configProp = ResourceBundle.getBundle("config");
        ResourceBundle filtersProp = ResourceBundle.getBundle("filters");

        System.out.println("Env : " + configProp.getString("aaa"));
        System.out.println("Version : " + filtersProp.getString("org.salim.tutos.version"));
        System.out.println("Name : " + filtersProp.getString("org.salim.tutos.name"));
        System.out.println("ArtifactId : " + filtersProp.getString("org.salim.tutos.artId"));
        System.out.println("GroupId : " + filtersProp.getString("org.salim.tutos.grpId"));
    }
}
