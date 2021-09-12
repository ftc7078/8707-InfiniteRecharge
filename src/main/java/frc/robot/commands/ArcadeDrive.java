// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drivetrain;

public class ArcadeDrive extends CommandBase {
  // Basically global variables
  private final Drivetrain drivetrain;
  private final DoubleSupplier thro;
  private final DoubleSupplier steerage;

  /** Creates a new ArcadeDrive. */
  public ArcadeDrive(
    Drivetrain _drivetrain,
    DoubleSupplier _thro,
    DoubleSupplier _steerage) {
      // For this to run, we need full control of the drivetrain
      addRequirements(_drivetrain);

      // Make global
      drivetrain = _drivetrain;
      thro = _thro;
      steerage = _steerage;
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // Speeds we're going to set
    double right_side;
    double left_side;

    // Get the values from the double supplier (the driver) as doubles!
    double thro_value = thro.getAsDouble();
    double steer_value = steerage.getAsDouble();

    // Complex! too complex for subsystem, its good to do this math here!
    right_side = thro_value - steer_value;
    left_side = thro_value + steer_value;

    // Send it on its way!!
    drivetrain.TankDrive(right_side, left_side);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
