package com.blz.EmployeePayroll.Day_29_IndianCensusAnalyzer;

public class CensusData {
	
	String state;
	long population;
	
	int areainSqKm;
	double densityperSqKm;
//Constructor for CSV data Format
	public CensusData(String state, long population, int areainsqkm, double densityperSqKm) {
		super();
		this.state = state;
		this.population = population;
		this.areainSqKm = areainsqkm;
		this.densityperSqKm = densityperSqKm;
	}
	//to string format 
	@Override
	public String toString() {
		return "CensusData [state=" + state + ", population=" + population + ", areainsqkm=" + areainSqKm
				+ ", densitypersqkm=" + densityperSqKm + "]";
	}

}