package org.salim.tutos;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {

        List<Object> keys = java.lang.System.getProperties().keySet().stream().sorted(Comparator.comparing(Object::toString)).collect(Collectors.toList());
        Iterator<Object> iterKeys = keys.iterator();

        Object o;

        for (int i = 0; i < keys.size(); i++) {
            o = iterKeys.next();
            System.out.println(o + " -- " + java.lang.System.getProperties().get(o) + "\n");
        }

    }
}
