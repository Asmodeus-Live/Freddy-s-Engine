package org.asmodeus.engine;

import static org.lwjgl.glfw.Callbacks.glfwFreeCallbacks;
import static org.lwjgl.glfw.GLFW.*;

import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.lwjgl.glfw.GLFWKeyCallbackI;

public class Event {
    public class GL_key{
        public static void callback(long window, GLFWKeyCallbackI call){
            glfwSetKeyCallback(window, call);
        }
    }

    public static void gl_error(GLFWErrorCallbackI call){
        glfwSetErrorCallback(call).free();
    }

    public static void free_callbacks(long window){
        if(Core.currentAPI == "GL"){
            glfwFreeCallbacks(window);
        }
    }

    public static void poll(){
        if(Core.currentAPI == "GL"){
            glfwPollEvents();   
        }
    }
}
