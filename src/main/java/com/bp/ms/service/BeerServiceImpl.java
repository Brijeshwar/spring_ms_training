package com.bp.ms.service;

import com.bp.ms.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service("beerService")
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeer() {
        return BeerDto.builder().uid(UUID.randomUUID()).type("Strong").price(180).build();
    }
}
