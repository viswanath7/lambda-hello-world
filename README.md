# Objective 

The objective of this project is to show case the usage of spring cloud function in AWS using lambda functions.

[![lambda-hello-world-master Actions Status](https://github.com/viswanath7/lambda-hello-world/workflows/Build%20master/badge.svg)](https://github.com/viswanath7/lambda-hello-world/actions)

## Usage 

- Build the project by issuing the command `mvn clean package`
- Deploy the function to AWS as lambda function
    * Create a function
      
      ![create-function](./doc/img/1-create-function.png)
      
    * Select the function's jar package
      
      ![create-function](./doc/img/2-code-source.png)
      
      ![create-function](./doc/img/3-select-aws-jar.png)
    
    * Edit the runtime settings by specifying the spring handler function
      
      ![create-function](./doc/img/4-edit-runtime-settings.png)
      
      ![create-function](./doc/img/5-spring-handler-function.png)
      
    * Test the function and verify the result
      
      ![create-function](./doc/img/6-Test-function.png)
      
      ![create-function](./doc/img/7-verify-result.png)

