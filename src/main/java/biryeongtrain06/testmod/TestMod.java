package biryeongtrain06.testmod;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestMod implements ModInitializer {
    public static String MOD_ID = "qf_test_mod";
    final public static Logger debugLogger = LogManager.getLogger("Qf TestMod Debug");

    @Override
    public void onInitialize() {
        debugLogger.info("Mod is successfully loaded! Hello World!");
    }
}
