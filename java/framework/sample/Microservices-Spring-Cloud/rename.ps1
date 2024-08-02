# Define the mapping of chapter numbers to the transformed names
$chapterMap = @{
    "ch2"  = "2-creating-k8s-clusters"
        "ch3"  = "3-high-availability-reliability"
        "ch4"  = "4-securing-kubernetes"
        "ch5"  = "5-using-k8s-resources"
        "ch6"  = "6-managing-storage"
        "ch7"  = "7-stateful-apps-kubernetes"
        "ch8"  = "8-deploying-updating-apps"
        "ch9"  = "9-packaging-apps"
        "ch10" = "10-exploring-k8s-networking"
        "ch12" = "12-multiple-k8s-clusters"
        "ch13" = "13-serverless-computing-kubernetes"
        "ch14" = "14-monitoring-k8s-clusters"
        "ch15" = "15-service-meshes"
        "ch16" = "16-extending-kubernetes"
        "ch17" = "17-governing-kubernetes"
}

# Path to the main folder containing the chapter folders
$mainFolderPath = "D:\Working\1.PROJECT\Development-Toolkit\devops\kubernetes\Mastering-Kubernetes"

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
