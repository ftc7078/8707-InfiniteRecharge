// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
  // All the physical stuff that this subsystem uses
  private static final Spark front_right_spark = new Spark(Constants.MotorControllers.Front_Right_Spark_ID);
  private static final Spark rear_right_spark = new Spark(Constants.MotorControllers.Rear_Right_Spark_ID);
  private static final Spark front_left_spark = new Spark(Constants.MotorControllers.Front_left_Spark_ID);
  private static final Spark rear_left_spark = new Spark(Constants.MotorControllers.Rear_Left_Spark_ID);

  /** Creates a new Drivetrain. */
  public Drivetrain() {
    //rear_right_spark.setFollower(other motror)
  }

  /**
   * Takes two values, one for the speed of the right and one for
   * the speed of the left, and assigns them to the correct controllers.
   * Useful for tank drive.
   * @author 1721 Tidal Force
   * @param right_speed (A value from -1 to 1)
   * @param left_speed (A value from -1 to 1)
   */
  public void TankDrive(double right_speed, double left_speed) {
    // Set right sides
    front_right_spark.set(right_speed);
    rear_right_spark.set(right_speed);

    // Set left sides
    front_left_spark.set(left_speed);
    rear_left_spark.set(left_speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
