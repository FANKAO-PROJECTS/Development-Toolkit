# Define the mapping of chapter numbers to the transformed names
$chapterMap = @{
    "Chapter02" = "02-Spring"
    "Chapter03" = "03-AOS"
    "Chapter04" = "04-Business"
    "Chapter05" = "05-Asynchronous-API"
    "Chapter06" = "06-Securing"
    "Chapter07" = "07-UI"
    "Chapter08" = "08-Testing"
    "Chapter09" = "09-Deployment"
    "Chapter11" = "11-gRPC"
    "Chapter12" = "12-Logging"
    "Chapter14" = "14-Development"
}


# Path to the main folder containing the chapter folders
$mainFolderPath = "D:\Working\1.PROJECT\Development-Toolkit\java\framework\sample\Modern-API-Development-Spring"

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
