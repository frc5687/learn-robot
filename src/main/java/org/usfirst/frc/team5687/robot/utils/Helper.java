package org.usfirst.frc.team5687.robot.utils;

/**
 * A helper class for utility methods
 * @author wil
 */
public class Helper {
    /**
     * Applies a deadband threshold to a given value
     * @param input raw value from joystick
     * @param deadband the deadband threshold
     * @return double the adjusted value
     */
    public static double applyDeadband(double input, double deadband){
        return (Math.abs(input) >= Math.abs(deadband)) ? input : 0;
    }

    /**
     * Checks if a value is within tolerance of another value
     * @param value the value to check
     * @param target the target or desired value
     * @param tolerance the acceptable tolerance around the target
     * @return true if the value is within tolerance of the target value
     */
    public static boolean isValueWithinTolerance(double value, double target, double tolerance)
    {
        return Math.abs(value - target) <= tolerance;
    }
}
