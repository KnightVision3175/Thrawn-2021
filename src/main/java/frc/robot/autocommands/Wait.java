package frc.robot.autocommands;

import frc.robot.DriveTrain;

public class Wait extends AutoCommandBase {

	
	public Wait(double timeOut) {
		super(timeOut);
	}

	@Override
	public void init() {
		
	}

	@Override
	protected void run() {
		DriveTrain.drive(0, 0);
		//Shooter.shoot(0);
	}

	@Override
	public void end() {
		
	}

	@Override
	protected String getCommandName() {
		return null;
	}

}