package exceptions;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PageNotCreateException extends RuntimeException{

    public PageNotCreateException(String message) {
        super(message);
    }
}
