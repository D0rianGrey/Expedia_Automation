package owner;

import org.aeonbits.owner.ConfigFactory;

public class Provider {

    IEugene iEugene;

    public Provider() {
        this.iEugene = ConfigFactory.create(IEugene.class, System.getProperties());
    }

    public String getName() {
        return iEugene.getName();
    }

    public int getAge() {
        return iEugene.getAge();
    }
}
