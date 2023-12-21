package org.asmodeus.engine;

import static org.lwjgl.glfw.GLFW.GLFW_FALSE;
import static org.lwjgl.glfw.GLFW.GLFW_KEY_ESCAPE;
import static org.lwjgl.glfw.GLFW.GLFW_RELEASE;
import static org.lwjgl.glfw.GLFW.GLFW_RESIZABLE;
import static org.lwjgl.glfw.GLFW.GLFW_TRUE;
import static org.lwjgl.glfw.GLFW.GLFW_VISIBLE;
import static org.lwjgl.glfw.GLFW.glfwDefaultWindowHints;
import static org.lwjgl.glfw.GLFW.glfwWindowHint;
import static org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_DEPTH_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.glClearColor;


/**
 * This just a settings class
 */
public class Parameters {
    private static void set(int param, int flag){
            if (Core.currentAPI == "GL"){
                glfwWindowHint(param, flag);
            }
    }

    public class gl_keys{
        public static final int ESCAPE = GLFW_KEY_ESCAPE;
    }

    public class gl_action{
        public static final int RELEASE = GLFW_RELEASE;
    }

    /**
    * Give you an ability to resize window.
    */
    public class resizable{
         /**
        * @param flag use true or false to turn ON or turn OFF parameter.
        */
        public static void turn(boolean flag){
                if(flag){
                    set(GLFW_RESIZABLE, GLFW_TRUE);
                } else {
                    set(GLFW_RESIZABLE, GLFW_FALSE);
                }
        }
    }


    /**
     * Shows to you a window.
     */
    public class visible{
         /**
        * @param flag use true or false to turn ON or turn OFF parameter.
        */
        public static void turn(boolean flag){
                if(flag){
                    set(GLFW_VISIBLE, GLFW_TRUE);
                } else {
                    set(GLFW_VISIBLE, GLFW_FALSE);
                }
        }
    }

    /**
     * Shows to you a window.
     */
    public class resetWinHints{
        public static void turn(){
            glfwDefaultWindowHints();
        }
    }

    /**
     * Sets background color.
     */
    public class background{
        public static void color(float red, float green, float blue, float alpha){
            glClearColor(red, green, blue, alpha);
        }
    }

    /**
     * OpenGL buffers.
     */
    public class gl_buffers{
        public static int color = GL_COLOR_BUFFER_BIT;
        public static int depth = GL_DEPTH_BUFFER_BIT;
    }

}