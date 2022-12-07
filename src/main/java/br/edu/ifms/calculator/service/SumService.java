package br.edu.ifms.calculator.service;

import org.springframework.stereotype.Service;


@Service
public class SumService {
    
    public Double sum(Double n1, Double n2) {
        try {
            return n1 + n2;
        } catch (Exception e) {
            throw new InternalError("Unexpected error! sum operation cannot be calculated");
        }
    }
}
