package org.asmodeus.engine;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL.createCapabilities;
import static org.lwjgl.opengl.GL11.glClear;
import static org.lwjgl.system.MemoryStack.stackPush;
import static org.lwjgl.system.MemoryUtil.NULL;

import java.nio.IntBuffer;

import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.glfw.GLFWImage.Buffer;
import org.lwjgl.system.MemoryStack;

public class Render {

    public class Window{
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

        /**
         * Destroy a window.
         * @param window takes the window as a variable.
         */
        public static void destroy(long window){
            if (Core.currentAPI == "GL"){
                glfwDestroyWindow(window);
            }
        }

        /**
         * Center a window.
         * @param window takes the window as a variable.
         */
        public static void center(long window){
            if(Core.currentAPI == "GL"){
                try (MemoryStack stack = stackPush()) {
                    IntBuffer pWidth = stack.mallocInt(1);
                    IntBuffer pHeight = stack.mallocInt(1);
                    glfwGetWindowSize(window, pWidth, pHeight);
                    GLFWVidMode vidMode = glfwGetVideoMode(glfwGetPrimaryMonitor());
                    glfwSetWindowPos(
                            window,
                            (vidMode.width() - pWidth.get(0)) / 2,
                            (vidMode.height() - pHeight.get(0)) / 2
                    );
                }
            }
        }

        public static void set_should_close(long window, boolean flag){
            if (Core.currentAPI == "GL"){
                glfwSetWindowShouldClose(window, flag);
            }
        }

        public static boolean should_close(long window){
            if (Core.currentAPI == "GL"){
                return glfwWindowShouldClose(window);
            } else{
                return false;
            }
        }

        /**
         * Shows a window.
         * @param window takes the window as a variable.
         */
        public static void show(long window){
            if(Core.currentAPI == "GL"){
                glfwShowWindow(window);
            }
        }
    
        public static void icon(long window, Buffer image){
            glfwSetWindowIcon(window, image);
        }

    }

    /**
     * Setting window for render.
     * @param window takes the window as a variable.
     */
    public static void current(long window){
        if(Core.currentAPI == "GL"){
            glfwMakeContextCurrent(window);
        }
    }
    
    /**
     * Setting interval for swapping.
     * @param count how many times it will do this.
     */
    public static void swap_interval(int count){
        if(Core.currentAPI == "GL"){
            glfwSwapInterval(count);
        }
    }

    /**
     * Creates render capabilities.
     */
    public static void create_capabilities(){
        if(Core.currentAPI == "GL"){
            createCapabilities();
        }
    }

    /**
     * Swaps buffers.
     * @param window takes the window as a variable.
     */
    public static void swap(long window){
           if(Core.currentAPI == "GL"){
               glfwSwapBuffers(window);
           }
    }

    /**
     * Clears buffers.
     * @param mask what buffers we will clean
     */
    public static void clear(int mask){
        if(Core.currentAPI == "GL"){
            glClear(mask);
        }
    }

    /**
     * Ends all tasks.
     */
    public static void terminate(){
        if(Core.currentAPI == "GL"){
            glfwTerminate();
        }
    }
}
