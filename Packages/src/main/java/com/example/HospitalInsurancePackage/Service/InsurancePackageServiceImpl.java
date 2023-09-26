package com.example.HospitalInsurancePackage.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.example.HospitalInsurancePackage.Contractors.InsurancePackageDAO;
import com.example.HospitalInsurancePackage.Contractors.InsurancePackageService;
import com.example.HospitalInsurancePackage.model.DiseaseDetails;
import com.example.HospitalInsurancePackage.model.InsurancePackage;
import com.example.HospitalInsurancePackage.model.InsurancePackageCoveredDisease;

import java.util.List;

@Service
public class InsurancePackageServiceImpl implements InsurancePackageService {

    private final InsurancePackageDAO insurancePackageDAO;
    
    @Autowired
    public InsurancePackageServiceImpl(InsurancePackageDAO insurancePackageDAO) {
        this.insurancePackageDAO = insurancePackageDAO;
    }

    @Override
    public List<InsurancePackage> getAllInsurancePackages() {
        return insurancePackageDAO.getAllInsurancePackages();
    }
    

	@Override
	public List<InsurancePackage> getFilteredPackages(String status, int age) {
		return  insurancePackageDAO.getFiteredDiseases(status,age);
	}

	@Override
	public List<InsurancePackage> getPackagesByStatus(String status) {
		// TODO Auto-generated method stub
		return  insurancePackageDAO.getPackagesByStatus(status);
	}

	@Override
	public List<InsurancePackage> getAllInsurancePackagesByAge(int age) {
		// TODO Auto-generated method stub
		return  insurancePackageDAO.getAllInsurancePackagesByAge(age);
	}

	@Override
	public List<DiseaseDetails> getDiseasesByPackageId(int inspId) {
		// TODO Auto-generated method stub
		return  insurancePackageDAO.getDiseasesByPackageId(inspId);
	}

}






