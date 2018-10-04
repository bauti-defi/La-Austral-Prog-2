package Guardian;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class GuardianTest {
    @Test
    public void test001_aGuardianShouldAcceptAPersonWithAnAgeHigherThan18(){
        Guardian<Person> guardian = new Guardian<Person>();

        Person homeless = new Homeless("Richard", 18);

        assertEquals(true, guardian.accept(homeless, homeless.getAge()));
    }

    @Test
    public void test002_aGuardianShouldRejectAPersonWithAnAgeLessThan18(){
        Guardian<Person> guardian = new Guardian<Person>();

        Person homeless = new Homeless("Richard", 17);

        assertEquals(false, guardian.accept(homeless, homeless.getAge()));
    }

    @Test
    public void test003_aGuardianShouldRejectAHomeless(){
        Guardian<Person> guardian = new Guardian<Person>();

        Person homeless = new Homeless("Richard", 17);

        assertEquals(false, guardian.accept(homeless, homeless.isInformal(), homeless.isHomeless()));
    }

    @Test
    public void test003_aGuardianShouldRejectAInformalPeople(){
        Guardian<Person> guardian = new Guardian<Person>();

        Person homeless = new Homeless("Richard", 17);

        assertEquals(false, guardian.accept(homeless, homeless.isInformal()));
    }

    @Test
    public void test004_aGuardianShouldReturnHisAcceptedHistory(){
        Guardian<Person> guardian = new Guardian<Person>();

        assertEquals(new ArrayList<>(), guardian.acceptedHistory());
    }

    @Test
    public void test005_aGuardianShouldReturnHisRejectedHistory(){
        Guardian<Person> guardian = new Guardian<Person>();

        assertEquals(new HashMap<>(), guardian.rejectedsHistory());
    }

    @Test
    public void test006_aGuardianShouldAcceptFormalPeople(){
        Guardian<Person> guardian = new Guardian<Person>();

        Person vip = new VIP("Richard", 17, false);

        assertEquals(true, guardian.accept(vip, vip.isInformal()));
    }
}