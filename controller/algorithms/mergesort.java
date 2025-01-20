/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Footwise.controller.algorithms;

import Footwise.view.Informationpage.Shoe;
import java.util.ArrayList;
import java.util.List;

/*
 * LMU ID: 23048665
 * Name: Devanshi Baishya
 */
public class mergesort {
        public List<Shoe> sortBySerialNumber(List<Shoe> unsortedData, boolean isDesc) {
        if (unsortedData.size() <= 1) {
            return unsortedData;
        }

        int mid = unsortedData.size() / 2;
        List<Shoe> left = sortBySerialNumber(unsortedData.subList(0, mid), isDesc);
        List<Shoe> right = sortBySerialNumber(unsortedData.subList(mid, unsortedData.size()), isDesc);

        return merge(left, right, isDesc);
    }

    private List<Shoe> merge(List<Shoe> left, List<Shoe> right, boolean isDesc) {
        List<Shoe> merged = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (isDesc) {
                if (left.get(i).getSerialNumber() > right.get(j).getSerialNumber()) {
                    merged.add(left.get(i++));
                } else {
                    merged.add(right.get(j++));
                }
            } else {
                if (left.get(i).getSerialNumber() < right.get(j).getSerialNumber()) {
                    merged.add(left.get(i++));
                } else {
                    merged.add(right.get(j++));
                }
            }
        }

        while (i < left.size()) {
            merged.add(left.get(i++));
        }

        while (j < right.size()) {
            merged.add(right.get(j++));
        }

        return merged;
    }
}
