package com.fawzySystem.payment_service.networkProviders;

import org.springframework.stereotype.Service;

@Service
public class Etisalat extends Network{
    @Override
    public void networkName() {
        System.out.println("---------Etisalat----------");
    }
}
