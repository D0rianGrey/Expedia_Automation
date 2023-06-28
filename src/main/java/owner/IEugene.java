package owner;

import org.aeonbits.owner.Config;

public interface IEugene extends Config {

    @Key("name")
    String getName();

    @Key("age")
    @DefaultValue("18")
    int getAge();
}
