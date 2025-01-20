/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Footwise.controller.algorithms;

import Footwise.view.Informationpage.Shoe; 
import java.util.List;
/*
 * LMU ID: 23048665
 * Name: Devanshi Baishya
 */
public class ShoeBinarySearch {
        public Shoe searchByName(String searchValue, List<Shoe> shoeList, int left, int right) {
     
        if (right < left) {
            return null; 
        }

        
        int mid = (left + right) / 2;

 
        if (searchValue.compareToIgnoreCase(shoeList.get(mid).getName()) == 0) {
            return shoeList.get(mid);
        } else if (searchValue.compareToIgnoreCase(shoeList.get(mid).getName()) < 0) {
            return searchByName(searchValue, shoeList, left, mid - 1);
        } else {
            return searchByName(searchValue, shoeList, mid + 1, right);
        }
    }
}
