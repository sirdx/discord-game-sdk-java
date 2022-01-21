package io.github.deathbeam.discordgamesdk;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : discord_game_sdk.h:353</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class IDiscordUserEvents extends Structure {
	/** C type : on_current_user_update_callback* */
	public IDiscordUserEvents.on_current_user_update_callback on_current_user_update;
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface on_current_user_update_callback extends Callback {
		void apply(Pointer event_data);
	};
	public IDiscordUserEvents() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("on_current_user_update");
	}
	/** @param on_current_user_update C type : on_current_user_update_callback* */
	public IDiscordUserEvents(IDiscordUserEvents.on_current_user_update_callback on_current_user_update) {
		super();
		this.on_current_user_update = on_current_user_update;
	}
	public IDiscordUserEvents(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends IDiscordUserEvents implements Structure.ByReference {
		
	};
	public static class ByValue extends IDiscordUserEvents implements Structure.ByValue {
		
	};
}
