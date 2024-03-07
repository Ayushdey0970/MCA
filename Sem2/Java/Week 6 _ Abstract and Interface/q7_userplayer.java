import java.util.*;

interface player {
    abstract void play();
}

class child implements player {
    void show() {
        System.out.println("Child Class is called");
    }

    @Override
    public void play() {
        System.out.println("Child is playing");
    }
}

class musician implements player {
    void show() {
        System.out.println("Musician Class is called");
    }

    @Override
    public void play() {
        System.out.println("Musician is playing");
    }
}

class actor implements player {
    void show() {
        System.out.println("Actor Class is called");
    }

    @Override
    public void play() {
        System.out.println("Actor is playing");
    }
}

class q7_userplayer {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        child o1 = new child();
        musician o2 = new musician();
        actor o3 = new actor();
        System.out.println("--------------------------------------------");
        o1.show();
        o1.play();
        System.out.println("--------------------------------------------");
        o2.show();
        o2.play();
        System.out.println("--------------------------------------------");
        o3.show();
        o3.play();
    }
}
