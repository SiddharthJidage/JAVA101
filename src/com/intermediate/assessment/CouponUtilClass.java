package com.intermediate.assessment;

import java.util.Random;

public class CouponUtilClass {
    long couponID;
    String couponCode;
    double discountPercentage;
    String providerName;

    public CouponUtilClass(String couponCode, double discountPercentage, String providerName) {
        this.couponCode = couponCode;
        this.discountPercentage = discountPercentage;
        this.providerName = providerName;
        Random randomCouponIdGenerator = new Random();
        this.couponID = randomCouponIdGenerator.nextLong();
    }

    public void getCoupon(){
        System.out.println( "CopuonID :"+ couponID+'\n' +"Coupon Code : "+ couponCode+'\n'+"Discount :"+ discountPercentage+'\n'+"ProviderName : "+ providerName);
    }
}
