package org.asmodeus;

import org.asmodeus.engine.Event;
import org.asmodeus.engine.Parameters;
import org.asmodeus.engine.Project;
import org.asmodeus.engine.Render;


public class Main extends Project implements AutoCloseable, Runnable {

    private long windowHandle;

    public static void main(String... args) {
        try (Main main = new Main()) {
            main.run();
        }
    }

    public void run() {
        windowHandle = init(windowHandle);
        loop();
    }

    @Override
    protected void loop() {
        while (!Render.Window.should_close(windowHandle)) {
            Render.clear(Parameters.GL_buffers.color | Parameters.GL_buffers.depth);
            Render.swap(windowHandle);
            Event.poll();
        }
    }

    @Override
    public void close() {
        close(windowHandle);
    }
}
