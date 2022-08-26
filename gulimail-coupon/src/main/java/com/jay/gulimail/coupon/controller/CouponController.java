package com.jay.gulimail.coupon.controller;

import java.util.Arrays;
import java.util.Map;


import com.jay.gulimail.coupon.entity.ConfigData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jay.gulimail.coupon.entity.CouponEntity;
import com.jay.gulimail.coupon.service.CouponService;
import com.jay.common.utils.PageUtils;
import com.jay.common.utils.R;



/**
 * 优惠券信息
 *
 * @author tangshijia
 * @email tangshijia2630@qq.com
 * @date 2022-08-20 15:44:47
 */
//不建议使用这种方式，推荐简历一个实体类，然后用get方法获取修改后的值
//@RefreshScope(proxyMode = ScopedProxyMode.DEFAULT)
@RestController
//nacos配置中心的配置优先于本地配置
@RequestMapping("coupon/coupon")
public class CouponController {
    @Autowired
    private CouponService couponService;

    @Autowired
    private ConfigData configData;

//    @Value("${coupon.user.name}")
//    private  String name;
//    @Value("${coupon.user.age}")
//    private Integer age;
    @RequestMapping("/test")
    private R test(){
        return R.ok().put("name",configData.getName()).put("age",configData.getAge());
    }

    /**
     * 返回当前会员的所有优惠券
     */
    @RequestMapping("/member/list")
    public R memberCoupons(){
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("满100减10");
        return R.ok().put("coupons",Arrays.asList(couponEntity));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = couponService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		CouponEntity coupon = couponService.getById(id);

        return R.ok().put("coupon", coupon);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CouponEntity coupon){
		couponService.save(coupon);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody CouponEntity coupon){
		couponService.updateById(coupon);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		couponService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
