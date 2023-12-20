package org.asmodeus.engine;

import static org.lwjgl.glfw.GLFW.glfwInit;
import static org.lwjgl.glfw.GLFWErrorCallback.createPrint;

import org.lwjgl.Version;

public class Core {
    public static String currentAPI = "GL";

    public Core(){
        createPrint(System.err).set();
        System.out.println("Starting LWJGL " + Version.getVersion());
        if (!glfwInit()) {
            throw new IllegalStateException("Unable to initialize GLFW");
        }
    }
}
