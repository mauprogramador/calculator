package br.edu.ifms.calculator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifms.calculator.exception.InvalidValueException;
import br.edu.ifms.calculator.model.SumNumbersModel;
import br.edu.ifms.calculator.service.GreetingService;


@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }


    @PostMapping()
    public ResponseEntity<Double> postSum(@RequestBody SumNumbersModel sumNumbersModel) {
        Double newNum1 = Double.valueOf(0);
        Double newNum2 = Double.valueOf(0);
        try {
            newNum1 = Double.parseDouble(sumNumbersModel.getNum1());
            newNum2 = Double.parseDouble(sumNumbersModel.getNum2());
        } catch (NumberFormatException nfe) {
            throw new InvalidValueException("Invalid value! the parameters must be numbers");
        }
        Double result = this.greetingService.sum(newNum1, newNum2);
        return ResponseEntity.ok(result);
    }
}
