package cn.sm1234.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class ProductController {
    //商品首页
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    //商品添加
    @RequestMapping("/product/add")
    public String add(){
        return "/product/productAdd";
    }

    //商品修改
    @RequestMapping("/product/update")
    public String update(){
        return "productUpdate";
    }


    //商品查询
    @RequestMapping("/product/list")
    public String list(){
        return "/product/productList";
    }

    //商品删除
    @RequestMapping("/product/delete")
    public String delete(){
        return "/product/productDelete";
    }
}
