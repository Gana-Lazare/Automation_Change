//@Library('pipeline-utility-steps@integration') _ // space underscore means give evrything inside the library
pipeline {

    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
         stage('Performance Test') {

                    steps {
                   echo "performance"
          }

                }
        stage('UI-Automation-Test') {
            steps {
            echo "ui automation maven steps"
                //sh 'mvn clean test'
          //      bat 'mvn clean test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }


//------
//Create a new folder
//                     def folderName = "Performance Report"
//                                         def jobName = env.JOB_NAME
//                                         def stageName = env.STAGE_NAME
//
//                                         // Create the folder
//                                         folderName = folderName.replaceAll("[^a-zA-Z0-9_-]", "_") // Sanitize folder name
//                                         def folderPath = "${jobName}/${folderName}"
//
//                                         // Check if the folder already exists
//                                         def existingFolder = Jenkins.instance.getItemByFullName(folderPath)
//                                         if (existingFolder) {
//                                             echo "Folder '${folderPath}' already exists."
//                                         } else {
//                                             // Create the folder
//                                             def folder = Jenkins.instance.createProject(Folder, folderName)
//                                             folder.fullName = folderPath
//                                             folder.save()
//                                             echo "Folder '${folderPath}' created."
//                                             }