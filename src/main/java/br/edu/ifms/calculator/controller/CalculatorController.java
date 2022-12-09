package br.edu.ifms.calculator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifms.calculator.model.SumNumbersModel;
import br.edu.ifms.calculator.service.CalculatorService;


@RestController
@RequestMapping(value = "/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping(value="/{num1}/{num2}")
    public ResponseEntity<Double> getSum(@PathVariable("num1") String num1, @PathVariable("num2") String num2) {
        Double newNum1 = Double.valueOf(0);
        Double newNum2 = Double.valueOf(0);
        try {
            newNum1 = Double.parseDouble(num1);
            newNum2 = Double.parseDouble(num2);
        } catch (NumberFormatException nfe) {
            throw new ArithmeticException("Invalid value! the parameters must be numbers");
        }
        Double result = this.calculatorService.sum(newNum1, newNum2);
        return ResponseEntity.ok(result);
    }


    @PostMapping()
    public ResponseEntity<Double> postSum(@RequestBody SumNumbersModel sumNumbersModel) {
        Double newNum1 = Double.valueOf(0);
        Double newNum2 = Double.valueOf(0);
        try {
            newNum1 = Double.parseDouble(sumNumbersModel.getNum1());
            newNum2 = Double.parseDouble(sumNumbersModel.getNum2());
        } catch (NumberFormatException nfe) {
            throw new ArithmeticException("Invalid value! the parameters must be numbers");
        }
        Double result = this.calculatorService.sum(newNum1, newNum2);
        return ResponseEntity.ok(result);
    }
}

