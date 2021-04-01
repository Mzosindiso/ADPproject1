/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpproject1;

/**
 *
 * @author Thina Mzosindiso Nontwabaza : 
 * Student no: 219189153
 */
public class Count {
    private int password, identityNo, age;

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(int identityNo) {
        this.identityNo = identityNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Count{" + "password=" + password + ", identityNo=" + identityNo + ", age=" + age + '}';
    }
    
}
