/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package department;

import java.util.Scanner;
public class Department {

    private double[][] sales = new double[4][3];

    public Department() {
        for (int department = 0; department < sales.length; department++) {
            for (int month = 0; month < sales[0].length; month++) {                
                sales[department][month] = 0.0;
            }
        }
    }
    
    public double[][] getSales() {
    return sales;
    }


    public void populateArray() {
        Scanner input = new Scanner(System.in);
        for (int department = 0; department < sales.length; department++) {
            for (int month = 0; month < sales[0].length; month++) {
                System.out.print("Enter value for Department[" + (department + 1) + "] Month[" + (month + 1) + "]: ");
                sales[department][month] = input.nextDouble();
            }
        }
    }

    public void calculateAvgSalesPerMonth(double[][] array) {
        double[] avrgPerMonth = new double[sales[0].length];

        for (int month = 0; month < sales.length; month++) {
            double sum = 0;
            for (int department = 0; department < sales[0].length; department++) {
                sum += array[department][month];
            }
            avrgPerMonth[month] = sum / sales[0].length; 
        }

        for (int month = 0; month < avrgPerMonth.length; month++) {
            System.out.println("Average sales for month " + (month + 1) + " is " + avrgPerMonth[month]);
        }
    }

    public void calculateAvgSalesPerDepart(double[][] array) {
        double[] departAvrg = new double[sales.length];

        for (int dept = 0; dept < sales.length; dept++) {
            double sum = 0;
            for (int month = 0; month < sales[0].length; month++) {
                sum += array[dept][month];
            }
            departAvrg[dept] = sum / sales[0].length;
        }

        for (int dept = 0; dept < departAvrg.length; dept++) {
            System.out.println("Average sales for Department " + (dept + 1) + " is " + departAvrg[dept]);
        }
    }

    public void determineHighestMonthlySale(int monthNum) {
        int monthIndex = monthNum - 1;
        double high = -1;
        int bestDept = -1;

        for (int dept = 0; dept < sales.length; dept++) {
            if (sales[dept][monthIndex] > high) {
                high = sales[dept][monthIndex];
                bestDept = dept;
            }
        }

        System.out.println("Department with highest sales in month " + monthNum + " is Department " + (bestDept + 1));
    }

    public void determineHighestDepartSale(int deptNum) {
        int deptIndex = deptNum - 1;
        double high = -1;
        int bestMonth = -1;

        for (int month = 0; month < sales[0].length; month++) {
            if (sales[deptIndex][month] > high) {
                high = sales[deptIndex][month];
                bestMonth = month;
            }
        }

        System.out.println("Month with highest sales for Department " + deptNum + " is Month " + (bestMonth + 1));
    }
}
