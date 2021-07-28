package cn.rukkit.config;

public class RukkitConfig extends BaseConfig
{
	public String serverUser = "RUKKIT";
	public String welcomeMsg = "Welcome to Rukkit server, %s!";
	public String serverMotd = "My Rukkit server";
	public int serverPort = 5123;
	public int maxPlayer = 10;
	public int gameVersion = 143;
	public int maxWatcher = 5;
	public int minStartPlayer = 4;
	public boolean singlePlayerMode = false;
	public boolean isDebug = true;
	public boolean onlineMode = false;
	public String unitPath = "unitmeta.conf";
	public String logPath = "/sdcard/rukkit-error.log";
	public int maxPacketFrame = 8192;
	public String UUID = "00000000-0000-0000-0000-000000000000";
	//private String configName = "rukkit.yml";
	
	public RukkitConfig() {
		this.configName = "rukkit.yml";
	}
}