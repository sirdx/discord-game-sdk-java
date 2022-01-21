package io.github.deathbeam.discordgamesdk;
import com.sun.jna.Callback;
import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import java.util.Arrays;
import java.util.List;
/**
 * <i>native declaration : discord_game_sdk.h:539</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class IDiscordVoiceManager extends Structure {
	/** C type : get_input_mode_callback* */
	public IDiscordVoiceManager.get_input_mode_callback get_input_mode;
	/** C type : set_input_mode_callback* */
	public IDiscordVoiceManager.set_input_mode_callback set_input_mode;
	/** C type : is_self_mute_callback* */
	public IDiscordVoiceManager.is_self_mute_callback is_self_mute;
	/** C type : set_self_mute_callback* */
	public IDiscordVoiceManager.set_self_mute_callback set_self_mute;
	/** C type : is_self_deaf_callback* */
	public IDiscordVoiceManager.is_self_deaf_callback is_self_deaf;
	/** C type : set_self_deaf_callback* */
	public IDiscordVoiceManager.set_self_deaf_callback set_self_deaf;
	/** C type : is_local_mute_callback* */
	public IDiscordVoiceManager.is_local_mute_callback is_local_mute;
	/** C type : set_local_mute_callback* */
	public IDiscordVoiceManager.set_local_mute_callback set_local_mute;
	/** C type : get_local_volume_callback* */
	public IDiscordVoiceManager.get_local_volume_callback get_local_volume;
	/** C type : set_local_volume_callback* */
	public IDiscordVoiceManager.set_local_volume_callback set_local_volume;
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface get_input_mode_callback extends Callback {
		int apply(IDiscordVoiceManager manager, DiscordInputMode input_mode);
	};
	/** <i>native declaration : discord_game_sdk.h:541</i> */
	public interface set_input_mode_callback_callback_callback extends Callback {
		void apply(Pointer callback_data, int result);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface set_input_mode_callback extends Callback {
		void apply(IDiscordVoiceManager manager, DiscordInputMode.ByValue input_mode, Pointer callback_data, IDiscordVoiceManager.set_input_mode_callback_callback_callback callback);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface is_self_mute_callback extends Callback {
		int apply(IDiscordVoiceManager manager, Pointer mute);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface set_self_mute_callback extends Callback {
		int apply(IDiscordVoiceManager manager, byte mute);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface is_self_deaf_callback extends Callback {
		int apply(IDiscordVoiceManager manager, Pointer deaf);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface set_self_deaf_callback extends Callback {
		int apply(IDiscordVoiceManager manager, byte deaf);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface is_local_mute_callback extends Callback {
		int apply(IDiscordVoiceManager manager, long user_id, Pointer mute);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface set_local_mute_callback extends Callback {
		int apply(IDiscordVoiceManager manager, long user_id, byte mute);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface get_local_volume_callback extends Callback {
		int apply(IDiscordVoiceManager manager, long user_id, Pointer volume);
	};
	/** <i>native declaration : discord_game_sdk.h</i> */
	public interface set_local_volume_callback extends Callback {
		int apply(IDiscordVoiceManager manager, long user_id, byte volume);
	};
	public IDiscordVoiceManager() {
		super();
	}
	protected List<String> getFieldOrder() {
		return Arrays.asList("get_input_mode", "set_input_mode", "is_self_mute", "set_self_mute", "is_self_deaf", "set_self_deaf", "is_local_mute", "set_local_mute", "get_local_volume", "set_local_volume");
	}
	public IDiscordVoiceManager(Pointer peer) {
		super(peer);
	}
	public static class ByReference extends IDiscordVoiceManager implements Structure.ByReference {
		
	};
	public static class ByValue extends IDiscordVoiceManager implements Structure.ByValue {
		
	};
}
