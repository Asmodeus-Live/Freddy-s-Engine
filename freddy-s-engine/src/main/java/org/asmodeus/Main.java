package org.asmodeus;

import org.asmodeus.engine.Core;
import org.asmodeus.engine.Event;
import org.asmodeus.engine.Parameters;
import org.asmodeus.engine.Render;


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

        Event.gl_key.callback(windowHandle, (windowHandle, key, scancode, action, mods) -> {
            if (key == Parameters.gl_keys.ESCAPE && action == Parameters.gl_action.RELEASE) {
                Render.window.set_should_close(windowHandle, true);
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
        while (!Render.window.should_close(windowHandle)) {
            Render.clear(Parameters.gl_buffers.color | Parameters.gl_buffers.depth);
            Render.swap(windowHandle);
            Event.poll();
        }
    }

    @Override
    public void close() {
        Event.free_callbacks(windowHandle);
        Render.window.destroy(windowHandle);
        Render.terminate();
        Event.gl_error(null);
    }
}
