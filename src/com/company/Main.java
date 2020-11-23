package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        var cart = addSampleData();
        var customer = new CustomerModel("Jens", "Hansen", "Jensen street",
                "Wales", "jens@jensmail.com", "384568346");
        cart.forEach(prod -> {
            prod.shipItem(customer);
            if (prod instanceof IDigitalProductModel) {
                ((IDigitalProductModel) prod).printDigitalPurchase();
            }
        });
    }

    private static List<IProductModel> addSampleData()
    {
        List<IProductModel> output = new ArrayList<>();
        output.add(new PhysicalProductModel("Del 1", null));
        output.add(new PhysicalProductModel("Del 2", null));
        output.add(new PhysicalProductModel("Del 3", null));
        output.add(new DigitalProductModel("Digital software 1", null));
        output.add(new DigitalProductModel("Digital software 2", null));
        output.add(new DigitalProductModel("Digital software 3", null));
        return output;
    }
}
