package com.example.ApiTesting.repositry;

import com.example.ApiTesting.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorReposirty extends JpaRepository<CloudVendor, String> {

}
