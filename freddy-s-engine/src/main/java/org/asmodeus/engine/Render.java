package org.asmodeus.engine;

import static org.lwjgl.glfw.GLFW.glfwCreateWindow;
import static org.lwjgl.system.MemoryUtil.NULL;

public class Render {

    public class window{
        /**
         * Creates a window.
         * @param window takes the window as a variable.
         */
        public static long create(long window, int width, int height, String title){
            if (Core.currentAPI == "GL"){
                return window = glfwCreateWindow(width, height, title, NULL, NULL);
            } else{
                return 0;
            }
        }
    }
    
}
