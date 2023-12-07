/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author Administrator
 */
public class Student {
    private String code,name,birthplace;
    private double point;

    public Student() {
    }

    public Student(String code, String name, String birthplace, double point) {
        this.code = code;
        this.name = name;
        this.birthplace = birthplace;
        this.point = point;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }
    
}
