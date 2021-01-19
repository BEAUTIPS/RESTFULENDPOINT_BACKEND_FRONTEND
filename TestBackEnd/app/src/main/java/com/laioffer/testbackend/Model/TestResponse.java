package com.laioffer.testbackend.Model;

import java.util.Objects;

public class TestResponse {
    public String message;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestResponse that = (TestResponse) o;
        return Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }

    @Override
    public String toString() {
        return "TestResponse{" +
                "message='" + message + '\'' +
                '}';
    }
}
