package org.hina.LanguageBase.Sudoku.Exception;

public class ExceptionHandler {
    public void handle(Exception e) {
        if (e instanceof IllegalInputException)
            System.out.println(e.getMessage());
    }
}
