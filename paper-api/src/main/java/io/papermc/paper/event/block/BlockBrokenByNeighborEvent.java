package io.papermc.paper.event.block;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

public class BlockBrokenByNeighborEvent extends PlayerEvent {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final @NotNull Player player;
    private final @NotNull Block sourceBlock;
    private final Block brokenBlock;

    @ApiStatus.Internal
    public BlockBrokenByNeighborEvent(final @NotNull Player player, final @NotNull Block sourceBlock, final Block brokenBlock) {
        super(player);
        this.player = player;
        this.sourceBlock = sourceBlock;
        this.brokenBlock = brokenBlock;
    }

    public @NotNull Block getSourceBlock() {
        return sourceBlock;
    }

    public Block getBrokenBlock() {
        return brokenBlock;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
