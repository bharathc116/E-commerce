package com.example.ecommerce.service;

import com.example.ecommerce.model.Cart;
import com.example.ecommerce.model.User;
import com.example.ecommerce.repository.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartServiceImpl implements CartService{
    @Autowired
    CartRepo cartRepo;


    @Override
    public Optional<Cart> findByUser(User user) {
        Optional<Cart> cart= cartRepo.findById(user.getId());
         return cart;
    }
}
