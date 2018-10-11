public class VariableEX{
	//variavle declaration
	int x;
	int y;
	int z;
	//as same as 
	int x, y, z;
	
	//variable declaration with values
	int x=1;
	int y=1;
	int z=1;
	//as same as
	int x=y=z=1;
	
	//more use
	int x=1;
	int y=x;
	int z=x+y;
	
	//constant variable declaration
	final double PI=3.1416; //it can not be changed;
	final double NUMBER_OF_STUDENT = 12;
	
	//using underscore in numeric types
	long number = 1990_511_732_30_00_059L //compiler don't read the underscore during compilation so that there can be mathmatical operation with this number.
  
  
  
	//primtive datatype
	byte P=127; //minimum value range -128 maximum 127 or  (-2^7 to 2^7-1), 8-bit signed
    short Q=32767; //minimum value range -32768 maximum 32767 or  (-2^15 to 2^15-1), 16 bit signed
    int S = 456456; //minimum  -2^31 to  maximum 2^31-1), 32 bit signed
    long T = 456456456456456456L; //minimum  -2^63 to  maximum 2^63-1), 64 bit signed
    float F = 456455645645645.6456F; //Negative range  -3.4028235E+38  to  -1.4E-45), 32 bit IEEE 754
                                     //positive range 1.4E-45 to 3.4028235E+38
    double D = 54544554.98979;//Negative range  -1.7976931348623157E+308  to  -4.9E-324), 32 bit IEEE 754
                              //positive range 4.9E-324 to 1.7976931348623157E+308
}