package net.reindiegames.lib.util.interfaces;

import java.util.UUID;

/**
 * Marks any Object that owns a {@link UUID} as an Identifier.
 *
 * @author Nils
 * @version Valid (Last Change: 04.05.2017)
 * @since 04.05.2017
 */
public interface Identifiable {
    /**
     * @return Returns a generic {@link UUID}.<br>
     * This method can be overloaded by other methods like {@code .getUniqueId(...)} or {@code .getParentId(...)}. <br>
     * Such method should invoke this method in order to keep the Structure consistent.
     */
    public abstract UUID getGenericId();
}
