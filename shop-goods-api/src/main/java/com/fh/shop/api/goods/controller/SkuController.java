package com.fh.shop.api.goods.controller;

import com.fh.shop.api.goods.biz.ISkuService;
import com.fh.shop.common.ServerResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api")
public class SkuController {

    @Resource(name = "skuService")
    private ISkuService skuService;

    @GetMapping("/skus/recommend/newproduct")
    public ServerResponse list() {
        return skuService.findRecommendNewProductList();
    }

    @GetMapping("/skus/findSku")
    public ServerResponse findSku(@RequestParam("id") Long id) {
        return skuService.findSku(id);
    }
}
