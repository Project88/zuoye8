package Triangle1;

import static org.junit.Assert.*;

import org.junit.Test;

public class test1{

	 @Test
     public void testlsTringle1(){
         Triangle1 t=new Triangle1(-3,-9,-11);
         assertFalse(t.isTriangle1(t));
     } 
	 
	 @Test
     public void testlsTringle2(){
         Triangle1 t=new Triangle1(2,3,7);
         assertFalse(t.isTriangle1(t));
     }
     

     @Test
     public void testlsTringle3(){
         Triangle1 t=new Triangle1(0,0,5);
         assertFalse(t.isTriangle1(t));
     }
     
     @Test
     public void testlsTringle4(){
         Triangle1 t=new Triangle1(22,22,22);
         assertFalse(t.isTriangle1(t));
     }
    
    
     @Test
     public void testlsTringle5(){
         Triangle1 t=new Triangle1(6,6,8);
         assertFalse(t.isTriangle1(t));
     }
     
     @Test
     public void testlsTringle6(){
         Triangle1 t=new Triangle1(8,9,10);
         assertFalse(t.isTriangle1(t));
     }
     
     @Test
     public void testlsTringle7(){
         Triangle1 t=new Triangle1(3,7,8);
         assertFalse(t.isTriangle1(t));
     }
   
    
     
}