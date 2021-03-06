// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class MotorControllers {
        public static final int Front_Right_Spark_ID = 1;      // Configured on TONH
        public static final int Rear_Right_Spark_ID = 3;
        public static final int Front_left_Spark_ID = 0;
        public static final int Rear_Left_Spark_ID = 2;
    }

    public static final class DriverSettings {
        public static final int Driver_Stick_Port = 0;      // Configured on TONH
        public static final int Throttle_Axis = 0;
        public static final int Steering_Axis = 1;
    }
}
