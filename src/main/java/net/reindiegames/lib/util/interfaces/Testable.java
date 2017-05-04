package net.reindiegames.lib.util.interfaces;

import net.reindiegames.lib.util.Tupel;

/**
 * Marks any Object that can be checked if its state is correct.
 *
 * @author Nils
 * @version Valid (Last Change: 04.05.2017)
 * @since 04.05.2017
 */
public interface Testable {
    /**
     * Checks the current state of this Object.
     *
     * @return Returns a {@link Tupel} as a Result. <br>
     * The first Element represents if the test failed. The second Element represents an Error message if the Test has failed.
     */
    public abstract Tupel<Boolean, String> test();
}
