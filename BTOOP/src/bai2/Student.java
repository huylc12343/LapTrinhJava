package bai2;

import java.util.Scanner;

public class Student {

    private String name, birthplace, Code;
    private float point;

    public Student() {
    }

    public Student(String Code, String name, String birthplace, float point) {
        this.Code = Code;
        this.name = name;
        this.birthplace = birthplace;
        this.point = point;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
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

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

}
