package com.example.ecommerce.service;

import com.example.ecommerce.model.Cart;
import com.example.ecommerce.model.User;

import java.util.Optional;

public interface CartService {

    Optional<Cart> findByUser(User user);
}
