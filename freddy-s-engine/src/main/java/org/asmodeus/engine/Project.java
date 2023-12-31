package org.asmodeus.engine;

abstract public class Project {

    private static final String windowTitle = "App";
    private static final int windowWidth = 640;
    private static final int windowHeight = 480;

    public long init(long window) {
        new Core();
        Parameter.ResetParameter.turn();
        Parameter.Resizable.turn(true);
        window = Render.Window.create(window, windowWidth, windowHeight, windowTitle);

        Event.GL_key.callback(window, (windowHandle, key, scancode, action, mods) -> {
            if (key == Parameter.Key.ESCAPE && action == Parameter.GL_action.RELEASE) {
                Render.Window.set_should_close(windowHandle, true);
            }
        });

        Render.Window.center(window);
        Render.current(window);
        Render.swap_interval(1);
        Render.Window.show(window);
        Render.create_capabilities();
        Core.gl_info();
        Parameter.Background.color(0.0f, 0.0f, 0.0f, 0.0f);

        return window;
    }

    protected void loop(){};

    public void close(long window) {
        Event.free_callbacks(window);
        Render.Window.destroy(window);
        Render.terminate();
        Event.gl_error(null);
    }
}
