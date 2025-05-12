
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class StatPlugin extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Stat Plugin Enabled!");
        getServer().getPluginManager().registerEvents(new StatListener(), this);
    }

    public void givePoints(Player player, int points) {
        // 포인트 지급 로직
        int currentPoints = getPlayerPoints(player);
        setPlayerPoints(player, currentPoints + points);
    }

    public int getPlayerPoints(Player player) {
        // 플레이어의 포인트를 가져오는 로직
        return 0; // 예시로 0 반환
    }

    public void setPlayerPoints(Player player, int points) {
        // 플레이어의 포인트를 설정하는 로직
    }
}
