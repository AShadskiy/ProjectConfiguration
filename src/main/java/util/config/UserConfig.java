package util.config;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import exceptions.ConfigManagerException;
import lombok.extern.slf4j.Slf4j;
import util.User;
import util.UserModel;

import java.io.File;
import java.io.IOException;

@Slf4j
public class UserConfig {

    private final String login;
    private final String password;

    UserConfig(User user) {
        this.login = getUser(user).getEmail();
        this.password = getUser(user).getPassword();
    }

    public static UserModel getUser(User user) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            JsonNode jsonNode = objectMapper.readTree(new File(ConfigManager.CURRENT_USER_CONFIG));
            return objectMapper.treeToValue(jsonNode.get(user.getDbValue()), UserModel.class);
        } catch (IOException e) {
            throw new ConfigManagerException(e);
        }
    }

}
