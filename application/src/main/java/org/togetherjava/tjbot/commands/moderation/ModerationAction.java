package org.togetherjava.tjbot.commands.moderation;

import org.jetbrains.annotations.NotNull;

/**
 * All available moderation actions.
 */
public enum ModerationAction {
    /**
     * When a user bans another user.
     */
    BAN("banned"),
    /**
     * When a user unbans another user.
     */
    UNBAN("unbanned"),
    /**
     * When a user kicks another user.
     */
    KICK("kicked"),
    /**
     * When a user mutes another user.
     */
    MUTE("muted"),
    /**
     * When a user unmutes another user.
     */
    UNMUTE("unmuted");

    private final String verb;

    /**
     * Creates an instance with the given verb
     *
     * @param verb the verb of the action, as it would be used in a sentence, such as "banned" or
     *        "kicked"
     */
    ModerationAction(@NotNull String verb) {
        this.verb = verb;
    }

    /**
     * Gets the verb of the action, as it would be used in a sentence.
     * <p>
     * Such as "banned" or "kicked"
     *
     * @return the verb of this action
     */
    public @NotNull String getVerb() {
        return verb;
    }
}