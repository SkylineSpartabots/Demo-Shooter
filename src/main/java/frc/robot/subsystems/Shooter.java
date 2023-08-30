
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
    static Shooter instance;

    public static Shooter getInstance() {
        if (instance == null) instance = new Shooter();
        return instance;
    }
    private final TalonSRX shooterMotor;
    public Shooter() {
        shooterMotor = new TalonSRX(0);
    }

    public void shoot() {
        shooterMotor.set(ControlMode.PercentOutput, 70);

    }
    public void stopShoot(){
        shooterMotor.set(ControlMode.PercentOutput, 0);
    }
