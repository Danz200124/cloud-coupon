package org.example.coupon.calculation.template.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.coupon.calculation.template.AbstractRuleTemplate;
import org.example.coupon.calculation.template.RuleTemplate;
import org.springframework.stereotype.Component;
import org.example.coupon.calculation.api.beans.ShoppingCart;

/**
 * @author : Flobby
 * @program : cloud-coupon
 * @description : 空实现
 * @create : 2023-09-08 17:18
 **/

@Slf4j
@Component
public class DummyTemplate extends AbstractRuleTemplate implements RuleTemplate {

    @Override
    public ShoppingCart calculate(ShoppingCart order) {
        // 获取订单总价
        long totalPrice = getTotalPrice(order.getProducts());
        order.setCost(totalPrice);
        return order;
    }

    @Override
    protected Long calculateNewPrice(Long orderTotalAmount, Long shopTotalAmount, Long quota) {
        return orderTotalAmount;
    }
}
