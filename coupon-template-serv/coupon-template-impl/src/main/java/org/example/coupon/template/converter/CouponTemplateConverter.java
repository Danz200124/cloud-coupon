package org.example.coupon.template.converter;

import org.example.coupon.template.api.beans.CouponTemplateInfo;
import org.example.coupon.template.dao.entity.CouponTemplate;

/**
 * @author : Flobby
 * @program : cloud-coupon
 * @description : 优惠券模板转换类
 * @create : 2023-09-08 16:17
 **/

public class CouponTemplateConverter {
    public static CouponTemplateInfo convertToTemplateInfo(CouponTemplate template) {
        return CouponTemplateInfo.builder()
                .id(template.getId())
                .name(template.getName())
                .desc(template.getDescription())
                .type(template.getCategory().getCode())
                .shopId(template.getShopId())
                .available(template.getAvailable())
                .rule(template.getRule())
                .build();
    }
}
