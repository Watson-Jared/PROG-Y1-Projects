/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package productsales;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import java.util.Scanner;
import org.junit.jupiter.api.BeforeAll;

/**
 *
 * @author lab_services_student
 */
public class ProductSalesTest {
    
    int salesData[][] = { 
           {300, 150,700},
           {250, 200,600}
    };
    
    ProductSales sales  = new ProductSales();
    
    public ProductSalesTest() {
    }
    
    @Test
    public void calculateTotalSales_ReturnTotalsSales(){
        int result = sales.totalSales(salesData);
        int expected = 2200;
        
        assertEquals(expected, result);      
    }
    
    @Test
    public void averageSales_ReturnsAverageProductSales(){
        double result = sales.averageSales(salesData);
        double expected = 366;
        
        assertEquals(expected, result, result);
    }
    
}
