package mx.iteso;


/**
 * Created by Juan on 29/11/2015.
 */
import mx.iteso.facade.*;
import mx.iteso.facade.impl.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by Cam on 11/29/2015.
 */
public class TestVideoGameFacade {

    //Components
    TV tv;
    GameConsole console;
    GameController controller;
    SoundSystem soundSystem;
    Router router;
    Lights lights;
    //End components
    VideoGameFacade facade;

    @Before
    public void test() {
        tv = mock(TV.class);
        console = mock(GameConsole.class);
        controller = mock(GameController.class);
        soundSystem = mock(SoundSystem.class);
        router = mock(Router.class);
        lights = mock(Lights.class);

        facade = new VideoGameFacade(tv, console, controller, soundSystem, router, lights);
    }

    @Test
    public void TestPlayOnlineGame()
    {
        facade.playOnlineGame("Call of duty advanced warfare XXIV - Black Ops Sub 3");
        //Assert component integrity by calls
        verify(tv, times(1)).on();
        verify(tv, times(1)).toHDMI();
        verify(console, times(1)).on();
        verify(controller, times(1)).on();
        verify(console,times(1)).insertGame(any(VideoGame.class));
        verify(soundSystem, times(1)).on();
        verify(soundSystem, times(1)).toOpticalEntry();
        verify(router, times(1)).on();
        verify(router, times(1)).checkInternet();
        verify(lights, times(1)).off();
    }

    @Test
    public void TestStopPlayingGame()
    {
        facade.stopPlayingGame();

        verify(lights, times(1)).on();
        verify(tv, times(1)).off();
        verify(controller, times(1)).off();
        verify(console, times(1)).off();
        verify(soundSystem, times(1)).off();
        verify(router, times(1)).off();
    }
}