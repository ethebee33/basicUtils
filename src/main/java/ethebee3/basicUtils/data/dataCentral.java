package ethebee3.basicUtils.data;

import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public class dataCentral {

    private JavaPlugin plugin;

    private YamlConfiguration yaml;



    public static void dataCentralLoad(JavaPlugin plugin) {
        chunkData.chunkData(plugin);
    }

    public static boolean makeYml(File temp) {
        try {
            temp.createNewFile();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
