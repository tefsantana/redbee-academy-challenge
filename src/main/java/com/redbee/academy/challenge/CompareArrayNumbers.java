package com.redbee.academy.challenge;

import java.util.List;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static List<Integer> max(List<Integer> a, List<Integer> b) {
   List<Integer> lista_nueva = new ArrayList<Integer>();
   for(int i=0; i < b.size(); i++) {
     if (a.get(i) > b.get(i)) {
       lista_nueva.add(i, a.get(i));
     }
     else if (b.get(i) > a.get(i)) {
       lista_nueva.add(i, b.get(i));
     }
   }
   return lista_nueva;
 }
}

