/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2darray;

import java.util.Scanner;

public class Main {
    
    // Instance variables - accessible by all methods
    int numbers[][] = new int[3][3];
    int cricketRuns[][] = {
        {145, 89, 203},   // Virat Kohli runs
        {178, 156, 92}    // AB de Villiers runs
    };
    String[] playerNames = {"Virat Kohli", "AB de Villiers"};
    String[] monthNames = {"January", "February", "March"};
    
    // Method to populate the numbers array
    public void populateArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 9 numbers for the 3x3 array:");
        for(int row = 0; row < numbers.length; row++){
            for(int col = 0; col < numbers[row].length; col++){
                System.out.print("Enter value["+row+"]["+col+"]: ");
                numbers[row][col] = input.nextInt();
            }
        }
    }
    
    // Method to print the entire 2D array with row and column labels
    public void printArray() {
        // Print column headers
        System.out.print("\t");
        for(int col = 0; col < numbers[0].length; col++){
            System.out.print("Col " + col + "\t");
        }
        System.out.println();
        
        // Print separator line
        System.out.print("\t");
        for(int col = 0; col < numbers[0].length; col++){
            System.out.print("------\t");
        }
        System.out.println();
        
        // Print rows with row labels
        for(int row = 0; row < numbers.length; row++){
            System.out.print("Row " + row + "|\t");
            for(int col = 0; col < numbers[row].length; col++){
                System.out.print(numbers[row][col] + "\t");
            }
            System.out.println();
        }
    }
    
    // Method 1: Search for a number in a SPECIFIC ROW
    public void searchInRow(int targetRow, int searchNum) {
        boolean found = false;
        
        for(int col = 0; col < numbers[targetRow].length; col++){
            if(numbers[targetRow][col] == searchNum){
                System.out.println("Found " + searchNum + " at [" + targetRow + "][" + col + "]");
                found = true;
                break;
            }
        }
        
        if(!found){
            System.out.println(searchNum + " not found in row " + targetRow);
        }
    }
    
    // Method 2: Search for a number in a SPECIFIC COLUMN
    public void searchInColumn(int targetCol, int searchNum) {
        boolean found = false;
        
        for(int row = 0; row < numbers.length; row++){
            if(numbers[row][targetCol] == searchNum){
                System.out.println("Found " + searchNum + " at [" + row + "][" + targetCol + "]");
                found = true;
                break;
            }
        }
        
        if(!found){
            System.out.println(searchNum + " not found in column " + targetCol);
        }
    }
    
    // Method 3: Find WHICH ROW contains a number
    public void findRow(int searchNum) {
        for(int row = 0; row < numbers.length; row++){
            for(int col = 0; col < numbers[row].length; col++){
                if(numbers[row][col] == searchNum){
                    System.out.println("Found " + searchNum + " in row " + row);
                    return;
                }
            }
        }
        System.out.println(searchNum + " not found in any row");
    }
    
    // Method 4: Find WHICH COLUMN contains a number
    public void findColumn(int searchNum) {
        for(int col = 0; col < numbers[0].length; col++){
            for(int row = 0; row < numbers.length; row++){
                if(numbers[row][col] == searchNum){
                    System.out.println("Found " + searchNum + " in column " + col);
                    return;
                }
            }
        }
        System.out.println(searchNum + " not found in any column");
    }
    
    // Method 5: Print all values in a SPECIFIC ROW
    public void printRow(int rowNum) {
        System.out.print("\nRow " + rowNum + ": ");
        for(int col = 0; col < numbers[rowNum].length; col++){
            System.out.print(numbers[rowNum][col] + " ");
        }
        System.out.println();
    }
    
    // Method 6: Print all values in a SPECIFIC COLUMN
    public void printColumn(int colNum) {
        System.out.println("\nColumn " + colNum + ":");
        for(int row = 0; row < numbers.length; row++){
            System.out.println(numbers[row][colNum]);
        }
    }
    
    // Method 7: Calculate and PRINT SUM of a specific ROW
    public void sumOfRow(int rowNum) {
        int sum = 0;
        for(int col = 0; col < numbers[rowNum].length; col++){
            sum += numbers[rowNum][col];
        }
        System.out.println("\nSum of row " + rowNum + ": " + sum);
    }
    
    // Method 8: Calculate and PRINT SUM of a specific COLUMN
    public void sumOfColumn(int colNum) {
        int sum = 0;
        for(int row = 0; row < numbers.length; row++){
            sum += numbers[row][colNum];
        }
        System.out.println("Sum of column " + colNum + ": " + sum);
    }
    
    // Method 9: Calculate and PRINT AVERAGE of a specific ROW
    public void averageOfRow(int rowNum) {
        int sum = 0;
        for(int col = 0; col < numbers[rowNum].length; col++){
            sum += numbers[rowNum][col];
        }
        double average = (double)sum / numbers[rowNum].length;
        System.out.println("Average of row " + rowNum + ": " + average);
    }
    
    // Method 10: Calculate and PRINT AVERAGE of a specific COLUMN
    public void averageOfColumn(int colNum) {
        int sum = 0;
        for(int row = 0; row < numbers.length; row++){
            sum += numbers[row][colNum];
        }
        double average = (double)sum / numbers.length;
        System.out.println("Average of column " + colNum + ": " + average);
    }
    
    // Method 11: Find and PRINT the position (both row and column) of a number
    public void findPosition(int searchNum) {
        for(int row = 0; row < numbers.length; row++){
            for(int col = 0; col < numbers[row].length; col++){
                if(numbers[row][col] == searchNum){
                    System.out.println("\n" + searchNum + " found at position [" + row + "][" + col + "]");
                    return;
                }
            }
        }
        System.out.println("\n" + searchNum + " not found in the array");
    }
    
    // Method 12: Check and PRINT if a number exists in the array
    public void contains(int searchNum) {
        for(int row = 0; row < numbers.length; row++){
            for(int col = 0; col < numbers[row].length; col++){
                if(numbers[row][col] == searchNum){
                    System.out.println("\n" + searchNum + " exists in the array");
                    return;
                }
            }
        }
        System.out.println("\n" + searchNum + " does not exist in the array");
    }
    
    // Method 13: Calculate and PRINT the average of ALL ROWS
    public void averageOfAllRows() {
        System.out.println("\n--- Average of Each Row ---");
        for(int row = 0; row < numbers.length; row++){
            int sum = 0;
            for(int col = 0; col < numbers[row].length; col++){
                sum += numbers[row][col];
            }
            double average = (double)sum / numbers[row].length;
            System.out.println("Row " + row + " average: " + average);
        }
    }
    
    // Method 14: Calculate and PRINT the average of ALL COLUMNS
    public void averageOfAllColumns() {
        System.out.println("\n--- Average of Each Column ---");
        for(int col = 0; col < numbers[0].length; col++){
            int sum = 0;
            for(int row = 0; row < numbers.length; row++){
                sum += numbers[row][col];
            }
            double average = (double)sum / numbers.length;
            System.out.println("Column " + col + " average: " + average);
        }
    }
    
    // Method 15: Print array with CUSTOM row and column labels (e.g., player names and months)
    public void printArrayWithCustomLabels() {
        // Print column headers
        System.out.print("\t\t\t");
        for(int col = 0; col < monthNames.length; col++){
            System.out.print(monthNames[col] + "\t");
        }
        System.out.println();
        
        // Print separator
        System.out.print("\t\t\t");
        for(int col = 0; col < monthNames.length; col++){
            System.out.print("----------\t");
        }
        System.out.println();
        
        // Print rows with custom labels
        for(int row = 0; row < cricketRuns.length; row++){
            System.out.print(playerNames[row] + "\t|\t");
            for(int col = 0; col < cricketRuns[row].length; col++){
                System.out.print(cricketRuns[row][col] + "\t\t");
            }
            System.out.println();
        }
    }
    
    // Method 16: Print a specific ROW with custom labels (e.g., one player's runs across months)
    public void printRowWithLabel(int rowNum) {
        System.out.println("\n" + playerNames[rowNum] + " Runs:");
        for(int col = 0; col < cricketRuns[rowNum].length; col++){
            System.out.println("  " + monthNames[col] + ": " + cricketRuns[rowNum][col]);
        }
    }
    
    // Method 17: Print a specific COLUMN with custom labels (e.g., all players' runs for one month)
    public void printColumnWithLabel(int colNum) {
        System.out.println("\n" + monthNames[colNum] + " Runs:");
        for(int row = 0; row < cricketRuns.length; row++){
            System.out.println("  " + playerNames[row] + ": " + cricketRuns[row][colNum]);
        }
    }
    
    // Method 18: Calculate and PRINT total runs for each PLAYER
    public void totalRunsPerPlayer() {
        System.out.println("\n--- Total Runs Per Player ---");
        
        // Create single array to store totals
        int[] playerTotals = new int[cricketRuns.length];
        
        // Calculate total for each player
        for(int player = 0; player < cricketRuns.length; player++){
            int sum = 0;
            for(int month = 0; month < cricketRuns[player].length; month++){
                sum += cricketRuns[player][month];
            }
            playerTotals[player] = sum;
        }
        
        // Print totals
        for(int player = 0; player < playerTotals.length; player++){
            System.out.println(playerNames[player] + ": " + playerTotals[player] + " runs");
        }
    }
    
    // Method 19: Calculate and PRINT total runs for each MONTH
    public void totalRunsPerMonth() {
        System.out.println("\n--- Total Runs Per Month ---");
        
        // Create single array to store totals
        int[] monthTotals = new int[cricketRuns[0].length];
        
        // Calculate total for each month
        for(int month = 0; month < cricketRuns[0].length; month++){
            int sum = 0;
            for(int player = 0; player < cricketRuns.length; player++){
                sum += cricketRuns[player][month];
            }
            monthTotals[month] = sum;
        }
        
        // Print totals
        for(int month = 0; month < monthTotals.length; month++){
            System.out.println(monthNames[month] + ": " + monthTotals[month] + " runs");
        }
    }
    
    // Method 20: Calculate and PRINT average runs for each PLAYER
    public void averageRunsPerPlayer() {
        System.out.println("\n--- Average Runs Per Player ---");
        
        // Create single array to store averages
        double[] playerAverages = new double[cricketRuns.length];
        
        // Calculate average for each player
        for(int player = 0; player < cricketRuns.length; player++){
            int sum = 0;
            for(int month = 0; month < cricketRuns[player].length; month++){
                sum += cricketRuns[player][month];
            }
                                 //Explicit Casting
            playerAverages[player] = (double)sum / cricketRuns[player].length;
        }
        
        // Print averages
        for(int player = 0; player < playerAverages.length; player++){
            System.out.println(playerNames[player] + ": " + playerAverages[player] + " runs");
        }
    }
    
    // Method 21: Calculate and PRINT average runs for each MONTH
    public void averageRunsPerMonth() {
        System.out.println("\n--- Average Runs Per Month ---");
        
        // Create single array to store averages
        double[] monthAverages = new double[cricketRuns[0].length];
        
        // Calculate average for each month
        for(int month = 0; month < cricketRuns[0].length; month++){
            int sum = 0;
            for(int player = 0; player < cricketRuns.length; player++){
                sum += cricketRuns[player][month];
            }
            monthAverages[month] = (double)sum / cricketRuns.length;
        }
        
        // Print averages
        for(int month = 0; month < monthAverages.length; month++){
            System.out.println(monthNames[month] + ": " + monthAverages[month] + " runs");
        }
    }
    
    // Method 22: Find and PRINT the month with HIGHEST total runs
    public void findMonthWithHighestRuns() {
        int maxRuns = 0;
        int maxMonth = 0;
        
        for(int col = 0; col < cricketRuns[0].length; col++){
            int total = 0;
            for(int row = 0; row < cricketRuns.length; row++){
                total += cricketRuns[row][col];
            }
            if(total > maxRuns){
                maxRuns = total;
                maxMonth = col;
            }
        }
        System.out.println("\n--- Month with Highest Runs ---");
        System.out.println(monthNames[maxMonth] + " had the highest runs: " + maxRuns);
    }
    
    // Method 23: Find and PRINT the player with HIGHEST total runs
    public void findPlayerWithHighestRuns() {
        int maxRuns = 0;
        int maxPlayer = 0;
        
        for(int row = 0; row < cricketRuns.length; row++){
            int total = 0;
            for(int col = 0; col < cricketRuns[row].length; col++){
                total += cricketRuns[row][col];
            }
            if(total > maxRuns){
                maxRuns = total;
                maxPlayer = row;
            }
        }
        System.out.println("\n--- Player with Highest Runs ---");
        System.out.println(playerNames[maxPlayer] + " scored the highest runs: " + maxRuns);
    }
    
    // Method 24: Find and PRINT the player with highest runs in EACH month
    public void findPlayerWithHighestRunsPerMonth() {
        System.out.println("\n--- Player with Highest Runs in Each Month ---");
        
        for(int col = 0; col < cricketRuns[0].length; col++){
            int maxRuns = cricketRuns[0][col];
            int maxPlayer = 0;
            
            for(int row = 1; row < cricketRuns.length; row++){
                if(cricketRuns[row][col] > maxRuns){
                    maxRuns = cricketRuns[row][col];
                    maxPlayer = row;
                }
            }
            System.out.println(monthNames[col] + ": " + playerNames[maxPlayer] + " (" + maxRuns + " runs)");
        }
    }
    
    // Method 25: Find and PRINT the player with LOWEST total runs
    public void findPlayerWithLowestRuns() {
        int minRuns = 0;
        int minPlayer = 0;
        
        // Calculate total for first player
        for(int col = 0; col < cricketRuns[0].length; col++){
            minRuns += cricketRuns[0][col];
        }
        
        // Compare with other players
        for(int row = 1; row < cricketRuns.length; row++){
            int total = 0;
            for(int col = 0; col < cricketRuns[row].length; col++){
                total += cricketRuns[row][col];
            }
            if(total < minRuns){
                minRuns = total;
                minPlayer = row;
            }
        }
        System.out.println("\n--- Player with Lowest Runs ---");
        System.out.println(playerNames[minPlayer] + " scored the lowest runs: " + minRuns);
    }
    
    // Method 26: Find and PRINT the player with lowest runs in EACH month
    public void findPlayerWithLowestRunsPerMonth() {
        System.out.println("\n--- Player with Lowest Runs in Each Month ---");
        
        for(int col = 0; col < cricketRuns[0].length; col++){
            int minRuns = cricketRuns[0][col];
            int minPlayer = 0;
            
            for(int row = 1; row < cricketRuns.length; row++){
                if(cricketRuns[row][col] < minRuns){
                    minRuns = cricketRuns[row][col];
                    minPlayer = row;
                }
            }
            System.out.println(monthNames[col] + ": " + playerNames[minPlayer] + " (" + minRuns + " runs)");
        }
    }
    
    // Method 27: Find and PRINT the month with LOWEST total runs
    public void findMonthWithLowestRuns() {
        int minRuns = 0;
        int minMonth = 0;
        
        // Calculate total for first month
        for(int row = 0; row < cricketRuns.length; row++){
            minRuns += cricketRuns[row][0];
        }
        
        // Compare with other months
        for(int col = 1; col < cricketRuns[0].length; col++){
            int total = 0;
            for(int row = 0; row < cricketRuns.length; row++){
                total += cricketRuns[row][col];
            }
            if(total < minRuns){
                minRuns = total;
                minMonth = col;
            }
        }
        System.out.println("\n--- Month with Lowest Runs ---");
        System.out.println(monthNames[minMonth] + " had the lowest runs: " + minRuns);
    }
    
    // Method 28: Calculate and PRINT total of entire numbers array
    public void totalOfArray() {
        int total = 0;
        for(int row = 0; row < numbers.length; row++){
            for(int col = 0; col < numbers[row].length; col++){
                total += numbers[row][col];
            }
        }
        System.out.println("\n--- Total of Entire Array ---");
        System.out.println("Total: " + total);
    }
    
    // Method 29: Calculate and PRINT average of entire numbers array
    public void averageOfArray() {
        int total = 0;
        int count = 0;
        for(int row = 0; row < numbers.length; row++){
            for(int col = 0; col < numbers[row].length; col++){
                total += numbers[row][col];
                count++;
            }
        }
        double average = (double)total / count;
        System.out.println("\n--- Average of Entire Array ---");
        System.out.println("Average: " + average);
    }
    
    // Method 30: Calculate and PRINT total of entire cricket runs array
    public void totalOfCricketArray() {
        int total = 0;
        for(int row = 0; row < cricketRuns.length; row++){
            for(int col = 0; col < cricketRuns[row].length; col++){
                total += cricketRuns[row][col];
            }
        }
        System.out.println("\n--- Total Cricket Runs (All Players, All Months) ---");
        System.out.println("Total: " + total + " runs");
    }
    
    // Method 31: Calculate and PRINT average of entire cricket runs array
    public void averageOfCricketArray() {
        int total = 0;
        int count = 0;
        for(int row = 0; row < cricketRuns.length; row++){
            for(int col = 0; col < cricketRuns[row].length; col++){
                total += cricketRuns[row][col];
                count++;
            }
        }
        double average = (double)total / count;
        System.out.println("\n--- Average Cricket Runs (All Players, All Months) ---");
        System.out.println("Average: " + average + " runs");
    }

    public static void main(String[] args) {
        // Create an instance of Main
        Main obj = new Main();
        
        // Populate 2D Array
        obj.populateArray();
        
        // Print the array
        System.out.println("\nYour array:");
        obj.printArray();
        
        // Examples of using the methods
        System.out.println("\n--- SEARCH EXAMPLES ---");
        
        // Search specific row
        obj.searchInRow(1, 15);
        
        // Search specific column
        obj.searchInColumn(2, 11);
        
        // Find which row contains a number
        obj.findRow(6);
        
        // Find which column contains a number
        obj.findColumn(12);
        
        // Print specific row
        obj.printRow(0);
        
        // Print specific column
        obj.printColumn(1);
        
        // Sum of a row
        obj.sumOfRow(1);
        
        // Sum of a column
        obj.sumOfColumn(2);
        
        // Average of a row
        obj.averageOfRow(0);
        
        // Average of a column
        obj.averageOfColumn(1);
        
        // Find position of a number
        obj.findPosition(12);
        
        // Check if number exists
        obj.contains(99);
        
        // Average of all rows
        obj.averageOfAllRows();
        
        // Average of all columns
        obj.averageOfAllColumns();
        
        // Total of entire array
        obj.totalOfArray();
        
        // Average of entire array
        obj.averageOfArray();
        
        // Example with custom labels (cricket players and runs)
        System.out.println("\n\n=== CRICKET RUNS EXAMPLE ===");
        
        obj.printArrayWithCustomLabels();
        
        // Print specific player runs
        obj.printRowWithLabel(0);
        
        // Print specific month runs
        obj.printColumnWithLabel(1);
        
        // Total runs per player
        obj.totalRunsPerPlayer();
        
        // Total runs per month
        obj.totalRunsPerMonth();
        
        // Average runs per player
        obj.averageRunsPerPlayer();
        
        // Average runs per month
        obj.averageRunsPerMonth();
        
        // Find month with highest runs
        obj.findMonthWithHighestRuns();
        
        // Find player with highest runs
        obj.findPlayerWithHighestRuns();
        
        // Find player with highest runs in each month
        obj.findPlayerWithHighestRunsPerMonth();
        
        // Find player with lowest runs
        obj.findPlayerWithLowestRuns();
        
        // Find player with lowest runs in each month
        obj.findPlayerWithLowestRunsPerMonth();
        
        // Find month with lowest runs
        obj.findMonthWithLowestRuns();
        
        // Total of cricket array
        obj.totalOfCricketArray();
        
        // Average of cricket array
        obj.averageOfCricketArray();
    }
    
}