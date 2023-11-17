package frc.robot.commands;

import org.ejml.equation.IntegerSequence.Combined;

import edu.wpi.first.wpilibj.motorcontrol.PWMMotorController;
import edu.wpi.first.wpilibj2.command.CommandBase;

/**
 * This command will cause the motor to spin for a given amount of time and then stop.
 */
public class MoveMotorCommand extends CommandBase {

    double currentSpeed; 
    PWMMotorController spinMotor;

    public MoveMotorCommand(PWMMotorController motor) {
        this.spinMotor = motor;
        motor.stopMotor();
    }


    @Override
    public void initialize() {
        super.initialize();
        this.currentSpeed = 0;
    }
    
    @Override
    public void execute() {
        this.spinMotor.set(currentSpeed);    
    }

    @Override
    public boolean isFinished() {
        // TODO Auto-generated method stub
        return super.isFinished();
    }

 
}
