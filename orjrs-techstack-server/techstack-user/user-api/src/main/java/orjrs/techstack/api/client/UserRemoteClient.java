package orjrs.techstack.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("user-provider")
public interface UserRemoteClient {

    @GetMapping("/user/name")
    String getName();
}
