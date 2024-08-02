# Define the mapping of chapter numbers to the transformed names
$chapterMap = @{
     "Chapter02" = "2-k8s-app-deployment"
        "Chapter03" = "3-containerizing-apps"
        "Chapter04" = "4-deploying-kubernetes"
        "Chapter05" = "5-automated-operations"
        "Chapter06" = "6-resource-management"
        "Chapter07" = "7-scaling-up"
        "Chapter08" = "8-internal-services-load-balancing"
        "Chapter09" = "9-node-feature-selection"
        "Chapter10" = "10-stateful-applications"
        "Chapter11" = "11-background-processing"
        "Chapter12" = "12-gitops-config-as-code"
        "Chapter13" = "13-securing-kubernetes"
}

# Path to the main folder containing the chapter folders
$mainFolderPath = "D:\Working\1.PROJECT\Development-Toolkit\devops\kubernetes\kubernetes-for-developers"

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
