package org.asmodeus;

import org.asmodeus.engine.Event;
import org.asmodeus.engine.Parameter;
import org.asmodeus.engine.Project;
import org.asmodeus.engine.Render;


public class Main extends Project implements AutoCloseable, Runnable {

    private long windowHandle;

    public static void main(String... args) {
        try (Main main = new Main()) {
            main.run();
        }
    }

    public void app(){
        windowHandle = init(windowHandle);
        

        Parameter.ResetParameter.turn();
        Parameter.Resizable.turn(false);

        windowHandle = Render.Window.restart(windowHandle, 1280, 720, "App");
        Parameter.Background.color(1.0f, 0.1f, 0.1f, 0.5f);
    }

    public void run() {
        app();
        loop();
    }

    @Override
    protected void loop() {
        while (!Render.Window.should_close(windowHandle)) {
            Render.clear(Parameter.GL_buffers.color | Parameter.GL_buffers.depth);
            Render.swap(windowHandle);
            Event.poll();
        }
    }

    @Override
    public void close() {
        close(windowHandle);
    }
}
