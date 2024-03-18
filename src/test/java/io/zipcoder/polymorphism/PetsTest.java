package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetsTest {

    // Test Dog
    @Test
    public void testSpeak(){
        Dog doggo = new Dog("Rex");
        String expected = "Woof";

        String actual = doggo.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInheritance(){
        Dog doggo = new Dog("Luke");

        Assert.assertTrue(doggo instanceof Pet);
    }

    @Test
    public void testConstructor(){
        Dog doggo = new Dog("Stormageddon");
        String expected = "Stormageddon";

        String actual = doggo.getName();

        Assert.assertTrue(expected, actual);
    }

    // Test Cats

    @Test
    public void testInheritanceCat(){
        Cat cat = new Cat("Luke");

        Assert.assertTrue(cat instanceof Pet);
    }

    @Test
    public void testConstructorCat(){
        Cat cato = new Cat("Stormageddon");
        String expected = "Stormageddon";

        String actual = cato.getName();

        Assert.assertTrue(expected, actual);
    }

    @Test
    public void testSpeak(){
        Cat cat = new Cat("Rex");
        String expected = "Meow";

        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }

    // Test Macaw

    @Test
    public void testInheritanceCat(){
        Macaw bird = new Macaw("Luke");

        Assert.assertTrue(bird instanceof Pet);
    }

    @Test
    public void testConstructorCat(){
        Macaw bird = new Macaw("Luke");
        String expected = "Stormageddon";

        String actual = bird.getName();

        Assert.assertTrue(expected, actual);
    }

    @Test
    public void testSpeak(){
        Macaw bird = new Macaw("Luke");
        String expected = "Meow";

        String actual = bird.speak();

        Assert.assertEquals(expected, actual);
    }


}
