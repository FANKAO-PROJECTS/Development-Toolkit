# Define the mapping of chapter numbers to the transformed names
$chapterMap = @{
    "Chapter03"  = "3-cooperating-microservices"
    "Chapter04"  = "4-deploy-docker"
    "Chapter05"  = "5-api-description-openapi"
    "Chapter06"  = "6-adding-persistence"
    "Chapter07"  = "7-reactive-microservices"
    "Chapter08"  = "8-intro-spring-cloud"
    "Chapter09"  = "9-service-discovery-eureka"
    "Chapter10" = "10-spring-cloud-gateway"
    "Chapter11" = "11-securing-apis"
    "Chapter12" = "12-central-config"
    "Chapter13" = "13-resilience4j"
    "Chapter14" = "14-distributed-tracing"
    "Chapter15" = "15-intro-kubernetes"
    "Chapter16" = "16-deploy-kubernetes"
    "Chapter17" = "17-kubernetes-features"
    "Chapter18" = "18-service-mesh"
    "Chapter19" = "19-central-logging-efk"
    "Chapter20" = "20-monitoring-microservices"
    "Chapter21" = "21-install-macos"
    "Chapter22" = "22-install-windows-ubuntu"
    "Chapter23" = "23-native-java-microservices"
}

# Path to the main folder containing the chapter folders
$mainFolderPath = "D:\Working\1.PROJECT\Development-Toolkit\java\framework\sample\Microservices-Spring-Cloud"

# Loop through each mapping and rename the corresponding folders
foreach ($chapter in $chapterMap.Keys) {
    $oldFolderPath = Join-Path $mainFolderPath $chapter
    $newFolderPath = Join-Path $mainFolderPath $chapterMap[$chapter]

    # Check if the old folder exists
    if (Test-Path $oldFolderPath) {
        # Rename the folder
        Rename-Item -Path $oldFolderPath -NewName $chapterMap[$chapter] -Force
        Write-Output "Renamed '$oldFolderPath' to '$newFolderPath'"
    } else {
        Write-Output "Folder '$oldFolderPath' does not exist"
    }
}
