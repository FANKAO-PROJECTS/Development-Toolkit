# Define the mapping of chapter numbers to the transformed names
$chapterMap = @{
    "chapter2"  = "2-creating-destroying-objects"
    "chapter3"  = "3-common-methods"
    "chapter4"  = "4-classes-interfaces"
    "chapter5"  = "5-generics"
    "chapter6"  = "6-enums-annotations"
    "chapter7"  = "7-lambdas-streams"
    "chapter8"  = "8-methods"
    "chapter9"  = "9-general-programming"
    "chapter10" = "10-exceptions"
    "chapter11" = "11-concurrency"
    "chapter12" = "12-serialization"
}

# Path to the main folder containing the chapter folders
$mainFolderPath = "D:\Working\1.PROJECT\Development-Toolkit\java\core\effective-java-3e\src\effectivejava"

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
