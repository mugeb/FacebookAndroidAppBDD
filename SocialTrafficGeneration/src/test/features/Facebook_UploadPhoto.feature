Feature: Facebook_UploadPhoto
  Upload a photo on Facebook App

  @Facebook_UploadPhoto
  Scenario: The test uploads a photo in Facebook
    And The client opens the Facebook application
    And The client logs in with xxxxxxxxxxxx@gmail.com and xxxxxxxxx
    And The client opens the tab to upload the picture
    And The client opens the camera tab
    And The client takes a picture
    And The client accepts the photo
    And The client sets a title:picture for the file
    And The client posts the file
    Then The client waits till the file is successfully uploaded

