package mainPackage;

import com.sun.j3d.utils.geometry.Sphere;

import javax.media.j3d.Shape3D;

public class Player extends Shape3D {
    public Player() {
        Sphere sphere = new Sphere(1.0f);
        Shape3D sphereShape = sphere.getShape();
    }
}