package com.sw.awsimage.upload.bucket;

public enum BucketName {
  PROFILE_IMAGE("sw-image-upload-123");
  private final String bucketName;

  BucketName(String bucketName){
    this.bucketName = bucketName;
  }

  public String getBucketName() {
    return bucketName;
  }
}
