package com.example.ApiTesting.controller;

import com.example.ApiTesting.model.CloudVendor;
import com.example.ApiTesting.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cloud-vendor")
public class CloudVendorCountroller {

    CloudVendorService cloudVendorService;

    public CloudVendorCountroller(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        return cloudVendorService.getCloudVendorDetails(vendorId);
    }

    @GetMapping
    public List<CloudVendor> getAllCloudVendorDetails(){
        return cloudVendorService.getAllClouderVendorDetails();
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendorDetails(cloudVendor);
        return "Cloud Vendor Details Created Successfully!";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendorDetails(cloudVendor);
        return "Cloud Vendor Details updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(String vendorId){
        cloudVendorService.deleteCloudVendorDetails(vendorId);
        return "Cloud Vendor Details Detleted Successfully";
    }
}
