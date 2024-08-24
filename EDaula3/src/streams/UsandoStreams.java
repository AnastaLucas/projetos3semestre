/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author lucas.amsantos4
 */
public class UsandoStreams {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(2,3,5,1,2,23,4,9,10,23,444,12);
        
        numeros.stream().sorted().forEach(System.out::println);
    }
}
