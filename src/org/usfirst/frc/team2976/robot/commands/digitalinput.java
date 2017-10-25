package org.usfirst.frc.team2976.robot.commands;

import org.usfirst.frc.team2976.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class digitalinput extends Command {
	Double drivepower=.5;

    public digitalinput(int Inputvallue){
    	if(Inputvallue==3){
    		//go up
    	
    		Robot.driveTrain.drive(drivepower,drivepower);
    		
    		
    	}else if(Inputvallue==2){
    
    		Robot.driveTrain.drive(-drivepower, -drivepower);
    		
    		
    		
    	}else if(Inputvallue==1){
    
    		Robot.driveTrain.drive(-drivepower, drivepower);
    		
    		

    	}else if(Inputvallue==4){
    
    		Robot.driveTrain.drive(drivepower, -drivepower);
    		
    		
    		
    	}
    	
        
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.driveTrain.drive(0,0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.drive(0,0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
