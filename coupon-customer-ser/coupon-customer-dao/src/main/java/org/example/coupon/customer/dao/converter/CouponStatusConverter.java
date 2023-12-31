package org.example.coupon.customer.dao.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.example.coupon.customer.api.enums.CouponStatus;

/**
 * @author : Flobby
 * @program : cloud-coupon
 * @description : 优惠券状态转换类
 * @create : 2023-09-09 10:38
 **/

@Converter
public class CouponStatusConverter implements AttributeConverter<CouponStatus, Integer> {
    @Override
    public Integer convertToDatabaseColumn(CouponStatus couponStatus) {
        return couponStatus.getCode();
    }

    @Override
    public CouponStatus convertToEntityAttribute(Integer code) {
        return CouponStatus.convert(code);
    }
}
