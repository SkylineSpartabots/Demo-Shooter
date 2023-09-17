// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.subsystems.Shooter;

public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  
  /* Controllers */
  private final XboxController driver = new XboxController(0);

  /* Driver Buttons */
  // Initializing Driver Buttons
  private final JoystickButton driverA = new JoystickButton(driver, XboxController.Button.kA.value);
  private final JoystickButton driverB = new JoystickButton(driver, XboxController.Button.kB.value);
  // Based on the examples above, can you create a new driverY button?


  // Initializing Driver Bumpers
  private final JoystickButton driverLeftBumper = new JoystickButton(driver, XboxController.Button.kLeftBumper.value);
  // Can you create a new driverRightBumper button?
  
  
  Shooter s_Shooter;
  public RobotContainer() {
    // Configure the trigger bindings
    s_Shooter = Shooter.getInstance();
    configureBindings();
  }

  /**
   * Use this method to define your trigger->command mappings. Triggers can be created via the
   * {@link Trigger#Trigger(java.util.function.BooleanSupplier)} constructor with an arbitrary
   * predicate, or via the named factories in {@link
   * edu.wpi.first.wpilibj2.command.button.CommandGenericHID}'s subclasses for {@link
   * CommandXboxController Xbox}/{@link edu.wpi.first.wpilibj2.command.button.CommandPS4Controller
   * PS4} controllers or {@link edu.wpi.first.wpilibj2.command.button.CommandJoystick Flight
   * joysticks}.
   */
  private void configureBindings() {

    // Exmaples for how to bind keys to motor actions
    driverA.onTrue(new InstantCommand(() -> s_Shooter.shoot()));
    driverB.onTrue(new InstantCommand(() -> s_Shooter.stopShoot()));

    // Try to bind the driverY button to the rev() shooter function

    driverLeftBumper.onTrue(new InstantCommand(() -> s_Shooter.decSpeed()));

    //Try to bind the driverRightBumpter to the incSpeed() shooter function

  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  // public Command getAutonomousCommand() {
  //   // An example command will be run in autonomous
  //   return new Command()
  // }
}
