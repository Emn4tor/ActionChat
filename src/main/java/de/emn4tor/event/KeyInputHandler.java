package de.emn4tor.event;

import de.emn4tor.ActionChat;
import de.emn4tor.gui.ActionChatMenu;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {
    public static final String KEY_CATEGORY_ACTIONCHAT = "key.category.actionchat";
    public static final String KEY_OPEN_GUI = "key.actionchat.open_gui";
    public static KeyBinding openGuiKey;

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if (openGuiKey.isPressed()) {
                client.setScreen(new ActionChatMenu());
                ActionChat.LOGGER.info("Opended ActionChatMenu");
            }
        });
    }

    public static void registerKeys() {
        openGuiKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            KEY_OPEN_GUI,
            GLFW.GLFW_KEY_G,
            KEY_CATEGORY_ACTIONCHAT
        ));
        registerKeyInputs();
    }
}
