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
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

  public static class IntakeConstants {
    //TODO: Assign a real CAN ID
    public static final int kIntakeMotorID = 0;
  }

  public static class DriveConstants {
    public static final int kSmartCurrentLimit = 40;
  }

  public static class ShooterConstants {
    public static final double kDriveEncoderCPR = 2048.0;
    public static final double kAbsoluteEncoderCPR = 4096.0;
    //TODO: Find the flywheel diameter
    public static final double kWheelDiameterMeters = 0.09525;
    //TODO: Find gear ratio
    public static final double kDriveGearRatio = 6.75;

    public static final double kDriveEncoderDistancePerPulse =
        (kWheelDiameterMeters * Math.PI) / (kDriveEncoderCPR * kDriveGearRatio);
  }
}