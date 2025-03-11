/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.hina.w06.Ex1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguye
 */
public class fractionList {

    private List<fraction> fracsList;

    public fractionList() {
        fracsList = new ArrayList<>();
    }

    public fractionList(List<fraction> fracsList) {
        this.fracsList = fracsList;
    }
    
    public void add(fraction ...fracs) {
        for (fraction frac : fracs) {
            fracsList.add(frac);
        }
    }
    
    public fraction getMax() {
        fraction max = null;
        for (fraction frac : fracsList) {
            max = (frac.compareTo(max) > 0)? max :frac;
        }
        return max;
    }
    
    public fraction sum() {
        fraction fracSum = new fraction();
        for (fraction frac : fracsList) {
            fracSum = fracSum.plus(frac);
        }
        
        return fracSum;
    }
    
    public int soKhongPhaiPhanSoNguyen() {
        int cnt = 0;
        for (fraction frac : fracsList) {
            if (!frac.isN()) {
                cnt++;
            }
        }
        
        return cnt;
    }

}
