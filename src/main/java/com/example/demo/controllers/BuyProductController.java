package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.PartService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class BuyProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/buyProduct")
    public String buyProduct(@RequestParam("productId") Long productId) {

        Optional<Product> buyProd = productRepository.findById(productId);

        if (buyProd.isPresent()) {
            Product product = buyProd.get();

            if (product.getInv() > 0) {
                product.setInv(product.getInv() - 1);
                productRepository.save(product);
                return "successPage";
            } else {
                return "errorPage";
            }
        } else {
            return "errorPage";
        }
    }
}