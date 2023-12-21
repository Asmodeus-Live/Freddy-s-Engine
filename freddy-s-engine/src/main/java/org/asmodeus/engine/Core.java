package org.asmodeus.engine;

import static org.lwjgl.glfw.GLFW.glfwInit;
import static org.lwjgl.glfw.GLFWErrorCallback.createPrint;
import static org.lwjgl.opengl.GL11.GL_VERSION;
import static org.lwjgl.opengl.GL11.glGetString;

import org.lwjgl.Version;

public class Core {
    /**
     * Now I have only OpenGL = "GL", but in future I am going add Vulkan = "VK"
     */
    public static String currentAPI = "GL";

    public Core(){
        createPrint(System.err).set();
        System.out.println("Starting LWJGL " + Version.getVersion());
        if (!glfwInit()) {
            throw new IllegalStateException("Unable to initialize GLFW");
        }
    }

    public static void gl_info(){
        System.out.println("OpenGL: " + glGetString(GL_VERSION));
    }
}
