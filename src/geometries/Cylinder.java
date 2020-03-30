package geometries;

import primitives.*;

/**
 * class Cylinder
 */
public class Cylinder extends Tube
{
    /**
     * cylinder height
     */
    double _height;

    /**
     * Constructor of Cylinder
     * @param _radius
     * @param _axisRay
     * @param _height
     */
    public Cylinder(double _radius, Ray _axisRay, double _height)
    {
        super(_radius, _axisRay);
        this._height = _height;
    }


    /**
     * Function getNormal
     * @param p=Point3D
     * @return normal vector to the cylinder
     */
    public Vector getNormal(Point3D p) {
        Vector u = new Vector(p.subtract(this._axisRay.get_p0()));
        double t =this._axisRay.get_dir().dotProduct(u);
        Point3D point = this._axisRay.get_p0().add(this._axisRay.get_dir().scale(t));
        Vector n = new Vector(p.subtract(point));
        return n.normalize();

    }

    /**
     * Function get_height
     * @return height of cylinder
     */
    public double get_height() {
        return _height;
    }

    /**
     * Function ToString
     * @return string with tostring of Tube and height
     */
    @Override
    public String toString() {
        return super.toString()+"height=" + _height ;
    }
}
