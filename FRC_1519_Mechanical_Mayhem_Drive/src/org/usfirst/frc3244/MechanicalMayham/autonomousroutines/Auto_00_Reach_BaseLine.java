package org.usfirst.frc3244.MechanicalMayham.autonomousroutines;

import org.usfirst.frc3244.MechanicalMayham.commands.Drive_For_Distance;
import org.usfirst.frc3244.MechanicalMayham.commands.Drive_Set_Gyro;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Auto_00_Reach_BaseLine extends CommandGroup {

    public Auto_00_Reach_BaseLine() {
    	// * not using the Direction Chooser to Buggy addSequential(new Drive_Set_Gyro_Chooser(),1); //Not set
    	addSequential(new Drive_Set_Gyro(0.0),1);
    	addSequential(new Drive_For_Distance(0.0, 0.3, 0.0, 17, 0.0));
    }
}
