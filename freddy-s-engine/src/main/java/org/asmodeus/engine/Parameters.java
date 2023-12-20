package org.asmodeus.engine;

import static org.lwjgl.glfw.GLFW.GLFW_FALSE;
import static org.lwjgl.glfw.GLFW.GLFW_RESIZABLE;
import static org.lwjgl.glfw.GLFW.GLFW_TRUE;
import static org.lwjgl.glfw.GLFW.GLFW_VISIBLE;
import static org.lwjgl.glfw.GLFW.glfwDefaultWindowHints;
import static org.lwjgl.glfw.GLFW.glfwWindowHint;


/**
 * This just a settings class
 */
public class Parameters {
    private static void set(int param, int flag){
            if (Core.currentAPI == "GL"){
                glfwWindowHint(param, flag);
            }
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

}