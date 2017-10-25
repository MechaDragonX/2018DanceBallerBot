package org.usfirst.frc.team2976.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team2976.robot.commands.ExampleCommand;
import org.usfirst.frc.team2976.robot.commands.RollIntakeMotor;
import org.usfirst.frc.team2976.robot.commands.digitalinput;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
// the controller
	public Joystick driveStick;
	
	
	//numeric values for each button
	public static final int Up = 3; 
	public static final int Down = 2;
	public static final int Left = 1;
	public static final int Right= 4;

	public static final int LBumper = 5;
	public static final int RBumper = 6;
//numeric values for joysticks on the controller 
	public static final int LeftYAxis = 1;

	public static final int RightYAxis = 5;
//methods to get what is happening on joysticks on the controller 
	public double getLeftAxis() {

		return driveStick.getRawAxis(LeftYAxis);

	}

	public double getRightAxis() {

		return driveStick.getRawAxis(RightYAxis);

	}

	public OI() {
//intalizing the joystick
		
		driveStick = new Joystick(0);
		//new JoystickButton(driveStick, A).whenPressed(new RollIntakeMotor()); 
		new JoystickButton(driveStick, Up).whileHeld(new digitalinput(Up));
		new JoystickButton(driveStick, Down).whileHeld(new digitalinput(Down));
		new JoystickButton(driveStick, Left).whileHeld(new digitalinput(Left));
		new JoystickButton(driveStick, Right).whileHeld(new digitalinput(Right));
	}

}
