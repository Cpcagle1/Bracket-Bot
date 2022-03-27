package test.multiplayer; 

import multiplayer.Bracket;
import multiplayer.Player;
import multiplayer.Randomizer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.io.File;
import java.util.ArrayList;

/** 
* Bracket Tester. 
* 
* @author <Authors name> 
* @since <pre>Mar 14, 2022</pre> 
* @version 1.0 
*/ 
public class BracketTest {
    private File testFile = new File("src/multiplayer/resources/ListOfPlayers");

    @Before
    public void before() throws Exception {
                                              }

    @After
    public void after() throws Exception {
} 

    @Test
    public void testGetPlayers() throws Exception {
        Bracket bracket = new Bracket();
        bracket.setPlayers(testFile);
        Assert.assertEquals(29, bracket.getPlayers().size());
    }

    @Test
    public void testGetPlayersReturnsEmptyList() throws Exception {
        Bracket bracket= new Bracket();
        bracket.setPlayers(new File("src/multiplayer/resources/EmptyList"));
        Assert.assertEquals(0, bracket.getPlayers().size());
    }

} 
