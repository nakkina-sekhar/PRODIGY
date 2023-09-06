package com.prodigy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
public class GameController {

    private int targetNumber;
    private int attempts;
    private boolean gameWon;

    @GetMapping("/")
    public String index(Model model) {
        startNewGame();
        model.addAttribute("message", "Can you guess the number?");
        return "index";
    }

    @PostMapping("/guess")
    public String makeGuess(@RequestParam int guess, Model model) {
        attempts++;
        if (guess == targetNumber) {
            gameWon = true;
            model.addAttribute("message", "Congratulations! You guessed the number in " + attempts + " attempts.");
        } else if (guess < targetNumber) {
            model.addAttribute("message", "Try a higher number.");
        } else {
            model.addAttribute("message", "Try a lower number.");
        }
        return "index";
    }

    private void startNewGame() {
        Random random = new Random();
        targetNumber = random.nextInt(10) + 1; // Generate a random number between 1 and 10
        attempts = 0;
        gameWon = false;
    }
}
