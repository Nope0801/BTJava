package org.hina.w06.Ex2;

public class mainTest {

    public static void main(String[] arg) {
        // Test Point2D
        Point2D p2d = new Point2D(3, 4);
        System.out.println("Original Point2D: " + p2d);
        System.out.println("Distance from origin: " + p2d.distance());
        System.out.println("Symmetric Point2D: " + p2d.symmetric());

// Test Point3D
        Point3D p3d = new Point3D(3, 4, 5);
        System.out.println("Original Point3D: " + p3d);
        System.out.println("Distance from origin: " + p3d.distance());
        System.out.println("Symmetric Point3D: " + p3d.symmetric());

// Test moving the points
        p2d.move(1, -2);
        p3d.move(-1, 3, -4);
        System.out.println("\nAfter moving:");
        System.out.println("Point2D: " + p2d);
        System.out.println("Point3D: " + p3d);

// Test distance between two 3D points
        Point3D p3d2 = new Point3D(-2, 7, 1);
        System.out.println("New Point3D: " + p3d2);
        System.out.println("Distance between two Point3D objects: " + p3d.distanceTwoPoint(p3d2));

    }
}
