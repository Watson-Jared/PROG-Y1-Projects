/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package productsalesgui;


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
    public void getSalesOverLimit_ReturnsNumberOfSales(){
        int result = sales.getSalesOverLimit();
        int expected = 2;
        
        assertEquals(expected, result, result);
    }
    
    @Test
    public void getSalesUnderLimit_ReturnsNumberOfSales(){
        int result = sales.getSalesUnderLimit();
        int expected = 4;
        
        assertEquals(expected, result, result);
    }
}
