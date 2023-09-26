package com.example.HospitalInsurancePackage.Contractors;

import java.util.List;

import com.example.HospitalInsurancePackage.model.DiseaseDetails;
import com.example.HospitalInsurancePackage.model.InsurancePackage;
import com.example.HospitalInsurancePackage.model.InsurancePackageCoveredDisease;

public interface InsurancePackageService {
    List<InsurancePackage> getAllInsurancePackages();
	List<InsurancePackage> getFilteredPackages(String status, int age);
	List<InsurancePackage> getPackagesByStatus(String status);
	List<InsurancePackage> getAllInsurancePackagesByAge(int parseInt);
	List<DiseaseDetails> getDiseasesByPackageId(int inspId);
	
}

