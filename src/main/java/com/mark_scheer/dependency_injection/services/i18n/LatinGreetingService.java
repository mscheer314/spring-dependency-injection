package com.mark_scheer.dependency_injection.services.i18n;

import com.mark_scheer.dependency_injection.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({ "LT", "default" })
@Service("i18nService")
public class LatinGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Salve mundi";
    }
}
