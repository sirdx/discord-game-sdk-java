package io.github.deathbeam.discordgamesdk;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import com.sun.jna.ptr.IntByReference;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : discord_game_sdk.h:556</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class IDiscordAchievementManager extends Structure {
	/** C type : set_user_achievement_callback* */
	public IDiscordAchievementManager.set_user_achievement_callback set_user_achievement;
	/** C type : fetch_user_achievements_callback* */
	public IDiscordAchievementManager.fetch_user_achievements_callback fetch_user_achievements;
	/** C type : count_user_achievements_callback* */
	public IDiscordAchievementManager.count_user_achievements_callback count_user_achievements;
	/** C type : get_user_achievement_callback* */
	public IDiscordAchievementManager.get_user_achievement_callback get_user_achievement;
	/** C type : get_user_achievement_at_callback* */
	public IDiscordAchievementManager.get_user_achievement_at_callback get_user_achievement_at;
	/** <i>native declaration : discord_game_sdk.h:557</i> */
	public interface set_user_achievement_callback_callback_callback extends Callback {
		void apply(Pointer callback_data, int result);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface set_user_achievement_callback extends Callback {
		void apply(IDiscordAchievementManager manager, long achievement_id, byte percent_complete, Pointer callback_data, IDiscordAchievementManager.set_user_achievement_callback_callback_callback callback);
	};
	/** <i>native declaration : discord_game_sdk.h:558</i> */
	public interface fetch_user_achievements_callback_callback_callback extends Callback {
		void apply(Pointer callback_data, int result);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface fetch_user_achievements_callback extends Callback {
		void apply(IDiscordAchievementManager manager, Pointer callback_data, IDiscordAchievementManager.fetch_user_achievements_callback_callback_callback callback);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface count_user_achievements_callback extends Callback {
		void apply(IDiscordAchievementManager manager, IntByReference count);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface get_user_achievement_callback extends Callback {
		int apply(IDiscordAchievementManager manager, long user_achievement_id, DiscordUserAchievement user_achievement);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface get_user_achievement_at_callback extends Callback {
		int apply(IDiscordAchievementManager manager, int index, DiscordUserAchievement user_achievement);
	};
	public IDiscordAchievementManager() {
		super();
	}
	protected List<String > getFieldOrder() {
		return Arrays.asList("set_user_achievement", "fetch_user_achievements", "count_user_achievements", "get_user_achievement", "get_user_achievement_at");
	}
	/**
	 * @param set_user_achievement C type : set_user_achievement_callback*<br>
	 * @param fetch_user_achievements C type : fetch_user_achievements_callback*<br>
	 * @param count_user_achievements C type : count_user_achievements_callback*<br>
	 * @param get_user_achievement C type : get_user_achievement_callback*<br>
	 * @param get_user_achievement_at C type : get_user_achievement_at_callback*
	 */
	public IDiscordAchievementManager(IDiscordAchievementManager.set_user_achievement_callback set_user_achievement, IDiscordAchievementManager.fetch_user_achievements_callback fetch_user_achievements, IDiscordAchievementManager.count_user_achievements_callback count_user_achievements, IDiscordAchievementManager.get_user_achievement_callback get_user_achievement, IDiscordAchievementManager.get_user_achievement_at_callback get_user_achievement_at) {
		super();
		this.set_user_achievement = set_user_achievement;
		this.fetch_user_achievements = fetch_user_achievements;
		this.count_user_achievements = count_user_achievements;
		this.get_user_achievement = get_user_achievement;
		this.get_user_achievement_at = get_user_achievement_at;
	}
	public IDiscordAchievementManager(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends IDiscordAchievementManager implements Structure.ByReference {
		
	};
	public static class ByValue extends IDiscordAchievementManager implements Structure.ByValue {
		
	};
}
