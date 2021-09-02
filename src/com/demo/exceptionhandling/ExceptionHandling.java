package com.demo.exceptionhandling;


public class ExceptionHandling
{
    public static void main(String[] args)
    {
        System.out.println("This statement will be executed"); 
 
        try
        {
            int i = 1000/0; 
            try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
        }catch (ArithmeticException a) {
			// TODO: handle exception
        	a.printStackTrace();
        	
		}
        catch (Exception e)
        {
            System.out.println("Exception Caught");
            try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}finally {
				
			}
        }finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}finally {
				
			}
		}
 
        System.out.println("Now, This statement will also be executed");
    }
    public void show() {
    	try {
			
		} finally {
			// TODO: handle finally clause
		}
    	try {}
    	catch (Exception e) {
			// TODO: handle exception
		}finally {
			
		}
    }
}