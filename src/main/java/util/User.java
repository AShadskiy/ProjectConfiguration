package util;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum User {

    SUPER_ADMIN("ROLE_SUPER_ADMIN", "SUPER ADMIN"),
    ;

    private final String dbValue;
    private final String feValue;

}
