package com.hexamind.datera;

public class PhotosDating {
    private int photoId;
    private int uploaderUserId;
    private String photoPath;

    public PhotosDating(int photoId, int uploaderUserId, String photoPath) {
        this.photoId = photoId;
        this.uploaderUserId = uploaderUserId;
        this.photoPath = photoPath;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public int getUploaderUserId() {
        return uploaderUserId;
    }

    public void setUploaderUserId(int uploaderUserId) {
        this.uploaderUserId = uploaderUserId;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }
}
