package com.company;

public class PhysicalProductModel implements IPhysicalProductModel {

    private final String Title;
    private Boolean IsOrderComplete;

    public PhysicalProductModel(String title, Boolean isOrderComplete)
    {
        Title = title;
        IsOrderComplete = isOrderComplete;
        if (IsOrderComplete == null) IsOrderComplete = false;
    }

    public void shipItem(CustomerModel customer)
    {
        if (!IsOrderComplete)
        {
            System.out.println("Simulating shipping" + Title + "to" + customer.FirstName + "in" + customer.City);
            IsOrderComplete = true;
        }
    }
}
