package com.laioffer.testbackend.Model;

import java.util.Objects;

public class TestPostModel {

    public String param1;
    public String param2;


    public TestPostModel(String p1, String p2) {
        this.param1 = p1;
        this.param2 = p2;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestPostModel that = (TestPostModel) o;
        return Objects.equals(param1, that.param1) &&
                Objects.equals(param2, that.param2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(param1, param2);
    }

    @Override
    public String toString() {
        return "TestPostModel{" +
                "param1='" + param1 + '\'' +
                ", param2='" + param2 + '\'' +
                '}';
    }
}
