package org.asmodeus.engine;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;

/**
 * This just a settings class
 */
public class Parameters {
    private static void set(int param, int flag){
            if (Core.currentAPI == "GL"){
                glfwWindowHint(param, flag);
            }
    }

    public class Keys{
        public static final int ESCAPE = GLFW_KEY_ESCAPE;
        public static final int A = GLFW_KEY_A;
        public static final int B = GLFW_KEY_B;
        public static final int C = GLFW_KEY_C;
        

        public static final int W = GLFW_KEY_W;
    }

    public class GL_action{
        public static final int RELEASE = GLFW_RELEASE;
    }

    /**
    * Give you an ability to resize window.
    */
    public class Resizable{
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
    public class Visible{
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
    public class ResetParameters{
        public static void turn(){
            glfwDefaultWindowHints();
        }
    }

    /**
     * Sets background color.
     */
    public class Background{
        public static void color(float red, float green, float blue, float alpha){
            glClearColor(red, green, blue, alpha);
        }
    }

    /**
     * OpenGL buffers.
     */
    public class GL_buffers{
        public static int color = GL_COLOR_BUFFER_BIT;
        public static int depth = GL_DEPTH_BUFFER_BIT;
    }

}