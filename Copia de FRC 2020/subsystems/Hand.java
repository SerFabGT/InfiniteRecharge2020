/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

// import RobotMap and "subsytemname"Stop

import edu.wpi.first.wpilibj.command.Subsystem;

//Spec for each "component", for example this case motors

public class Hand extends Subsystem {

  //declare components

  public void FullTurn(){
  }

  public void NextC(){
  }

  public void PreviousC(){
  }

  public void OppositeC(){
  }

  public void Stop(){
  }

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new HandStop());
  }
}
