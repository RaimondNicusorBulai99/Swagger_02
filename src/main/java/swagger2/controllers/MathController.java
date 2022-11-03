package swagger2.controllers;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import swagger2.entities.ArithmeticOperation;

@RestController
@RequestMapping("/math")
public class MathController {

    @GetMapping("/")
    public String welcomeMathMsg() {
        return "Welcome to the MathMsg";
    }

    @GetMapping("/division-info")
    @ApiOperation(value = "Division information", notes = "Prints the information and properties for the division")
    public ArithmeticOperation getDivision() {
        return new ArithmeticOperation(
                "division",
                2,
                "Division is the operation used to solve " +
                        "problems of breakdown and containment." + '\n' +
                        " Breakdown: Deploy in equal parts and " +
                        "calculate 'how many in each part'." + '\n' +
                        " Containment: group and" +
                        "Calculate 'how many parts'",
                new String[]{
                        "THE INVARIANT PROPERTY", "DISTRIBUTION PROPERTY"
                });
    }

    @GetMapping("/multiplication")
    @ApiOperation(value = "Multiplication", notes = "Returns the result of the multiplication between 2 numbers")
    public int doMultiplication(@RequestParam int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    @GetMapping("/square/{n}")
    @ApiOperation(value = "Square", notes = "Prints the result of the square from a number")
    public int doSquare(@PathVariable int n) {
        return n * n;
    }
}
