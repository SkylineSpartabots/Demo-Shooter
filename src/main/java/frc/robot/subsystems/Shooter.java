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
    private double percentSpeed;
    private boolean shooting;
    private final TalonSRX shooterMotor;
    public Shooter() {
        shooterMotor = new TalonSRX(0);
        shooting = false;
        percentSpeed = 0.5;
    }

    public void incSpeed() {
        percentSpeed += 0.1;
        if (shooting) {
            shoot();
        }
    }
    public void decSpeed() {
        percentSpeed -= 0.1;
        if (shooting) {
            shoot();
        }
    }
    public void shoot() {

        shooterMotor.set(ControlMode.PercentOutput, percentSpeed);
        shooting = true;
    }
    public void stopShoot(){
        shooterMotor.set(ControlMode.PercentOutput, 0);
        shooting = false;
    }
}