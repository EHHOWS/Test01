package io.github.test01.test01;

import org.bukkit.plugin.java.JavaPlugin;

import java.time.Clock;

public final class Test01 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("PLUGIN ENABLED");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("PLUGIN DISABLED");
    }
}
