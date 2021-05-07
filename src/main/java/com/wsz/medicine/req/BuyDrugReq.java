package com.wsz.medicine.req;

import com.wsz.medicine.domain.DrugToBuy;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class BuyDrugReq {
    private List<DrugToBuy> basket;

    @Override
    public String toString() {
        return "BuyDrugReq{" +
                "basket=" + basket +
                '}';
    }

    public List<DrugToBuy> getBasket() {
        return basket;
    }

    public void setBasket(List<DrugToBuy> basket) {
        this.basket = basket;
    }
}