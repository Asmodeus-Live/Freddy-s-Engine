package org.asmodeus.engine;

import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;

/**
 * This just a settings class
 */
public class Parameter {
    private static void set(int param, int flag){
            if (Core.currentAPI == "GL"){
                glfwWindowHint(param, flag);
            }
    }

    public class Key{
        public static final int ESCAPE = GLFW_KEY_ESCAPE;
        public static final int SPACE = GLFW_KEY_SPACE;
        public static final int COMMA = GLFW_KEY_COMMA;
        public static final int ENTER = GLFW_KEY_ENTER;
        public static final int END = GLFW_KEY_END;
        public static final int BACKSPACE = GLFW_KEY_BACKSPACE;
        public static final int DELETE = GLFW_KEY_DELETE;
        public static final int SHIFT = GLFW_KEY_LEFT_SHIFT;
        public static final int CONTROL = GLFW_KEY_LEFT_CONTROL;
        public static final int ALT = GLFW_KEY_LEFT_ALT;
        public static final int SUPER = GLFW_KEY_LEFT_SUPER;
        public static final int APOSTROPHE = GLFW_KEY_APOSTROPHE;
        public static final int BACKSLASH = GLFW_KEY_BACKSLASH;
        public static final int CAPS_LOCK = GLFW_KEY_CAPS_LOCK;
        public static final int DOWN = GLFW_KEY_DOWN;
        public static final int EQUAL = GLFW_KEY_EQUAL;
        public static final int GRAVE_ACCENT = GLFW_KEY_GRAVE_ACCENT;
        public static final int HOME = GLFW_KEY_HOME;
        public static final int INSERT = GLFW_KEY_INSERT;
        public static final int MENU = GLFW_KEY_MENU;
        public static final int PAGE_DOWN = GLFW_KEY_PAGE_DOWN;
        public static final int LEFT = GLFW_KEY_LEFT;
        public static final int PAGE_UP = GLFW_KEY_PAGE_UP;
        public static final int LAST = GLFW_KEY_LAST;
        public static final int MINUS = GLFW_KEY_MINUS;
        public static final int PAUSE = GLFW_KEY_PAUSE;
        public static final int PRINT_SCREEN = GLFW_KEY_PRINT_SCREEN;
        public static final int RIGHT = GLFW_KEY_RIGHT;
        public static final int UNKNOWN = GLFW_KEY_UNKNOWN;
        public static final int TAB = GLFW_KEY_TAB;
        public static final int SLASH = GLFW_KEY_SLASH;

        public static final int F1 = GLFW_KEY_F1;
        public static final int F2 = GLFW_KEY_F2;
        public static final int F3 = GLFW_KEY_F3;
        public static final int F4 = GLFW_KEY_F4;
        public static final int F5 = GLFW_KEY_F5;
        public static final int F6 = GLFW_KEY_F6;
        public static final int F7 = GLFW_KEY_F7;
        public static final int F8 = GLFW_KEY_F8;
        public static final int F9 = GLFW_KEY_F9;
        public static final int F10 = GLFW_KEY_F10;
        public static final int F11 = GLFW_KEY_F11;
        public static final int F12 = GLFW_KEY_F12;
        public static final int F13 = GLFW_KEY_F13;
        public static final int F14 = GLFW_KEY_F14;
        public static final int F15 = GLFW_KEY_F15;
        public static final int F16 = GLFW_KEY_F16;
        public static final int F17 = GLFW_KEY_F17;
        public static final int F18 = GLFW_KEY_F18;
        public static final int F19 = GLFW_KEY_F19;
        public static final int F20 = GLFW_KEY_F20;
        public static final int F21 = GLFW_KEY_F21;
        public static final int F22 = GLFW_KEY_F22;
        public static final int F23 = GLFW_KEY_F23;
        public static final int F24 = GLFW_KEY_F24;
        public static final int F25 = GLFW_KEY_F25;

        public static final int NUM_0 = GLFW_KEY_0;
        public static final int NUM_1 = GLFW_KEY_1;
        public static final int NUM_2 = GLFW_KEY_2;
        public static final int NUM_3 = GLFW_KEY_3;
        public static final int NUM_4 = GLFW_KEY_4;
        public static final int NUM_5 = GLFW_KEY_5;
        public static final int NUM_6 = GLFW_KEY_6;
        public static final int NUM_7 = GLFW_KEY_7;
        public static final int NUM_8 = GLFW_KEY_8;
        public static final int NUM_9 = GLFW_KEY_9;

        public static final int A = GLFW_KEY_A;
        public static final int B = GLFW_KEY_B;
        public static final int C = GLFW_KEY_C;
        public static final int D = GLFW_KEY_D;
        public static final int E = GLFW_KEY_E;
        public static final int F = GLFW_KEY_F;
        public static final int G = GLFW_KEY_G;
        public static final int H = GLFW_KEY_H;
        public static final int I = GLFW_KEY_I;
        public static final int J = GLFW_KEY_J;
        public static final int K = GLFW_KEY_K;
        public static final int L = GLFW_KEY_L;
        public static final int M = GLFW_KEY_M;
        public static final int N = GLFW_KEY_N;
        public static final int O = GLFW_KEY_O;
        public static final int P = GLFW_KEY_P;
        public static final int Q = GLFW_KEY_Q;
        public static final int R = GLFW_KEY_R;
        public static final int S = GLFW_KEY_S;
        public static final int T = GLFW_KEY_T;
        public static final int U = GLFW_KEY_U;
        public static final int V = GLFW_KEY_V;
        public static final int W = GLFW_KEY_W;
        public static final int X = GLFW_KEY_X;
        public static final int Y = GLFW_KEY_Y;
        public static final int Z = GLFW_KEY_Z;
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
    public class ResetParameter{
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