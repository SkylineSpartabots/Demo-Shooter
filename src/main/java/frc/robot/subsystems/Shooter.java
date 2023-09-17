package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
    static Shooter instance;
    
    public static Shooter getInstance() {
        if (instance == null) instance = new Shooter();
        return instance;
    }
    // Speed of the motor as a percent
    private double percentSpeed;
    // Whether the motor is spinning
    private boolean shooting;
    // Initializing a motor
    private final TalonSRX shooterMotor;

    public Shooter() {
        // First, we need to create a motor within the code. Which one of these options do you think is correct? (Hint: the motor controller we're using is called TalonSRX)
        // shooterMotor = motor;
        // shooterMotor = new TalonSRX(0);
        // shooterMotor = TalonSRX;
        // shooterMotor = new TalonSRX(motorID)
        // shooterMotor = new TalonFX(0);
        
        // Should shooting begin as true or false?

        // How fast do you want the shooter to go? How do you think you can write this in the code?
        
        
    }

    // Change the direction of the motor
    public void rev() {
        // How can you reverse the motor's direction?

        if (shooting) {
            shoot();
        }
    }

    // Increase the speed of the motor
    public void incSpeed() {
        // How can you increase the motor's speed?

        if (shooting) {
            shoot();
        }
    }

    // Decrease the speed of the motor
    public void decSpeed() {
        // How can you decrease the motor's speed?

        if (shooting) {
            shoot();
        }
    }

    // Spin or shoot the motor
    public void shoot() {
        // The motor.set() function is used to move a motor, and it requires a mode of control and speed. Which of these do you think is correct?
        // shooterMotor.set(ControlMode.Velocity, percentSpeed);
        // shooterMotor.set(ControlMode.PercentOutput, 100);
        // shooterMotor.set(ControlMode.PercentOutput, percentSpeed);
        // shooterMotor.set(ControlMode.Position, percentSpeed);

        shooting = true;
    }

    // Stop the motor
    public void stopShoot() {
        // How can you stop the motor?

        shooting = false;
    }
}