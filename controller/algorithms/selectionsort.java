/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Footwise.controller.algorithms;

import java.util.ArrayList;
import java.util.List;
import Footwise.view.Informationpage.Shoe;

/*
 * LMU ID: 23048665
 * Name: Devanshi Baishya
 */
public class selectionsort {
       public List<Shoe> sortByShoeName(List<Shoe> unsortedData, boolean isDesc) {
        List<Shoe> dataToSort = new ArrayList<>();
        dataToSort.addAll(unsortedData);

        for (int i = 0; i < dataToSort.size() - 1; i++) {
            // Find the index of the minimum (or maximum) element
            int minIndex = i;
            for (int j = i + 1; j < dataToSort.size(); j++) {
                // Compare and assign based on alphabetical order
                if (isDesc) {
                    if (dataToSort.get(j).getName().compareToIgnoreCase(dataToSort.get(minIndex).getName()) > 0) {
                        minIndex = j;
                    }
                } else {
                    if (dataToSort.get(j).getName().compareToIgnoreCase(dataToSort.get(minIndex).getName()) < 0) {
                        minIndex = j;
                    }
                }
            }
            // Swap
            Shoe tempShoe = dataToSort.get(minIndex);
            dataToSort.set(minIndex, dataToSort.get(i));
            dataToSort.set(i, tempShoe);
        }
        return dataToSort;
    }
}
