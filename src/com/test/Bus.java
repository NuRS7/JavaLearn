package com.test;

public class Bus {
    private int id = 1;

    {
        id = 4;
        System.out.println(id);


    }

    public Bus(int id) {
        this.id = id;

    }

    @Override

    public String toString() {
        final StringBuilder sb = new StringBuilder("Bus {");

        sb.append(" = id: ").append(id);
        sb.append('}');
        return sb.toString();

    }
}
