/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.models;

/**
 *
 * @author Admin
 */
public class Person {
    private String name;
    private String mob;
    private String email;
    private String city;
    private String age;
    private String dob;
 
    
    
    
    
   /* public User(){
        x=0;
    }
    
    public User(int x){
        this.x=x;
    }
    
    public void incX(){
        x++;
    }
    
    public void decX(){
        x--;
    }
    public int getX(){
        return x;
    }*/
    public String getName(){
        return this.name; 
   }
    
    public String getMob(){
        return this.mob; 
   }
    
    public String getEmail(){
        return this.email; 
   }
   public String getCity(){
        return this.city; 
   }
   public String getAge(){
        return this.age; 
   }
   public String getDob(){
        return this.dob; 
   }
 
    
    public void setData(String name, String mob,String email,String city,String age,String dob){
        this.name = name;
        this.mob = mob;
        this.email = email;
        this.city = city;
        this.age = age;
        this.dob = dob;
   
    }

}