// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3038.JavaBot;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static SpeedController driveTrainLeftMotor;
    public static SpeedController driveTrainRightMotor;
    public static RobotDrive driveTrainRobotDrive;
    public static AnalogInput driveTrainUltraSonicSensor;
    public static AnalogPotentiometer wristPot;
    public static SpeedController wristWrist;
    public static SpeedController clawMotor;
    public static AnalogPotentiometer elevatorPot;
    public static SpeedController elevatorMotor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainLeftMotor = new Talon(0);
        LiveWindow.addActuator("Drive Train", "LeftMotor", (Talon) driveTrainLeftMotor);
        
        driveTrainRightMotor = new Talon(1);
        LiveWindow.addActuator("Drive Train", "RightMotor", (Talon) driveTrainRightMotor);
        
        driveTrainRobotDrive = new RobotDrive(driveTrainLeftMotor, driveTrainRightMotor);
        
        driveTrainRobotDrive.setSafetyEnabled(true);
        driveTrainRobotDrive.setExpiration(0.1);
        driveTrainRobotDrive.setSensitivity(0.5);
        driveTrainRobotDrive.setMaxOutput(1.0);

        driveTrainUltraSonicSensor = new AnalogInput(2);
        LiveWindow.addSensor("Drive Train", "UltraSonicSensor", driveTrainUltraSonicSensor);
        
        wristPot = new AnalogPotentiometer(0, 1.0, 0.0);
        LiveWindow.addSensor("Wrist", "Pot", wristPot);
        
        wristWrist = new Talon(2);
        LiveWindow.addActuator("Wrist", "Wrist", (Talon) wristWrist);
        
        clawMotor = new Talon(3);
        LiveWindow.addActuator("Claw", "Motor", (Talon) clawMotor);
        
        elevatorPot = new AnalogPotentiometer(1, 1.0, 0.0);
        LiveWindow.addSensor("Elevator", "Pot", elevatorPot);
        
        elevatorMotor = new Talon(4);
        LiveWindow.addActuator("Elevator", "Motor", (Talon) elevatorMotor);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
