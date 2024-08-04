package com.udacity.pricing.service;

import com.udacity.pricing.domain.price.Price;

public interface IPricingService {

    public Price getPrice(Long vehicleId) throws PriceException;

}
