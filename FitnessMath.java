package FitnessMath;


public class FitnessMath {
	private int x_cord = 0; 
	private int y_cord = 0; 
	private int z_cord = 0; 
	private int calories = 0; 
	private double weight = 0.0;  
	private double height = 0.0;  
	private int age = 0; 
	private String gender = "";
	
	public FitnessMath(String gender, int calories, double weight, int heightFeet, int heightInches, int age){
		this.gender = gender; 
		this.calories = calories; 
		this.weight = weight * 2.2; //converted to kg for equations
		heightInches = (heightFeet * 12) + heightInches; 
		this.height = heightInches * .025; // converted to meters
		this.age = age; 
		//coordinates are initialized in a constructor utilizing passed in from three-axis accelerometer 
	}
	
	public int getX_Cord(){
		return x_cord;
	}
	
	public int getY_Cord(){
		return y_cord;
	}
	
	public int getZ_Cord(){
		return z_cord; 
	}
	
	public int getCalories(){
		return calories;
	}
	
	public double getWeight(){
		return weight;
	}
	
	public double height(){
		return height; 
	}
	
	public void setX_Cord(int x_cord){
		this.x_cord = x_cord;
	}
	
	public void setY_Cord(int y_cord){
		this.y_cord = y_cord;
	}
	
	public void setZ_Cord(int z_cord){
		this.z_cord = z_cord;
	}
	
	public void setCalories(int calories){
		this.calories = calories; 
	}
	
	public void setWeight(double weight){
		this.weight = weight;
	}
	
	public void setHeight(double height){
		this.height = height; 
	}
	
	public double calcBMI(){
		double BMI = 0.0; 
		BMI = weight / (height * height); 
		return BMI;
	}
	
	public double calcBMR(){
		if(gender.equalsIgnoreCase("female")){
			double BMR = 0.0;
			BMR = 655 + (9.6 * weight) + (1.8 * (height/100)) - (4.7 * age);
			return BMR;
		}
		else{
			double BMR = 0.0; 
			BMR = 66 + (13.7 * weight) + (5 * (height/100)) - (6.8 * age);
			return BMR;
		}
	}
	/*
	 * Check the x, y, and z coordinate changes overtime and rate of change to determine activity and measure intensity of activity 
	public String checkActivity(double distance, double speed){
		double frequency = 0.0; 
		frequency = speed/distance;
		if(frequency > 5 && frequency < 13.7){
			
		}
		return "No activity."; 
	}
	*/
	//Calc calories to burn to lose weight by BMR - calories 
	public int calcCaloriesBurned(String activity){
		int caloriedeficit = 0;
		int mets = 1;
		double sittingcalorieburn = .0175 * mets * weight; 
		if(activity.equalsIgnoreCase("bicycling")){
			//measure of speed inputed into logic statements determining level of intensity which would determine METS value
		}
		//other activities programmed into app that are available for tracking 
		//will be checked below to determine METS 
		
		double activitycalorieburn = .0175 * mets * weight;
		caloriedeficit = (int) (activitycalorieburn - sittingcalorieburn);
		return caloriedeficit; 
	}
}
