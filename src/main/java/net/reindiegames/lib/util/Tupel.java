package net.reindiegames.lib.util;

/**
 * A Tupel that ties two given Values together.
 *
 * @param <F>
 *         The generic Type of the first Value.
 * @param <S>
 *         The generic Type of the second Value.
 *
 * @author Nils
 * @version Not Tested (Last Change: 04.05.2017)
 * @since 04.05.2017
 */
public class Tupel<F, S> {
    private F first;
    private S second;
    private boolean mutable;

    private Tupel(F first, S second, boolean mutable) {
        this.first = first;
        this.second = second;
        this.mutable = mutable;
    }

    /**
     * Construct a new mutable Tupel with the given Values.
     *
     * @param first
     *         The first Value that will be applied to the constructed Tupel.
     * @param second
     *         The second Value that will be applied to the constructed Tupel.
     * @param <F>
     *         The generic Type of the first Value.
     * @param <S>
     *         The generic Type of the second Value.
     *
     * @return Returns the constructed Tupel containing the given Values.
     */
    public static <F, S> Tupel<F, S> mutable(F first, S second) {
        return new Tupel<F, S>(first, second, true);
    }

    /**
     * Construct a new immutable Tupel with the given Values.
     *
     * @param first
     *         The first Value that will be applied to the constructed Tupel.
     * @param second
     *         The second Value that will be applied to the constructed Tupel.
     * @param <F>
     *         The generic Type of the first Value.
     * @param <S>
     *         The generic Type of the second Value.
     *
     * @return Returns the constructed Tupel containing the given Values.
     */
    public static <F, S> Tupel<F, S> immutable(F first, S second) {
        final Tupel<F, S> tupel = Tupel.mutable(first, second);
        tupel.mutable = false;

        return tupel;
    }

    /**
     * @return Retrieves the first Value of the Tupel.
     */
    public F first() {
        return first;
    }

    /**
     * Sets the first Value of this Tupel to the given Value.
     *
     * @param first
     *         The given Value.
     *
     * @throws IllegalStateException
     *         The Tupel is immutable
     */
    public void setFirst(F first) {
        if (!mutable) throw new IllegalStateException("Cannot assign first Value! Tupel is immutable!");
        this.first = first;
    }

    /**
     * @return Retrieves the second Value of the Tupel.
     */
    public S second() {
        return second;
    }

    /**
     * Sets the second Value of this Tupel to the given Value.
     *
     * @param second
     *         The given Value.
     *
     * @throws IllegalStateException
     *         The Tupel is immutable
     */
    public void setSecond(S second) {
        if (!mutable) throw new IllegalStateException("Cannot assign second Value! Tupel is immutable!");
        this.second = second;
    }

    /**
     * Tests weather this Tupel is mutable.
     *
     * @return Returns TRUE if and only if this Tupel is mutable.
     */
    public boolean isMutable() {
        return mutable;
    }
}
