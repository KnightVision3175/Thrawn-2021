package frc.robot.config;

import frc.robot.Gains;

public class Constants {

    /**
     * =====================
     *     DRIVE TRAIN
     * =====================
     */
    // Left Motor IDs
    public static final int DT_TALON_LEFTFRONT = 10; // CAN
    public static final int DT_TALON_LEFTBACK = 11; // CAN

    // right motor IDs
    public static final int DT_TALON_RIGHTFRONT = 12; // CAN
    public static final int DT_TALON_RIGHTBACK = 13; // CAN

    
    public static final double kDefaultQuickStopThreshold = 0.2;
    public static final double kDefaultQuickStopAlpha = 0.1;
    public static final double driveDeadband = 0.2;
    public static final double turnDeadband = 0.1;

    /**
     * =====================
     *     Limelight
     * =====================
     */
    public static final int LIMELIGHT_VISION_TARGET = 1;
    public static final double LIMELIGHT_OFFSET = 30;// offset substract
    //values
    public static final double CAMERA_ANGLE = 22.4; //degrees
    public static final double CAMERA_HEIGHT = 23; //inches
    public static final double LIMELIGHT_LINE_DISTANCE = 120d; //inches

    public static final double LINEUP_FULL_SPEED = 1.0;
    public static final double LINEUP_HALF_SPEED = 0.5;
    public static final double DRIVE_STRAIGHT_CONSTANT = 1;

    /**
     * =====================
     *       Intake
     * =====================
     */
    //public static final int INTAKE_TALON = 19;
    //public static final int INTAKE_FOLLOWER = 1;
    public static final double INTAKE_SPEED = -.8;

    //intake DoubleSolenoid
    public static final int INTAKE_SOLENOID_F = 0;
    public static final int INTAKE_SOLENOID_R = 1;

    /**
     * =====================
     *        Shooter
     * =====================
     */

    //Shooter and Hopper
    public static final int TOP_SHOOTER_TALON = 5;
    public static final int BOTTOM_SHOOTER_TALON = 6;
    public static final int HOPPER_TALON = 26;


    //Only used in auton
    public static final double HOPPER_SPEED = -0.4; //85

    //Hopper agitation speeds
    public static final double HOPPER_AGITATION_FORWARD = 0.6; //Don't make this number negative or it won't work
    public static final double HOPPER_AGITATION_REVERSE = 0.6; //Don't make this number negative or it won't work

    //Hopper speed for shooting
    public static final double HOPPER_POWER_SHOOT = .4;


    public static final double TOP_MOTOR_SPEED_LINE = .82; //percent
    public static final double BOTTOM_MOTOR_SPEED = .2;//percent
    public static final double TOP_MOTOR_SPEED_TRENCH = .2; // percent


    /**
     * =====================
     * Game piece measurements
     * =====================
     */

     public static final int POWERPORT_HEIGHT = 88; //inches

    
    /**
     * =====================
     *        Climber
     * =====================
     */

    //public static final int LEFT_CLIMBER_TALON = 5;
    //public static final int RIGHT_CLIMBER_TALON = 6;
    public static final int LEFT_FOLDER = 2;
    public static final int RIGHT_FOLDER = 3;
    public static final int UP_CLIMB_POSITION = 90000;
    public static final int DOWN_CLIMB_POSITION = 225000;
    public static final double CLIMBER_SPEED = 0.85;
    public static final double FOLDER_SPEED = 1;
    public static final double CLIMBER_DEADBAND = 0.2;

    /**
     * =====================
     *       TeleOp
     * =====================
     */
    // TeleOp
    public static final int XB_POS_DRIVER = 0;
    public static final int XB_POS_MANIP = 1;


    public static final double MAX_RPM_FIRST_GEAR = 4700d;

    public static final int XBOX_DRIVER = 0;
    public static final int XBOX_MANIP = 1;
    public static final int XBOX_CLIMB = 2;
    public static final int XBOX_RESET = 3;

    public static final int LED_CHANNEL_1 = 1; // > 30
    public static final int LED_CHANNEL_2 = 2; // > 32
    public static final int LED_CHANNEL_3 = 3; // > 34
    
    public static final double LIMELIGHT_P = 0.001;
    public static final double LIMELIGHT_I = 0;
    public static final double LIMELIGHT_D = 0;

    /**
     * =========================
     *       PID Constants
     * =========================
     */

    public static final int kSlotIdx = 0;
    public static final int kPIDLoopIdx = 0;
    public static final int kTimeoutMs = 30;
    public final static Gains kGains_Velocit = new Gains( 0.003, 0.000, 0, 1023.0/7200.0,  300,  1.00);

}
