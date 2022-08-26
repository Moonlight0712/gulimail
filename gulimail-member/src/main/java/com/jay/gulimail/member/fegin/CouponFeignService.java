package com.jay.gulimail.member.fegin;

import com.jay.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Dragon code!
 * @create 2022-08-20 23:37
 */
//加了这个注解后同样可以在controller中使用我们的Autowired来注入我们的接口，然后调用方法。
@FeignClient("gulimail-coupon")
public interface CouponFeignService {
    @RequestMapping("/coupon/coupon/member/list")
    public R memberCoupons();
}
