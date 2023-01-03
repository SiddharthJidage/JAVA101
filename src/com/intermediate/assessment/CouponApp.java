package com.intermediate.assessment;

public class CouponApp {
    public static void main(String[] args) {
        CouponUtilClass coupon1 = new CouponUtilClass("Btc4e35", 65.50, "XOXODAY");
        CouponUtilClass coupon2 = new CouponUtilClass("Asc4e35", 50.00, "AMAZON");
        CouponUtilClass coupon3 = new CouponUtilClass("B784e35", 35.10, "FLIPKART");
        CouponUtilClass coupon4 = new CouponUtilClass("42c4e35", 75.50, "XOXODAY");


        CouponUtilClass[] coupon = new CouponUtilClass[4];
        coupon[0] = coupon1;
        coupon[1] = coupon2;
        coupon[2] = coupon3;
        coupon[3] = coupon4;

        for (int i=0; i<4; i++){
            System.out.println("________________________________________________________________");
            coupon[i].getCoupon();
        }
    }

}
