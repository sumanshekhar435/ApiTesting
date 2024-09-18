package com.example.ApiTesting.service;

import com.example.ApiTesting.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVendorDetails(CloudVendor cloudVendor);
    public String updateCloudVendorDetails(CloudVendor cloudVendor);
    public String deleteCloudVendorDetails(String vendorId);
    public CloudVendor getCloudVendorDetails(String vendorId);
    public List<CloudVendor> getAllClouderVendorDetails();
}
