package ru.nposp.tech.backservicerepair.component;

import java.util.Collections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/*****

 @author Sergei Iurochkin
 @link https://github.com/SilverRid

 */
@Component
public class MyInfoContributor implements InfoContributor {
    @Autowired
    private Environment env;
    @Override
    public void contribute(final Info.Builder builder) {
        builder.withDetail("info.author", Collections.singletonMap("author", env.getProperty("info.author")));

    }
}
