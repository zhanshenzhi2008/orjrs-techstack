package orjrs.teckstack.provider.controller;

import org.springframework.web.bind.annotation.RestController;
import orjrs.techstack.api.client.UserRemoteClient;

@RestController
public class UserController implements UserRemoteClient {

    public String getName() {
        return "厉害了";
    }
}
