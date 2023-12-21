package org.asmodeus;

import org.asmodeus.engine.Core;
import org.asmodeus.engine.Parameters;
import org.asmodeus.engine.Render;
import static org.lwjgl.glfw.Callbacks.glfwFreeCallbacks;
import static org.lwjgl.glfw.GLFW.*;

public class Main implements AutoCloseable, Runnable {

    private static final String windowTitle = "Freddy's Engine";
    private static final int windowWidth = 640;
    private static final int windowHeight = 480;
    private long windowHandle;

    public static void main(String... args) {
        try (Main main = new Main()) {
            main.run();
        }
    }

    public void run() {
        init();
        loop();
    }

    public void init() {
        new Core();

        Parameters.resetWinHints.turn();

        Parameters.resizable.turn(true);
        Parameters.visible.turn(true);

        windowHandle = Render.window.create(windowHandle, windowWidth, windowHeight, windowTitle);

        glfwSetKeyCallback(windowHandle, (windowHandle, key, scancode, action, mods) -> {
            if (key == GLFW_KEY_ESCAPE && action == GLFW_RELEASE) {
                glfwSetWindowShouldClose(windowHandle, true);
            }
        });
        Render.window.center(windowHandle);
        Render.current(windowHandle);
        Render.swap_interval(1);
        Render.window.show(windowHandle);
        Render.create_capabilities();
        Core.gl_info();
        Parameters.background.color(0.0f, 0.0f, 0.2f, 0.0f);
    }

    public void loop() {
        while (!glfwWindowShouldClose(windowHandle)) {
            Render.clear(Parameters.gl_buffers.color | Parameters.gl_buffers.depth);
            Render.swap(windowHandle);
            glfwPollEvents();
        }
    }

    @Override
    public void close() {
        glfwFreeCallbacks(windowHandle);
        Render.window.destroy(windowHandle);
        Render.terminate();
        glfwSetErrorCallback(null).free();
    }
}
