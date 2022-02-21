package club.thom.crystalhollowsdupechecker;

import club.thom.crystalhollowsdupechecker.listeners.GuiEventListener;
import club.thom.crystalhollowsdupechecker.listeners.ItemTooltipListener;
import club.thom.crystalhollowsdupechecker.packets.ContainerSetItemListener;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(
        modid = Main.MOD_ID,
        version = Main.VERSION,
        certificateFingerprint = Main.SIGNATURE
)
public class Main {

    public static final String MOD_ID = "NotEnoughCoins";
    // This is replaced by build.gradle with the real version name
    public static final String VERSION = "1.9.92";
    // Signature to compare to, so you know this is an official release of TEM.
    public static final String SIGNATURE = "32d142d222d0a18c9d19d5b88917c7477af1cd28";

    @EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new ItemTooltipListener());
        MinecraftForge.EVENT_BUS.register(new GuiEventListener());
        MinecraftForge.EVENT_BUS.register(new ContainerSetItemListener());
    }
}
