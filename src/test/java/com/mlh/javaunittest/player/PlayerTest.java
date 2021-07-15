package com.mlh.javaunittest.player;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

public class PlayerTest {

    @Test
    public void looses_when_dice_number_is_to_low() {
        /*
          Esta es la forma normal de probar pero como el dado devuelve un valor aleatorio no es posible
          controlar el resultado para saber si el test funciona o no.
          Se muestra implementación de mockito para simular

        Dice dice = new Dice(6);
        Player player = new Player(dice, 3);
        Assert.assertEquals(false, player.play());
         */

        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);

        Player player = new Player(dice, 3);
        Assert.assertFalse(player.play());
    }

    @Test
    public void wins_when_dice_number_is_big() {
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(4);

        Player player = new Player(dice, 3);
        Assert.assertTrue(player.play());
    }
}