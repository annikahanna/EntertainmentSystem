package test;

import org.junit.Test;
import state.EntertainementSystemState;
import state.StatusZero;
import static org.junit.Assert.*;

public class UnitTest {

    @Test
    public void CheckIfPromoteChangesStatus(){

        EntertainementSystemState entertainementSystemState = new EntertainementSystemState();
        entertainementSystemState.setState(new StatusZero());                                   //  State Zero is set. toString returns zero


        entertainementSystemState.promote();                                                    // Method should change State to StateOne
        assertEquals("One",entertainementSystemState.getState().toString());
    }
}
