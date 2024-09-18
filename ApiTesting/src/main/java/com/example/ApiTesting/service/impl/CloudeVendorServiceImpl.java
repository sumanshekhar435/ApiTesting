package com.example.ApiTesting.service.impl;

import com.example.ApiTesting.model.CloudVendor;
import com.example.ApiTesting.repositry.CloudVendorReposirty;
import com.example.ApiTesting.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudeVendorServiceImpl implements CloudVendorService {

    CloudVendorReposirty cloudVendorReposirty;

    public CloudeVendorServiceImpl(CloudVendorReposirty cloudVendorReposirty) {
        this.cloudVendorReposirty = cloudVendorReposirty;
    }

    @Override
    public String createCloudVendorDetails(CloudVendor cloudVendor) {
        cloudVendorReposirty.save(cloudVendor);
        return "Success";
    }

    @Override
    public String updateCloudVendorDetails(CloudVendor cloudVendor) {
        cloudVendorReposirty.save(cloudVendor);
        return "Success";
    }

    @Override
    public String deleteCloudVendorDetails(String vendorId) {
        cloudVendorReposirty.deleteById(vendorId);
        return "Success";
    }

    @Override
    public CloudVendor getCloudVendorDetails(String vendorId) {

        return cloudVendorReposirty.findById(vendorId).get();
    }

    @Override
    public List<CloudVendor> getAllClouderVendorDetails() {
        return cloudVendorReposirty.findAll();
    }
}
