/*
 * Copyright (C) 2020 Ramanpreet Matharu
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package mycalculator;

/**
 *
 * @author Ramanpreet Matharu
 * @version 1.0
 * @since Jan 14, 2020
 */
public class Calculator {

    private double mem;

    /**
     * The no-argument constructor assigns
     */
    public Calculator() {
    }

    /**
     * This method adds two given number.
     *
     * @param para1 first number
     * @param para2 Second number
     * @return The sum of two numbers
     */
    public double add(double para1, double para2) {
        mem = para1 + para2;
        return mem;

    }

    /**
     * This method subtracts two given number.
     * @param para1 first number
     * @param para2 Second number
     * @return      The difference between two numbers
     */
    public double subtract(double para1, double para2) {
        mem = para1 - para2;
        return mem;
    }
    /**
     * This method multiply two given numbers.
     * @param para1 first number
     * @param para2 Second number
     * @return  multiply the two numbers
     */

    public double multiply(double para1, double para2) {
        mem = para1 * para2;
        return mem;
    }
      /**
       * This method divide two given numbers.
       * @param para1 first number
       * @param para2 Second number
       * @return  divide the two given numbers.
       */
    public double divide(double para1, double para2) {
        mem = para1 / para2;
        return mem;
    }

}
