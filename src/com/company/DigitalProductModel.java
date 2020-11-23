package com.company;

public class DigitalProductModel implements IDigitalProductModel {

    private final String Title;
    private Boolean IsOrderComplete;
    private Integer DownloadCount = 5;

    public DigitalProductModel(String title, Boolean isOrderComplete)
    {
        Title = title;
        IsOrderComplete = isOrderComplete;
        if (IsOrderComplete == null) IsOrderComplete = false;
    }

    public void shipItem(CustomerModel customer)
    {
        if (!IsOrderComplete)
        {
            System.out.println("Simulating shipping of " + Title + "to " + customer.FirstName + " in " + customer.City);
            DownloadCount--;
            if (DownloadCount < 0) IsOrderComplete = true;
        }
    }

    public void printDigitalPurchase()
    {
        System.out.println("For" + Title + " you have " + DownloadCount + " Number of downloads left");
    }
}